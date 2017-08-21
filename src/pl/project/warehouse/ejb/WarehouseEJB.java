package pl.project.warehouse.ejb;

import java.util.List;

import javax.persistence.Query;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.project.warehouse.entities.*;

@Stateless
public class WarehouseEJB {

	@PersistenceContext(name="warehouse")
	EntityManager manager;
	
	public void create(Object obj) {
		manager.persist(obj);
	}

	public void delete(int id) {
		Object obj = manager.find(Object.class, id);
		manager.remove(obj);
	}


	public Object find(int id) {
		Object obj = manager.find(Object.class, id);
		return obj;
	}

	public List<XOrder> getXOrders() {
		Query q = manager.createQuery("select c from XOrder c");
		@SuppressWarnings("unchecked")
		List<XOrder> list = q.getResultList();
		return list;
	}
	
	public List<XClient> getXClients() {
		Query q = manager.createQuery("select c from XClient c");
		@SuppressWarnings("unchecked")
		List<XClient> list = q.getResultList();
		return list;
	}
	
	public List<XDepot> getXDepots() {
		Query q = manager.createQuery("select c from XDepot c");
		@SuppressWarnings("unchecked")
		List<XDepot> list = q.getResultList();
		return list;
	}

	public List<XProduct> getXProducts() {
		Query q = manager.createQuery("select c from XProduct c");
		@SuppressWarnings("unchecked")
		List<XProduct> list = q.getResultList();
		return list;
	}
	
	public List<XProductLexicon> getXProductLexicons() {
		Query q = manager.createQuery("select c from XProductLexicon c");
		@SuppressWarnings("unchecked")
		List<XProductLexicon> list = q.getResultList();
		return list;
	}
	
	public void update(Object obj) {
		obj = manager.merge(obj);
	}
}
