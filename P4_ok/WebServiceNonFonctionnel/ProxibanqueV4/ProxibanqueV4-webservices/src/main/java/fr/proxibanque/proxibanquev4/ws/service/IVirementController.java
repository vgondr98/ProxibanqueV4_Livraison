package fr.proxibanque.proxibanquev4.ws.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.proxibanque.proxibanquev4.domaine.Compte;
import fr.proxibanque.proxibanquev4.domaine.Virement;

public interface IVirementController {
	
	public String Modif(Compte compte_debiteur, Compte compte_crediteur, Virement virement);
	
	public List<Virement> getAllVirements() ;

}
