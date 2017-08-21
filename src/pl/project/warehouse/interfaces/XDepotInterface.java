package pl.project.warehouse.interfaces;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

import pl.project.warehouse.entities.XDepot;

@Local
public interface XDepotInterface {
	
	public abstract String add(XDepot depot);
	
	public abstract XDepot find(@PathParam("idd") int idd);
	
	public abstract List<XDepot> get();
	
	public abstract String update(XDepot depot);
	
	public abstract void delete(@PathParam("idd") int idd);

}
