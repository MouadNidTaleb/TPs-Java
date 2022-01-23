package ma.gov.tp8.Services;


import ma.gov.tp8.DAO.IClientDAO;
import ma.gov.tp8.models.Client;

public class ClientService implements IClientService {
	
	IClientDAO clientDAO;
	
	
	
	public ClientService() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IClientDAO getClientDAO() {
		return clientDAO;
	}


	public ClientService(IClientDAO clientDAO) {
		super();
		this.clientDAO = clientDAO;
	}

	
	public Client save(Client clt) {
		return clientDAO.save(clt);
	}

}
