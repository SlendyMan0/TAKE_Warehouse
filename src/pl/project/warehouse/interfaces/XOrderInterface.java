package pl.project.warehouse.interfaces;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

import pl.project.warehouse.entities.XOrder;

@Local
public interface XOrderInterface {

	public abstract String add(XOrder order);
	
	public abstract XOrder find(@PathParam("ido") int ido);
	
	public abstract List<XOrder> get();
	
	public abstract List<XOrder> findByClient(@PathParam("idc") int idc);
	
	public abstract String update(XOrder order);
	
	public abstract void delete(@PathParam("ido") int ido);
}
