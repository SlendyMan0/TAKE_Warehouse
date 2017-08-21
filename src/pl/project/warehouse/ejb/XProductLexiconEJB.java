package pl.project.warehouse.ejb;

import java.util.List;

import javax.persistence.Query;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.project.warehouse.entities.XProductLexicon;

@Stateless
public class XProductLexiconEJB {

	@PersistenceContext(name="warehouse")
	EntityManager manager;
	
	public void create(XProductLexicon obj) {
		manager.persist(obj);
	}

	public void delete(int id) {
		XProductLexicon obj = manager.find(XProductLexicon.class, id);
		manager.remove(obj);
	}


	public XProductLexicon find(int id) {
		XProductLexicon obj = manager.find(XProductLexicon.class, id);
		return obj;
	}

	public List<XProductLexicon> getXProductLexicons() {
		Query q = manager.createQuery("select c from XProductLexicon c");
		@SuppressWarnings("unchecked")
		List<XProductLexicon> list = q.getResultList();
		return list;
	}
	
	public void update(XProductLexicon obj) {
		obj = manager.merge(obj);
	}
}
