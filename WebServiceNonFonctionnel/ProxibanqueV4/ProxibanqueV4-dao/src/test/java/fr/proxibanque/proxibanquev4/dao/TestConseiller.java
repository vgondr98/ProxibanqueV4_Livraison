package fr.proxibanque.proxibanquev4.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import junit.framework.TestCase;

/**
 * @author Victor
 * Cette classe de test a été réalisé pour tester les méthodes de la dao associées aux conseiller, les méthodes save et
 * findByNomcons.
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
 * Ici, il s'agit du bean conseillerDao qui est créé automatiquement par spring-data.
 */
public class TestConseiller extends TestCase{
	private Conseiller conseiller2;
	private Gerant gerant1;
	
	//private 
	private ConseillerDao springDao;
	private ClassPathXmlApplicationContext appContext;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		gerant1 = new Gerant((Integer)1,"popo","popo","popo","popo");
				
		conseiller2 = new Conseiller((Integer)1,"pdupond", "David","tata","Gerard",gerant1);
				
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (ConseillerDao) appContext.getBean("conseillerDao");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		conseiller2 = null;
		appContext = null;
		springDao = null;
	}
	
	
	
	public void testFindlogin() {
		/*String name = "psanchez";
		Conseiller liste_cons = springDao.findByLogincons(name);*/
		/*for (Conseiller c : liste_cons) {
			System.out.println(c.getPrenomcons());
			
		}*/
		 /*
			System.out.println(liste_cons.getPrenomcons());
			
		*/
		
		Conseiller cons = springDao.findByLogincons("nimportequoi");
		
		if(cons!=null) {
			System.out.println("non nul");
		}else {
		System.out.println("conseiller nul");
		}
		
	}

	
	
	public void testSaveConseiller() {
		springDao.save(conseiller2);
	}

	public void testListAll() {
		List<Conseiller> liste_cons = springDao.findAll();
		for (Conseiller c : liste_cons) {
			System.out.println(c.getPrenomcons());
			
		}
		
	}
	
	
	public void testFindby() {
		int i = 1;
		List<Conseiller> liste_cons = springDao.findByIdcons(i);
		for (Conseiller c : liste_cons) {
			System.out.println(c.getPrenomcons());
		}
		
	}
	
	
	public void testgetAllConseiller() {
		List<Conseiller> listeAllConseiller = springDao.findAll();
		
		for ( Conseiller c : listeAllConseiller) {
			
			System.out.println(c.getPassword());
			
		}
		
		
		
		
	}
	
	public void testfindConseilleerbyLogin() {
		String i ="Sanchez";
		List<Conseiller> liste_ger = springDao.findByNomcons(i);
		for (Conseiller g : liste_ger) {
			System.out.println(g.getLogincons());
		}
}
	


}
