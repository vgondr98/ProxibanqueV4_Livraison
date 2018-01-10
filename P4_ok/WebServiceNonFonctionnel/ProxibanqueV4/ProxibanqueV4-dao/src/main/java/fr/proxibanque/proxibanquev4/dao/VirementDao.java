package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.proxibanque.proxibanquev4.domaine.Virement;

/**
 * @author Victor 
 * Cette interface ViremmentDao permet l'utilisation de méthode proposé par l'interface générique JpaRepository.
 * Cette interface générique prends deux paramètres en entré, la classe entity Viremment et une clé primaire. 
 * Elle permet par exemple d'utiliser via spring-data, la méthode save qui prend en paramètre un Entity Viremment.
 * Si ce conseiller a un numvir (correspondant à la clé primaire de la table viremment) déja enregistré en base,
 * alors la méthode save fera un update de la ligne correspondante en remplaçant les infos contenus dans les
 * différentes colonnes de la table Viremment par ceux enregistré dans l'objet Viremment passé en paramètre.
 * Si le numvir de l'objet Viremment n'existe pas alors la méthode save rajoutera une nouvelle ligne dans la table.
 * 
 * 
 * 
 */

public interface VirementDao extends JpaRepository<Virement, Integer>{
	
	/*public List<Virement> findVirementByIdcons();*/

}
