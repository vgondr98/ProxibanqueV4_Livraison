package fr.proxibanque.proxibanquev4.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.dao.ClientDao;
import fr.proxibanque.proxibanquev4.domaine.Client;

import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import junit.framework.TestCase;


/**
 * @author Victor
 * Cette classe de test a été réalisé pour tester les méthodes de la dao associées aux clients, les méthodes save,
 * findByNomcli  et findByIdcli.
 * 
 * Avant le début du test (méthode setUp), le fichier spring-data.xml 
 * (fichier de configuration permettant d'utiliser spring-data) est chargé. Ce fichier utilise un second fichier
 * db.properties qui contient des infromations sur la configuration du projet Spring (C'est notament dans ce fichier 
 * qu'on précise les infos sur la base de données).
 * Le ficher spring-data-xml précise égalemment quel EntityManager et TransactionManager doivent être utilisé.
 * Il précise enfin où sont les interfaces de la dao (spring-data se base sur un système d'interface qui implémente
 * une interface générique permmettant d'utiliser les méthodes de la dao sans avoir à implémenter ces méthodes dans
 * une classe de la DAO.
 * 
 * Une fois l'objet ClassPathXmlApplicationContext créer, il faut lui préciser le bean à récupérer.
 * Ici, il s'agit du bean clientDao qui est créé automatiquement par spring-data.
 */
public class TestClient extends TestCase{
	
	private Client client1;

	//private Collection<Compte> listeCompte1;
	private Conseiller conseiller1;
	
	//private 
	private ClientDao springDao;
	private ClassPathXmlApplicationContext appContext;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		//conseiller1 = new Conseiller((Integer)1,"pdupond", "David","tata","Gerard");
		
		client1 = new Client(18,"kevin","Touzet","23 rue de la frite","92500","paris","0147874597","patate@patate", conseiller1);
		
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (ClientDao) appContext.getBean("clientDao");
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		client1 = null;
		appContext = null;
		springDao = null;
	}

	public void testSaveClient() {
		springDao.save(client1);
	}
	
	
	
	
	public void testfindAll() {
		List<Client> liste_cli = springDao.findAll();
		for (Client c : liste_cli) {
			System.out.println(c.getNomcli());
			
		}
	}
	
	public void testfindbyIdcli() {
		int i = 1;
		Client cli = springDao.findByIdcli(i);
		System.out.println(cli.getNomcli());
		
	}
		
	public void testfindbyIdcons() {
		int i = 1;
		List<Client> liste_ger = springDao.findByIdcons_Idcons(i);
		for (Client g : liste_ger) {
			System.out.println(g.getNomcli());
		}
	}
	

	public void testfindbyNomcli() {
		String i ="toto";
		List<Client> liste_ger = springDao.findByNomcli(i);
		for (Client g : liste_ger) {
			System.out.println(g.getNomcli());
		}
	}

}
