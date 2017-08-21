package pl.project.warehouse.interfaces;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

import pl.project.warehouse.entities.XProduct;

@Local
public interface XProductInterface {

	public abstract String add(XProduct product);
	
	public abstract XProduct find(@PathParam("idp") int idp);
	
	public abstract List<XProduct> get();
	
	public abstract String update(XProduct product);
	
	public abstract void delete(@PathParam("idp") int idp);
	
}
