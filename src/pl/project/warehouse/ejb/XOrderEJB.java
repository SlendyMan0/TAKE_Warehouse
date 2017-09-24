package pl.project.warehouse.ejb;

import java.util.List;

import javax.persistence.Query;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.project.warehouse.entities.XOrder;

@Stateless
public class XOrderEJB {

	@PersistenceContext(name="warehouse")
	EntityManager manager;
	
	public void create(XOrder obj) {
		manager.persist(obj);
	}

	public void delete(int id) {
		XOrder obj = manager.find(XOrder.class, id);
		manager.remove(obj);
	}


	public XOrder find(int id) {
		XOrder obj = manager.find(XOrder.class, id);
		return obj;
	}

	public List<XOrder> getXOrders() {
		Query q = manager.createQuery("select c from XOrder c");
		@SuppressWarnings("unchecked")
		List<XOrder> list = q.getResultList();
		
		return list;
	}
	
	public void update(XOrder obj) {
		obj = manager.merge(obj);
	}
	
	public List<XOrder> findByClient(int idc) {
		Query q = manager.createQuery("select c from XOrder c where c.client.idc like :idc");
		q.setParameter("idc", idc);
		@SuppressWarnings("unchecked")
		List<XOrder> list = q.getResultList();
		
		return list;
	}
}
