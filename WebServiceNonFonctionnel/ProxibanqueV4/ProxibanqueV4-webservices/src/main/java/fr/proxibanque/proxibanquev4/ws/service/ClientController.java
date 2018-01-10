package fr.proxibanque.proxibanquev4.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.proxibanque.proxibanquev4.dao.ClientDao;
import fr.proxibanque.proxibanquev4.domaine.Client;


/**
 * @author Joinel
 * 
 * Cette classe fait partie de la couche Service. 
 * 
 * Le Web Service implement une interface.
 * 
 * Cette classe est un bean qui s'appellera clientController parce que l'annotation 
 * RestController r�alise cela.
 * 
 * I)M�thode getAllClients
 * 
 * Dans la premi�re m�thode  sera activ�e par l'url /listeClients et la m�thode GET. 
 * Elle n'a pas besoin de parm�tres. Elle retourne un une liste de clients.
 *  L'�change de donn�es avec la partie cliente de l'application se fera via un flux JSON (contenant la liste de clients).
 *  
 * I)M�thode Modif  
 * 
 * La Seconde m�thode a besoin d'avoir un objet de type client qui arrivera via un flux 
 * JSON. Elle retourne un phrase via un flux JSON qui valide ou non la mise � jour. 
 * La m�thode prend en compte le cas o� le client est nul (null). Cette m�thode est activ�e 
 * par l'url /modifClients et la m�thode de requ�te POST.
 * 
 * III)Les propri�t�s
 * 
 * Les propri�t�s ont des types correpondants � celui des interfaces de la couche
 * dao. Cela est n�cessaire parce que ce que nous voulons obtenir comme couplage
 * entre les couches est un couplage faible. Ces propri�t�s correspondent � des beans
 * parce qu'avec la balise jpa:repositories il a �t� indiqu� dans le fichier spring-data.xml
 * qu'� chaque interface du package  fr.proxibanque.proxibanquev4.dao correspond un bean.
 * Afin que les propri�t�s declar�es dans la pr�sente classe correspondent � un bean, il
 * est r�alis� de l'autocablage avec l'annotation @Autowired.
 * 
 * 
 */
@RestController("clientController")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController implements IClientController{
	
	@Autowired
	private ClientDao clientdao;
	
	
	public ClientDao getClientdao() {
		return clientdao;
	}

	
	public void setClientdao(ClientDao clientdao) {
		this.clientdao = clientdao;
	}

	@RequestMapping(value = "/listeClients", method = RequestMethod.GET, produces = "application/json")
	public List<Client> getAllClients() {
		return clientdao.findAll();
	}
	
	@RequestMapping(value = "/modifClients", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public String Modif(Client client) {
		String phrase = "mise � jour non r�alis�e";
		if(client!=null) {
			phrase = "mise � jour effectu�e";
			clientdao.save(client);
			return phrase;
		}else {
			return phrase;
		}
	}

}
