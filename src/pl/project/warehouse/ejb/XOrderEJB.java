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
	
	public void create(XOrder xorder) {
		manager.persist(xorder);
	}

	public void delete(int id) {
		XOrder xorder = manager.find(XOrder.class, id);
		manager.remove(xorder);
	}


	public XOrder find(int id) {
		XOrder xorder = manager.find(XOrder.class, id);
		return xorder;
	}

	public List<XOrder> get() {
		Query q = manager.createQuery("select c from XOrder c");
		@SuppressWarnings("unchecked")
		List<XOrder> list = q.getResultList();
		return list;
	}

	public void update(XOrder xorder) {
		xorder = manager.merge(xorder);
	}
}
