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
 * RestController réalise cela.
 * 
 * I)Méthode getAllClients
 * 
 * Dans la première méthode  sera activée par l'url /listeClients et la méthode GET. 
 * Elle n'a pas besoin de parmètres. Elle retourne un une liste de clients.
 *  L'échange de données avec la partie cliente de l'application se fera via un flux JSON (contenant la liste de clients).
 *  
 * I)Méthode Modif  
 * 
 * La Seconde méthode a besoin d'avoir un objet de type client qui arrivera via un flux 
 * JSON. Elle retourne un phrase via un flux JSON qui valide ou non la mise à jour. 
 * La méthode prend en compte le cas où le client est nul (null). Cette méthode est activée 
 * par l'url /modifClients et la méthode de requête POST.
 * 
 * III)Les propriétés
 * 
 * Les propriétés ont des types correpondants à celui des interfaces de la couche
 * dao. Cela est nécessaire parce que ce que nous voulons obtenir comme couplage
 * entre les couches est un couplage faible. Ces propriétés correspondent à des beans
 * parce qu'avec la balise jpa:repositories il a été indiqué dans le fichier spring-data.xml
 * qu'à chaque interface du package  fr.proxibanque.proxibanquev4.dao correspond un bean.
 * Afin que les propriétés declarées dans la présente classe correspondent à un bean, il
 * est réalisé de l'autocablage avec l'annotation @Autowired.
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
		String phrase = "mise à jour non réalisée";
		if(client!=null) {
			phrase = "mise à jour effectuée";
			clientdao.save(client);
			return phrase;
		}else {
			return phrase;
		}
	}

}
