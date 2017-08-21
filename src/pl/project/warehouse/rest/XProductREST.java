/*package pl.project.warehouse.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.project.warehouse.ejb.WarehouseEJB;
import pl.project.warehouse.entities.XProduct;
import pl.project.warehouse.interfaces.XProductInterface;

@Path("/product")

@Consumes({ "application/xml" })
@Produces({ "application/xml" })

public class XProductREST implements XProductInterface{

	@EJB
	WarehouseEJB bean;
	
	@Override
	@POST
	@Path("/create")
	public String add(XProduct product) {
		bean.create(product);
		return "Product created.\n";
	}
	
	@Override
	@GET
	@Path("/find/{idp}")
	public XProduct find(@PathParam("idp") int idp) {
		XProduct product = (XProduct) bean.find(idp);
		return product;
	}
	
	@Override
	@GET
	@Path("/get")
	@SuppressWarnings("unchecked")
	public List<XProduct> get() {
		List<XProduct> lproduct = bean.getXProducts();
		List<XProduct> xproducts = new ArrayList<XProduct>();	
		xproducts = lproduct;

		return xproducts;
	}

	@Override
	@POST
	@Path("/update")
	public String update(XProduct product) {
		try {
			bean.update(product);
			return "Product updated.\n!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Product NOT updated.\n";
		}
	}

	@Override
	@GET
	@Path("/delete/{idp}")
	public void delete(@PathParam("idp") int idp) {
		bean.delete(idp);
	}
}*/
