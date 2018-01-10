package fr.proxibanque.proxibanquev4.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.proxibanque.proxibanquev4.dao.ConseillerDao;
import fr.proxibanque.proxibanquev4.dao.VirementDao;
import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.domaine.Virement;

/**
 * @author Joinel
 * 
 * Cette classe fait partie de la couche Service. 
 * 
 * Le Web Service implement une interface.
 * 
 * Cette classe est un bean qui s'appellera conseillerController parce que l'annotation 
 * RestController r�alise cela.
 * 
 * I)M�thode getAll
 * 
 * La premi�re m�thode  sera activ�e par l'url /listeConseiller et la m�thode GET. 
 * Elle n'a pas besoin de parm�tres. Elle retourne un une liste de conseillers.
 *  L'�change de donn�es avec la partie cliente de l'application se fera via un flux JSON 
 *  (contenant la liste de conseiller).
 *  
 * I)M�thode authentification 
 *  
 * La Seconde m�thode a besoin d'avoir un objet de type conseiller 
 * (contenant un mot de passe et une mise � jour) qui arrivera via un flux 
 * JSON. Elle retourne un phrase via un flux JSON qui valide ou non l'authentification. 
 * Cette m�thode est activ�e par l'url /authConseiller et la m�thode de requ�te POST.
 * La m�thode v�rifie que l'objet de type conseiller n'est pas nul, 
 * essaye de trouver un client en base de donn�es et compare le mot de passe ins�r� avec celui qui est 
 * en base
 * 
 * III)Les propri�t�s
 * 
 * Les propri�t�s ont des types correpondants � celui des interfaces de la couche
 * dao. Cela est n�cessaire parce que ce que nous voulons obtenir comme couplage
 * entre les couches est un couplage faible. Ces propri�t�s correspondent � des beans
 * parce qu'avec la balise jpa:repositories il a �t� indiqu� dans le fichier spring-data.xml
 * qu'� chaque interface du package  fr.proxibanque.proxibanquev4.dao correspond un bean.
 * Afin que les propri�t�s declar�es dans la pr�sente classe correspondent � un bean, il
 * est r�alis� de l'autocablage avec l'annotation @Autowired
 * 
 * 
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ConseillerController implements IConseillerController{
	
	@Autowired
	ConseillerDao conseillerDao;
	
	@Autowired
	VirementDao virementDao;
	
	public ConseillerDao getConseillerDao() {
		return conseillerDao;
	}

	
	public void setConseillerDao(ConseillerDao conseillerDao) {
		this.conseillerDao = conseillerDao;
	}

	public VirementDao getVirementDao() {
		return virementDao;
	}

	
	public void setVirementDao(VirementDao virementDao) {
		this.virementDao = virementDao;
	}

	@RequestMapping(value = "/listeConseiller", method = RequestMethod.GET, produces = "application/json")
	public List<Conseiller> getAll() {
		return conseillerDao.findAll();
	}
	
	@RequestMapping(value = "/authConseiller", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String authentification(Conseiller cons) {
		String phrase = "echec authentification";
		if(cons!=null) {
		String login_insert = cons.getLogincons();
		String password_insert = cons.getPassword();
		Conseiller cons_Test = conseillerDao.findByLogincons(login_insert);
		if(cons_Test!=null) {
			if((cons_Test.getPassword()).equals(password_insert)) {
				phrase = "authentification reussie";
				return phrase;
			}else {
				return phrase;
			}
		}else {
			return phrase;
		}
		}else {
			return phrase;
			
		}
		
	}
	


}
