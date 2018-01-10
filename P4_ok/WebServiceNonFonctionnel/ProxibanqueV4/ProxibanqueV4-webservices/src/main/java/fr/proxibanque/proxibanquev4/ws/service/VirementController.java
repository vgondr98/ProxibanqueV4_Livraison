package fr.proxibanque.proxibanquev4.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.proxibanque.proxibanquev4.dao.CompteDao;
import fr.proxibanque.proxibanquev4.dao.VirementDao;
import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Compte;
import fr.proxibanque.proxibanquev4.domaine.Virement;

/**
 * @author Joinel
 * 
 * Cette classe fait partie de la couche Service. 
 * 
 * Le Web Service implement une interface.
 * 
 * Cette classe est un bean qui s'appellera conseillerController parce que l'annotation 
 * RestController réalise cela.
 * 
 * I)Méthode Modif
 * 
 * Dans la première méthode  sera activée par l'url /virement et la méthode POST. 
 * Elle a besoin de de trois objets:
 * - un objet de type virement
 * - deux objets de type compte
 * Elle discrimine les cas ou l'un des trois objets est nul et si aucun d'entre eux n'est nul
 * alors la méthode enregistre les modifications en base.
 *  
 * I)Méthode getAllVirements 
 *  
 * La Seconde méthode est activée par l'url /listeVirements et la méthode GET.
 * Il y a l'inscription dans une liste de tous les virements
 * Une liste contenant tous les virements est renvoyé via un flux JSON.
 * 
  * III)Les propriétés
 * 
 * Les propriétés ont des types correpondants à celui des interfaces de la couche
 * dao. Cela est nécessaire parce que ce que nous voulons obtenir comme couplage
 * entre les couches est un couplage faible. Ces propriétés correspondent à des beans
 * parce qu'avec la balise jpa:repositories il a été indiqué dans le fichier spring-data.xml
 * qu'à chaque interface du package  fr.proxibanque.proxibanquev4.dao correspond un bean.
 * Afin que les propriétés declarées dans la présente classe correspondent à un bean, il
 * est réalisé de l'autocablage avec l'annotation @Autowired
 *  
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VirementController implements IVirementController{

	@Autowired
	VirementDao virementDao;
	
	@Autowired
	CompteDao compteDao;
	
	public VirementDao getVirementDao() {
		return virementDao;
	}

	
	public void setVirementDao(VirementDao virementDao) {
		this.virementDao = virementDao;
	}

	public CompteDao getCompteDao() {
		return compteDao;
	}

	
	public void setCompteDao(CompteDao compteDao) {
		this.compteDao = compteDao;
	}

	@RequestMapping(value = "/virement", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public String Modif(Compte compte_debiteur, Compte compte_crediteur, Virement virement) {
		String phrase = "virement refusé";
		if ((compte_crediteur!=null)&&(compte_crediteur!=null)&&(virement!=null)) {
		virementDao.save(virement);
		compteDao.save(compte_debiteur);
		compteDao.save(compte_crediteur);
		phrase = "virement effectue";
		return phrase;
		}else {
			return phrase;
		}
	}
	
	@RequestMapping(value = "/listeVirements", method = RequestMethod.GET, produces = "application/json")
	public List<Virement> getAllVirements() {
		List<Virement> liste_Virement = null;
		liste_Virement =  virementDao.findAll();
		return liste_Virement;
	}
	
	
}
