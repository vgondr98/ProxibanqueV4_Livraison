package fr.gtm.proxibanque.domaine;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Victor
 * La classe Client permet l'instanciation d'un objet de type Client, avec comme attributs un idcli (unique) 
 * un prenomcli, un nomcli, une adresse, un code postal, une ville, un telephone, un email et une liste de compte 
 * Cette classe est une "entity class" et va permettre la persistence en base de donn�es d'un client.
 */
@Entity
@Table(name = "CLIENT")

public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    //@Column(name = "IDCLI")
    private int idcli;
    //@Column(name = "PRENOMCLI")
    private String prenomcli;
    //@Column(name = "NOMCLI")
    private String nomcli;
    //@Column(name = "ADRESSE")
    private String adresse;
    @Column(name = "CODEPOSTAL")
    private String codepostal;
    //@Column(name = "VILLE")
    private String ville;
    //@Column(name = "TELEPHONE")
    private String telephone;
    //@Column(name = "EMAIL")
    private String email;
    @OneToMany(mappedBy = "idcli")
    @JsonIgnore
    private List<Compte> listeCollection;
    @JoinColumn(name = "IDCONS", referencedColumnName = "IDCONS")
    @ManyToOne
    @JsonIgnore
    private Conseiller idcons;
    
    

    public Client(int idcli, String prenomcli, String nomcli, String adresse, String codepostal, String ville,
			String telephone, String email, Conseiller idcons) {
		super();
		this.idcli = idcli;
		this.prenomcli = prenomcli;
		this.nomcli = nomcli;
		this.adresse = adresse;
		this.codepostal = codepostal;
		this.ville = ville;
		this.telephone = telephone;
		this.email = email;
		this.idcons = idcons;
	}
    
    
	public Client(int idcli, String prenomcli, String nomcli, String adresse, String codepostal, String ville,
			String telephone, String email) {
		super();
		this.idcli = idcli;
		this.prenomcli = prenomcli;
		this.nomcli = nomcli;
		this.adresse = adresse;
		this.codepostal = codepostal;
		this.ville = ville;
		this.telephone = telephone;
		this.email = email;
	}


	public Client() {
    }

    public Client(int idcli) {
        this.idcli = idcli;
    }

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    public String getPrenomcli() {
        return prenomcli;
    }

    public void setPrenomcli(String prenomcli) {
        this.prenomcli = prenomcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @XmlTransient
//    public List<Compte> getCompteCollection() {
//        return listeCollection;
//    }
//
//    public void setCompteCollection(List<Compte> listeCollection) {
//        this.listeCollection = listeCollection;
//    }

    public Conseiller getIdcons() {
        return idcons;
    }

    public void setIdcons(Conseiller idcons) {
        this.idcons = idcons;
    }

   

    @Override
    public String toString() {
        return "proxibanquev4scriptcorrige.Client[ idcli=" + idcli + " ]";
    }
    
}