package pl.project.warehouse.interfaces;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

import pl.project.warehouse.containers.Products;
import pl.project.warehouse.entities.XProduct;

@Local
public interface XProductInterface {

	public abstract String add(XProduct product);
	
	public abstract XProduct find(@PathParam("idp") int idp);
	
	public abstract Products get();
	
	public abstract String update(XProduct product);
	
	public abstract void delete(@PathParam("idp") int idp);
	
	public abstract Products findByType(@PathParam("idl") int idl);
	
	public abstract Products findByDepot(@PathParam("idd") int idd);
	
	public abstract Products findByOrder(@PathParam("ido") int ido);
	
}
