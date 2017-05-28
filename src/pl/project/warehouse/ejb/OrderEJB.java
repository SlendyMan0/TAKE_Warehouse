package pl.project.warehouse.ejb;

import java.util.List;

import javax.persistence.Query;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.project.warehouse.entities.Order;

@Stateless
public class OrderEJB {

	@PersistenceContext(name="warehouse")
	EntityManager manager;
	
	public void create(Order order) {
		manager.persist(order);
	}

	public void delete(int id) {
		Order order = manager.find(Order.class, id);
		manager.remove(order);
	}


	public Order find(int id) {
		Order order = manager.find(Order.class, id);
		return order;
	}

	/*public List<Order> get() {
		Query q = manager.createQuery("select c from Order c");
		@SuppressWarnings("unchecked")
		List<Order> list = q.getResultList();
		return list;
	}*/

	public void update(Order order) {
		order = manager.merge(order);
	}
}
