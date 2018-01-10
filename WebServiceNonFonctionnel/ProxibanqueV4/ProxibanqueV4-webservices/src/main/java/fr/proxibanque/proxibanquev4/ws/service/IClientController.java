package fr.proxibanque.proxibanquev4.ws.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.proxibanque.proxibanquev4.domaine.Client;

public interface IClientController {
	
	
	public List<Client> getAllClients();
	
	public String Modif(Client client);
}
