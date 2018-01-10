package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Gerant;

/**
 * @author Victor 
 * Cette interface GerantDao permet l'utilisation de méthode proposé par l'interface générique JpaRepository.
 * Cette interface générique prends deux paramètres en entré, la classe entity Gerant et une clé primaire. 
 * Elle permet par exemple d'utiliser via spring-data, la méthode save qui prend en paramètre un Entity Gerant.
 * Si ce Gerant a un idger (correspondant à la clé primaire de la table gerant) déja enregistré en base,
 * alors la méthode save fera un update de la ligne correspondante en remplaçant les infos contenus dans les
 * différentes colonnes de la table Gerant par ceux enregistré dans l'objet Gerant passé en paramètre.
 * Si l'idger de l'objet Gerant n'existe pas alors la méthode save rajoutera une nouvelle ligne dans la table.
 * 
 * Une méthode supplémentaire a été défini dans l'interface GerantDao, findByNomger, cette méthode permet
 * de retourner une liste de conseiller par leur nomger.
 * 
 * Une méthode supplémentaire a été défini dans l'interface GerantDao, findByLoginger, cette méthode permet de
 * retourner un Gerant par son loginger
 * 
 */
public interface GerantDao extends JpaRepository<Gerant, Integer>{
	public List<Gerant> findByNomger(String name);

	public Gerant findByLoginger(String name);
}
