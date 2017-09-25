package pl.project.warehouse.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.project.warehouse.containers.Depots;
import pl.project.warehouse.ejb.XDepotEJB;
import pl.project.warehouse.entities.XDepot;
import pl.project.warehouse.interfaces.XDepotInterface;

@Path("/depot")

@Consumes({ "application/xml" })
@Produces({ "application/xml" })

public class XDepotREST implements XDepotInterface {
	
	@EJB
	XDepotEJB bean;
	
	@Override
	@POST
	@Path("/create")
	public String add(XDepot depot) {
		bean.create(depot);
		return "Depot created.\n";
	}
	
	@Override
	@GET
	@Path("/find/{idd}")
	public XDepot find(@PathParam("idd") int idd) {
		XDepot depot = (XDepot) bean.find(idd);
		return depot;
	}
	
	@Override
	@GET
	@Path("/get")
	public Depots get() {
		List<XDepot> ldepot = bean.getXDepots();
		Depots depots = new Depots(ldepot);	

		return depots;
	}

	@Override
	@POST
	@Path("/update")
	public String update(XDepot depot) {
		try {
			bean.update(depot);
			return "Depot updated.\n!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Depot NOT updated.\n";
		}
	}

	@Override
	@GET
	@Path("/delete/{idd}")
	public void delete(@PathParam("idd") int idd) {
		bean.delete(idd);
	}

}
