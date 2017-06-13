package pl.project.warehouse.interfaces;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

import pl.project.warehouse.entities.XClient;

@Local
public interface XClientInterface {

	public abstract String add(XClient client);
	
	public abstract XClient find(@PathParam("idc") int idc);
	
	public abstract List<XClient> get();
	
	public abstract String update(XClient client);
	
	public abstract void delete(@PathParam("idc") int idc);
}
