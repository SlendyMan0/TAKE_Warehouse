package pl.project.warehouse.interfaces;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

import pl.project.warehouse.entities.Order;

@Local
public interface OrderInterface {

	public abstract void add(Order order);
	
	public abstract Order find(@PathParam("id") int id);
	
	public abstract void update(Order order);
	
	public abstract void delete(@PathParam("id") int id);
}
