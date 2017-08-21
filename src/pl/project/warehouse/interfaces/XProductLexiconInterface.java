package pl.project.warehouse.interfaces;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.PathParam;

import pl.project.warehouse.entities.XProductLexicon;

@Local
public interface XProductLexiconInterface {
	
	public abstract String add(XProductLexicon lexicon);
	
	public abstract XProductLexicon find(@PathParam("idl") int idl);
	
	public abstract List<XProductLexicon> get();
	
	public abstract String update(XProductLexicon lexicon);
	
	public abstract void delete(@PathParam("idl") int idl);

}
