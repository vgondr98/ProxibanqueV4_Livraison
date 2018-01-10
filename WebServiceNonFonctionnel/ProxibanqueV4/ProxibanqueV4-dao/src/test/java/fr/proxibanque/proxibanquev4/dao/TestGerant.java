package fr.proxibanque.proxibanquev4.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import junit.framework.TestCase;

/**
 * @author Victor
 * Cette classe de test a été réalisé pour tester les méthodes de la dao associées aux gérants, les méthodes save et
 * findByNomger.
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
 * Ici, il s'agit du bean gerantDao qui est créé automatiquement par spring-data.
 */
public class TestGerant extends TestCase{
	private Gerant gerant1;
	
	//private 
		private GerantDao springDao;
		private ClassPathXmlApplicationContext appContext;
		//private List<Conseiller> listeConseiller1;
		
		

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		//Conseiller conseiller1 = new Conseiller("toto","toto","toto","toto");
		//listeConseiller1 = new ArrayList<Conseiller>();
		//listeConseiller1.add(conseiller1);
		//gerant1 = new Gerant("popo","popo","popo","popo",listeConseiller1);
		gerant1 = new Gerant((Integer)1,"popo","popo","popo","popo");
		
				
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (GerantDao) appContext.getBean("gerantDao");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		gerant1 = null;
		appContext = null;
		springDao = null;
	}
	
	public void testSaveGerant() {
		springDao.save(gerant1);
	}
	
	public void testfindby() {
		String i ="Chirac";
		List<Gerant> liste_ger = springDao.findByNomger(i);
		for (Gerant g : liste_ger) {
			System.out.println(g.getLoginger());
			
			
		}
		
	}
}
