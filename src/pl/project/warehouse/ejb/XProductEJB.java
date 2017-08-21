package pl.project.warehouse.ejb;

import java.util.List;

import javax.persistence.Query;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.project.warehouse.entities.XProduct;

@Stateless
public class XProductEJB {

	@PersistenceContext(name="warehouse")
	EntityManager manager;
	
	public void create(XProduct obj) {
		manager.persist(obj);
	}

	public void delete(int id) {
		XProduct obj = manager.find(XProduct.class, id);
		manager.remove(obj);
	}


	public XProduct find(int id) {
		XProduct obj = manager.find(XProduct.class, id);
		return obj;
	}

	public List<XProduct> getXProducts() {
		Query q = manager.createQuery("select c from XProduct c");
		@SuppressWarnings("unchecked")
		List<XProduct> list = q.getResultList();
		return list;
	}
	
	public void update(XProduct obj) {
		obj = manager.merge(obj);
	}
}
