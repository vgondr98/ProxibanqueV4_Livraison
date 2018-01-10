package fr.proxibanque.proxibanquev4.dao;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.proxibanque.proxibanquev4.domaine.Conseiller;
import fr.proxibanque.proxibanquev4.domaine.Gerant;
import fr.proxibanque.proxibanquev4.domaine.Virement;
import junit.framework.TestCase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Victor
 * Cette classe de test a été réalisé pour tester les méthodes de la dao associées aux virement, les méthodes save et
 * .
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
 * Ici, il s'agit du bean virementDao qui est créé automatiquement par spring-data.
 */
public class TestVirement extends TestCase{
	private Virement virement1;
	
	//private 
	private VirementDao springDao;
	private ClassPathXmlApplicationContext appContext;
	private static final Logger LOG = LogManager.getLogger(TestVirement.class);

	

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		virement1 = new Virement(17, 50, 47, 45000, (Date)null,"prêt",(Conseiller)null);
		
		
				
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDao = (VirementDao) appContext.getBean("virementDao");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		virement1 = null;
		appContext = null;
		springDao = null;
	}
	
	public void testSaveVirement() {
		springDao.save(virement1);
	}
	public void testLogVirement() {
		LOG.info(virement1);
		}
	
}
