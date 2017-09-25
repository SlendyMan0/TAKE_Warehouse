package pl.project.warehouse.ejb;

import java.util.List;

import javax.persistence.Query;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.project.warehouse.entities.XClient;

@Stateless
public class XClientEJB {

	@PersistenceContext(name="warehouse")
	EntityManager manager;
	
	public void create(XClient obj) {
		manager.persist(obj);
	}

	public void delete(int id) {
		XClient obj = manager.find(XClient.class, id);
		manager.remove(obj);
	}


	public XClient find(int id) {
		XClient obj = manager.find(XClient.class, id);
		//for(XOrder o:obj.getXOrders()) System.out.println(o.getIdo());
		return obj;
	}
	
	public List<XClient> getXClients() {
		Query q = manager.createQuery("select c from XClient c");
		@SuppressWarnings("unchecked")
		List<XClient> list = q.getResultList();
		//for(XClient obj:list) {
		//	for(XOrder o:obj.getXOrders()) {
		//		System.out.println(obj.getCompanyName()+" > "+o.getIdo());
		//	}
		//}

		return list;
	}
	
	public void update(XClient obj) {
		obj = manager.merge(obj);
	}
}
