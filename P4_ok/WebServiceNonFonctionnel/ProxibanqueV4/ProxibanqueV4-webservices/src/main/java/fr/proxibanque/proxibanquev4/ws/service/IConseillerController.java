package fr.proxibanque.proxibanquev4.ws.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.proxibanque.proxibanquev4.domaine.Conseiller;

public interface IConseillerController {
	
	public List<Conseiller> getAll();
	
	public String authentification(Conseiller cons);

}
