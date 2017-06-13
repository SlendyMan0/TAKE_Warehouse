package pl.project.warehouse.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.project.warehouse.ejb.XOrderEJB;
import pl.project.warehouse.entities.XClient;
import pl.project.warehouse.interfaces.XClientInterface;

@Path("/client")

@Consumes({ "application/xml" })
@Produces({ "application/xml" })

public class XClientREST implements XClientInterface {

	@EJB
	XOrderEJB bean;
	
	@Override
	@POST
	@Path("/create")
	public String add(XClient client) {
		bean.create(client);
		return "Client created.\n";
	}
	
	@Override
	@GET
	@Path("/find/{idc}")
	public XClient find(@PathParam("idc") int idc) {
		XClient client = (XClient) bean.find(idc);
		return client;
	}
	
	@Override
	@GET
	@Path("/get")
	@SuppressWarnings("unchecked")
	public List<XClient> get() {
		List<XClient> lclient = new ArrayList<XClient>();
		String name = this.getClass().getSimpleName();
		System.out.println(name);
		lclient = (List<XClient>)(Object) bean.get(name.substring(0, name.length() - 4));
		return lclient;
	}

	@Override
	@POST
	@Path("/update")
	public String update(XClient client) {
		try {
			bean.update(client);
			return "Client updated.\n!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Client NOT updated.\n";
		}
	}

	@Override
	@GET
	@Path("/delete/{idc}")
	public void delete(@PathParam("idc") int idc) {
		bean.delete(idc);
	}
}