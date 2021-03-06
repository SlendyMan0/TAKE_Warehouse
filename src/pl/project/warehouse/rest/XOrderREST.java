package pl.project.warehouse.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.project.warehouse.containers.Orders;
import pl.project.warehouse.ejb.XOrderEJB;
import pl.project.warehouse.entities.XOrder;
import pl.project.warehouse.interfaces.XOrderInterface;

@Path("/order")

@Consumes({ "application/xml" })
@Produces({ "application/xml" })

public class XOrderREST implements XOrderInterface {

	@EJB
	XOrderEJB bean;
	
	@Override
	@POST
	@Path("/create")
	public String add(XOrder order) {
		bean.create(order);
		return "Order created.\n";
	}
	
	@Override
	@GET
	@Path("/find/{ido}")
	public XOrder find(@PathParam("ido") int ido) {
		XOrder order = (XOrder) bean.find(ido);
		return order;
	}
	
	@Override
	@GET
	@Path("/get")
	public Orders get() {
		List<XOrder> lorder = bean.getXOrders();
		Orders orders = new Orders(lorder);

		return orders;
	}
	
	@Override
	@GET
	@Path("/find/client/{idc}")
	public Orders findByClient(@PathParam("idc") int idc) {
		List<XOrder> lorder = bean.findByClient(idc);
		Orders orders = new Orders(lorder);

		return orders;
	}

	@Override
	@POST
	@Path("/update")
	public String update(XOrder order) {
		try {
			bean.update(order);
			return "Order updated.\n!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Order NOT updated.\n";
		}
	}

	@Override
	@GET
	@Path("/delete/{ido}")
	public void delete(@PathParam("ido") int ido) {
		bean.delete(ido);
	}
}
