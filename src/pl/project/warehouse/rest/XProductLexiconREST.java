/*package pl.project.warehouse.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pl.project.warehouse.ejb.WarehouseEJB;
import pl.project.warehouse.entities.XClient;
import pl.project.warehouse.entities.XProduct;
import pl.project.warehouse.entities.XProductLexicon;
import pl.project.warehouse.interfaces.XProductLexiconInterface;

@Path("/lexicon")

@Consumes({ "application/xml" })
@Produces({ "application/xml" })
public class XProductLexiconREST implements XProductLexiconInterface {

	@EJB
	WarehouseEJB bean;

	@Override
	@POST
	@Path("/create")
	public String add(XProductLexicon lexicon) {
		bean.create(lexicon);
		return "Lexicon created.\n";
	}

	@Override
	@GET
	@Path("/find/{idl}")
	public XProductLexicon find(@PathParam("idl") int idl) {
		XProductLexicon lexicon = (XProductLexicon) bean.find(idl);
		return lexicon;
	}
	
	@Override
	@GET
	@Path("/get")
	@SuppressWarnings("unchecked")
	public List<XProductLexicon> get() {
		List<XProductLexicon> llexicon = bean.getXProductLexicons();
		List<XProductLexicon> xlexicons = new ArrayList<XProductLexicon>();	
		xlexicons = llexicon;

		return xlexicons;
	}

	@Override
	@POST
	@Path("/update")
	public String update(XProductLexicon lexicon) {
		try {
			bean.update(lexicon);
			return "Lexicon updated.\n!";
		} catch (Exception e) {
			e.printStackTrace();
			return "Lexicon NOT updated.\n";
		}
	}

	@Override
	@GET
	@Path("/delete/{idl}")
	public void delete(@PathParam("idl") int idl) {
		bean.delete(idl);
	}

}*/
