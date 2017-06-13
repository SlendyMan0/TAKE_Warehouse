package pl.project.warehouse.ejb;

import java.util.List;

import javax.persistence.Query;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class XOrderEJB {

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

	public List<Object> get(String name) {
		String query = "select c from ";
		query += name;
		query += " c";
		
		Query q = manager.createQuery(query);
		@SuppressWarnings("unchecked")
		List<Object> list = q.getResultList();
		return list;
	}

	public void update(Object obj) {
		obj = manager.merge(obj);
	}
}
