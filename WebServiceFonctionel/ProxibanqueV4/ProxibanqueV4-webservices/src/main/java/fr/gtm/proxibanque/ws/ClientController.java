package fr.gtm.proxibanque.ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.gtm.proxibanque.dao.ClientDao;
import fr.gtm.proxibanque.domaine.Client;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

	@Autowired
	private ClientDao clientDao;
	
	@RequestMapping(value = "listeClient/{login}", method = RequestMethod.GET, produces = "application/json")
	public List<Client> getListeClientByCons(@PathVariable("login") String login) {
		
		List<Client> listeCientJson = null;
		listeCientJson = clientDao.findByIdcons_Logincons(login);
		return listeCientJson;
	}
	
	@RequestMapping(value = "conseiller/listeclients", method = RequestMethod.GET, produces = "application/json")
	public List<Client> getAll() {
		List<Client> liste_cli = clientDao.findAll();
		return liste_cli;
	}
	

	/**
	 * Ce webservice permet de retourner la liste des clients d'un conseiller donné.
	 * 
	 * @param login,
	 *            le login du conseiller
	 * @return Collection<Client>, tous les clients du conseiller
	 */
	/*@RequestMapping(value = "listeClientByCons", method = RequestMethod.GET, produces = "application/json")
	public List<Client> getListeClientByCons() {
		List<Client> liste_cli = clientDao.findByIdcons_Idcons(1);
		return liste_cli;
	}
	
	@RequestMapping(value = "listeAllClient", method = RequestMethod.GET, produces = "application/json")
	public List<Client> getAll() {
		List<Client> liste_cli = clientDao.findAll();
		return liste_cli;*/
	
	
	}