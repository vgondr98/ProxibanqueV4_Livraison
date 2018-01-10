package fr.gtm.proxibanque.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	
		private String monjson = "ca marche";

		/**
		 * Ce webservice permet de retourner la liste des comptes des clients d'un
		 * conseiller identifie. Il ne prend un login en paramètre d'entree
		 * 
		 * @param login
		 * @return List<Compte>, la liste des comptes des clients associes à un
		 *         conseiller
		 */
		@RequestMapping("/json")
		public String getText() {
			return monjson;
		}


}
