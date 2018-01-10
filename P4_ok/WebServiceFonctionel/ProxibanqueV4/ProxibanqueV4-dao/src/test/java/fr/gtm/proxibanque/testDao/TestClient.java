package fr.gtm.proxibanque.testDao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import fr.gtm.proxibanque.dao.ClientDao;
import fr.gtm.proxibanque.domaine.Client;




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


	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class TestClient {

	    @Autowired
	    private ClientDao clientDao;

	    Client client;
	    
	     
	    public void findtest() {
	    	List<Client> liste_cli = clientDao.findAll();
	    	for (Client c : liste_cli) {
	    		assertThat(c).isNotNull();
	    		
	    	}
	    }
	    
	}
//	    @Test
//	    public void contexLoads() throws Exception {
//	        assertThat(clientDao).isNotNull();
//	    }
	    
//	    @Test
//	    public void findClient() {
//	    	
//	    	Client client_dao = clientDao.findById(1);
//	    		assertThat(client_dao).isNotNull();
//	    }
//	    
