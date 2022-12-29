package tn.esprit.elife.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.elife.persisstance.Client;
import tn.esprit.elife.persisstance.ClientRepository;
import tn.esprit.elife.service.interfaces.IClientServices;

@Service
@Slf4j
public class ClientService implements IClientServices{
	@Autowired
	ClientRepository clientRep;

	@Override
	public List<Client> retrieAllClient() {
		
		return (List<Client>)clientRep.findAll();
	}

	@Override
	public Client addClient(Client c) {
		log.info("début d'éxecution de la méthode addClient");
		clientRep.save(c);
		log.info("fin d'éxecution de la méthode addClient");
		return c;
	}

	@Override
	public void deleteClient(long id) {
		log.info("début d'éxecution de la méthode deleteClient");
	     clientRep.deleteById(id);
		log.info("fin d'éxecution de la méthode deleteClient");
		
	}

	@Override
	public Client updateClient(Client c) {
		log.info("début d'éxecution de la méthode updateClient");
	    clientRep.save(c);
	   log.info("fin d'éxecution de la méthode updateClient");
	return c;
	}

	@Override
	public Client retrieveClient(long id) {
		
		return   clientRep.findById(id).get() ;
	}

}
