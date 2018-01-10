package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Conseiller;

/**
 * @author Victor 
 * Cette interface ConseillerDao permet l'utilisation de méthode proposé par l'interface générique JpaRepository.
 * Cette interface générique prends deux paramètres en entré, la classe entity Conseiller et une clé primaire. 
 * Elle permet par exemple d'utiliser via spring-data, la méthode save qui prend en paramètre un Entity conseiller.
 * Si ce conseiller a un idcons (correspondant à la clé primaire de la table conseiller) déja enregistré en base,
 * alors la méthode save fera un update de la ligne correspondante en remplaçant les infos contenus dans les
 * différentes colonnes de la table Conseiller par ceux enregistré dans l'objet Conseiller passé en paramètre.
 * Si l'idcons de l'objet Conseiller n'existe pas alors la méthode save rajoutera une nouvelle ligne dans la table.
 * 
 * Une méthode supplémentaire a été défini dans l'interface ConseillerDao, findByNomcons, cette méthode permet
 * de retourner une liste de conseiller par leur nomcons.
 * 
 * Une méthode supplémentaire a été défini dans l'interface ConseillerDao, findByLogincons, cette méthode permet de
 * retourner un Conseiller par son logincons
 * 
 */
public interface ConseillerDao extends JpaRepository<Conseiller, Integer>{
	public List<Conseiller> findByIdcons(Integer i);
	
	
	public Conseiller findByLogincons (String login);
	
	/*public List<Conseiller> findAll();*/
	
	public List<Conseiller> findByNomcons(String name);
	
	
}
