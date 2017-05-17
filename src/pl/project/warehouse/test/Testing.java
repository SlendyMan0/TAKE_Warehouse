package pl.project.warehouse.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pl.project.warehouse.entities.Client;

public class Testing {
	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("warehouse");
		EntityManager manager = managerFactory.createEntityManager(); 
		manager.getTransaction().begin();
		
		Client client = new Client();
		client.setSurname("Kowalsky");
		manager.persist(client);
		
		
		
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
		
	}
}
