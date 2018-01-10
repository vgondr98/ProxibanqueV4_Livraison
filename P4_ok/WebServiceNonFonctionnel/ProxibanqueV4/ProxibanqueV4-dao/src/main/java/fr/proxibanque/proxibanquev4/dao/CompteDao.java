package fr.proxibanque.proxibanquev4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.proxibanque.proxibanquev4.domaine.Compte;

/**
 * @author Victor 
 * Cette interface CompteDao permet l'utilisation de méthode proposé par l'interface générique JpaRepository.
 * Cette interface générique prends deux paramètres en entré, la classe entity Compte et une clé primaire. 
 * Elle permet par exemple d'utiliser via spring-data, la méthode save qui prend en paramètre un Entity compte.
 * Si ce client a un numcompte (correspondant à la clé primaire de la table compte) déja enregistré en base,
 * alors la méthode save fera un update de la ligne correspondante en remplaçant les infos contenus dans les
 * différentes colonnes de la table Compte par ceux enregistré dans l'objet Compte passé en paramètre.
 * Si le numcompte de l'objet compte n'existe pas alors la méthode save rajoutera une nouvelle ligne dans la table.
 * 
 * Des méthodes supplémentaires ont été défini dans l'interface CompteDao: 
 * - findByNumcompte, cette méthode permet de retourner une liste de comptes (valeur unique)
 *   à partir de son numcompte.
 * - findByTypeCpmpte, cette méthode permet de retourner une Liste de compte à partir de son type de compte
 * (courant ou épargne)  
 *  - findByIdcli_Idcli, cette méthode permet de retourner une liste de compte à partir de l'Idcli du client 
 *  possesseur.
 */
public interface CompteDao extends JpaRepository<Compte, Integer>{
	public List<Compte> findByNumcompte(int name);
	public List<Compte> findByTypeCompte(String name);
	public List<Compte> findByIdcli_Idcli(int name);
	public List<Compte> findByidcli_idcli(int idCli);
}
