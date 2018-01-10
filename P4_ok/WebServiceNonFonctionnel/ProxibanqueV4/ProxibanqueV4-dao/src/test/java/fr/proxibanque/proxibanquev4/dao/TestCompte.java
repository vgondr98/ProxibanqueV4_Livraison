package fr.proxibanque.proxibanquev4.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Compte;
import fr.proxibanque.proxibanquev4.domaine.Conseiller;
//import fr.proxibanque.proxibanquev4.domaine.CompteCourant;
//import fr.proxibanque.proxibanquev4.domaine.CompteEpargne;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import junit.framework.TestCase;

/**
 * @author Victor
 * Cette classe de test a été réalisé pour tester les méthodes de la dao associées aux comptes, les méthodes save et
 * findByNumcompte.
 * 
 * Avant le début du test (méthode setUp), le fichier spring-data.xml 
 * (fichier de configuration permettant d'utiliser spring-data) est chargé. Ce fichier utilise un second fichier
 * db.properties qui contient des infromations sur la configuration du projet Spring (C'est notament dans ce fichier qu'on
 * précise les infos sur la base de données).
 * Le ficher spring-data-xml précise égalemment quel EntityManager et TransactionManager doivent être utilisé.
 * Il précise enfin où sont les interfaces de la dao (spring-data se base sur un système d'interface qui implémente
 * une interface générique permmettant d'utiliser les méthodes de la dao sans avoir à implémenter ces méthodes dans
 * une classe de la DAO.
 * 
 * Une fois l'objet ClassPathXmlApplicationContext créer, il faut lui préciser le bean à récupérer.
 * Ici, il s'agit du bean compteDao qui est créé autmatiquement par spring-data.
 */
public class TestCompte extends TestCase{
	private Compte compte1;
	private Compte compte2;
	private Client client1;
	
	//private 
		private CompteDao springDao;
		private ClassPathXmlApplicationContext appContext;

		@Override
		protected void setUp() throws Exception {
			super.setUp();
		
		//Ce client doit déja exister en BD, s'il n'existe pas, le test ne passe pas
		client1 = new Client(1, "toto", "toto", "23 rue", "92250", "Paris", "06","to@to");
		compte1 = new Compte(125,"courant",(Date)null,14589, (Integer) null, 0.03, client1);
		
				
						
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (CompteDao) appContext.getBean("compteDao");
			}
		
		@Override
		protected void tearDown() throws Exception {
			super.tearDown();
			compte1 = null;
			appContext = null;
			springDao = null;
		}

		public void testSaveCompte() {
			springDao.save(compte1);
		}
		
		public void testfindbyNumCompte() {
			int i = 125;
			List<Compte> liste_ger = springDao.findByNumcompte(i);
			for (Compte g : liste_ger) {
				System.out.println(g.getTypeCompte());
			}
		}

		public void testfindbyIdcli() {
			int i = 1;
			List<Compte> liste_ger = springDao.findByIdcli_Idcli(i);
			for (Compte g : liste_ger) {
				System.out.println(g.getTypeCompte());
			}
		}
		
}
