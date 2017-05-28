package pl.project.warehose.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.project.warehouse.ejb.OrderEJB;
import pl.project.warehouse.entities.Order;
import pl.project.warehouse.interfaces.OrderInterface;

@Path("/order")

@Consumes({ "application/xml" })
@Produces({ "application/xml" })

public class OrderREST implements OrderInterface {

	@EJB
	OrderEJB bean;
	
	@Override
	@POST
	@Path("/add")
	public void add(Order order) {
		bean.create(order);
	}
	
	@Override
	@GET
	@Path("/find/{idc}")
	public Order find(@PathParam("id") int id) {
		Order order = bean.find(id);
		return order;
	}
	
	/*@Override
	@GET
	@Path("/get")
	public Cars get() {
		List<Car> lcars = bean.get();
		Cars cars = new Cars(lcars);
		return cars;
	}*/

	@Override
	@POST
	@Path("/update")
	public void update(Order order) {
		try {
			bean.update(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@GET
	@Path("/delete/{idc}")
	public void delete(@PathParam("id") int id) {
		bean.delete(id);
	}
}
