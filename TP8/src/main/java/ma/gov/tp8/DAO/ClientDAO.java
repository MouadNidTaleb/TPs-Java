package ma.gov.tp8.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ma.gov.tp8.models.Client;

public class ClientDAO implements IClientDAO {
	
	IClientDAO clientDAO;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("clients");
	EntityManager em = emf.createEntityManager();

	
	  public ClientDAO() { System.out.println("Call ClientRepositoryImpl ...."); }
	 
	public IClientDAO getClientDAO() {
		return clientDAO;
	}

	public void setClientDAO(IClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	public Client save(Client c) {
		System.out.println("DAO Layer : ClientRepositoryImpl Level");
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return null;
	}

}
