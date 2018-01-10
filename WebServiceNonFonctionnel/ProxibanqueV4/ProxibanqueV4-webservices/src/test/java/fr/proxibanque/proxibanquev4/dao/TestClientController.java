package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.domaine.Client;
import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.ws.service.ClientController;
import fr.proxibanque.proxibanquev4.ws.service.IClientController;

public class TestClientController {
	
	
	private Conseiller conseiller1;
	//private 
	
	private IClientController springController;
	
	private AnnotationConfigApplicationContext appContext;
	private AnnotationConfigApplicationContext appContext2;
	
	private Client client_Test;
	
	List<Client> liste_Client;
	
	@Before
	public void setUp() throws Exception {
		/*
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		*/
		appContext = new AnnotationConfigApplicationContext("fr.proxibanque.proxibanquev4.ws.service","fr.proxibanque.proxibanquev4.dao");
		/*springDao = (ClientDao) appContext.getBean("clientDao");*/
		springController = (IClientController) appContext.getBean("clientController");
	}
	
	@After
	public void tearDown() throws Exception {
		client_Test = null;
		appContext = null;
		springController = null;
	}
	
	@Test
	public void testGetAllClients() {
		liste_Client = springController.getAllClients();
		for(Client c : liste_Client) {
			System.out.println(c.getPrenomcli());
		}
		
	}

}
