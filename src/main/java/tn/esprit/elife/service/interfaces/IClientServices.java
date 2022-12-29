package tn.esprit.elife.service.interfaces;

import java.util.List;

import tn.esprit.elife.persisstance.Client;

public interface IClientServices {
	List <Client> retrieAllClient();
	Client addClient (Client c);
	void deleteClient(long id);
	Client updateClient (Client c);
	Client retrieveClient (long id);
	

}
