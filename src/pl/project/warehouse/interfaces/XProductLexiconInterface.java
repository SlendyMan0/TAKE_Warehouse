package pl.project.warehouse.interfaces;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

import pl.project.warehouse.containers.ProductLexicons;
import pl.project.warehouse.entities.XProductLexicon;

@Local
public interface XProductLexiconInterface {
	
	public abstract String add(XProductLexicon lexicon);
	
	public abstract XProductLexicon find(@PathParam("idl") int idl);
	
	public abstract ProductLexicons get();
	
	public abstract String update(XProductLexicon lexicon);
	
	public abstract void delete(@PathParam("idl") int idl);

}
