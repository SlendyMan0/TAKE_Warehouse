package pl.project.warehouse.ejb;

import java.util.List;

import javax.persistence.Query;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.project.warehouse.entities.XDepot;

@Stateless
public class XDepotEJB {

	@PersistenceContext(name="warehouse")
	EntityManager manager;
	
	public void create(XDepot obj) {
		manager.persist(obj);
	}

	public void delete(int id) {
		XDepot obj = manager.find(XDepot.class, id);
		manager.remove(obj);
	}


	public XDepot find(int id) {
		XDepot obj = manager.find(XDepot.class, id);
		return obj;
	}
	
	public List<XDepot> getXDepots() {
		Query q = manager.createQuery("select c from XDepot c");
		@SuppressWarnings("unchecked")
		List<XDepot> list = q.getResultList();
		return list;
	}
	
	public void update(XDepot obj) {
		obj = manager.merge(obj);
	}
}
