package pl.project.warehouse.interfaces;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

import pl.project.warehouse.containers.Depots;
import pl.project.warehouse.entities.XDepot;

@Local
public interface XDepotInterface {
	
	public abstract String add(XDepot depot);
	
	public abstract XDepot find(@PathParam("idd") int idd);
	
	public abstract Depots get();
	
	public abstract String update(XDepot depot);
	
	public abstract void delete(@PathParam("idd") int idd);

}
