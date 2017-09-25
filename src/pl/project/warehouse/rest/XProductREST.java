package pl.project.warehouse.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.project.warehouse.containers.Products;
import pl.project.warehouse.ejb.XProductEJB;
import pl.project.warehouse.entities.XProduct;
import pl.project.warehouse.interfaces.XProductInterface;

@Path("/product")

@Consumes({ "application/xml" })
@Produces({ "application/xml" })

public class XProductREST implements XProductInterface{

	@EJB
	XProductEJB bean;
	
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
	public Products get() {
		List<XProduct> lproduct = bean.getXProducts();
		Products products = new Products(lproduct);

		return products;
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
	
	@Override
	@GET
	@Path("/find/lexicon/{idt}")
	public Products findByType(@PathParam("idt") int idt) {
		List<XProduct> lproduct = bean.findByType(idt);
		Products products = new Products(lproduct);

		return products;
	}
	
	@Override
	@GET
	@Path("/find/depot/{idd}")
	public Products findByDepot(@PathParam("idd") int idd) {
		List<XProduct> lproduct = bean.findByDepot(idd);
		Products products = new Products(lproduct);

		return products;
	}
	
	@Override
	@GET
	@Path("/find/order/{ido}")
	public Products findByOrder(@PathParam("ido") int ido) {
		List<XProduct> lproduct = bean.findByOrder(ido);
		Products products = new Products(lproduct);

		return products;
	}
}
