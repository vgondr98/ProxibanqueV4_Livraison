package fr.gtm.proxibanque.domaine;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Victor 
 * La classe Compte permet l'instantation d'un objet Compte, 
 * avec comme attributs un num�ro de Compte numCompte, un type de Compte(epargne ou courant),
 * une date d'ouverture dateOuv, un solde, un taux de d�couvert DECOUVERT (concerne les comptes courants),
 * un taux de r�num�ration TAUXREM (concerne les comptes �pargnes) et un Client.
 * Cette classe est une "entity class" et va permettre la persistence en base de donn�es d'un compte.
 */
@Entity
@Table(name = "COMPTE")
@XmlRootElement
public class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMCOMPTE")
    private int numcompte;
    @Column(name = "TYPE_COMPTE")
    private String typeCompte;
   // @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATEOUV")
    private String dateouv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOLDE")
    private int solde;
    @Column(name = "DECOUVERT")
    private Integer decouvert;
    @Column(name = "TAUXREM")
    private Double tauxrem;
    @JoinColumn(name = "IDCLI", referencedColumnName = "IDCLI")
    @ManyToOne
    private Client idcli;
    
    

    public Compte(int numcompte, String dateouv, int solde, double tauxrem, Client idcli) {
		super();
		this.numcompte = numcompte;
		this.dateouv = dateouv;
		this.solde = solde;
		this.tauxrem = tauxrem;
		this.idcli = idcli;
	}

	public Compte(int numcompte, String dateouv, int solde, Integer decouvert, Client idcli) {
		super();
		this.numcompte = numcompte;
		this.dateouv = dateouv;
		this.solde = solde;
		this.decouvert = decouvert;
		this.idcli = idcli;
	}

	public Compte(int numcompte, String typeCompte, String dateouv, int solde, Integer decouvert,
			double tauxrem, Client idcli) {
		super();
		this.numcompte = numcompte;
		this.typeCompte = typeCompte;
		this.dateouv = dateouv;
		this.solde = solde;
		this.decouvert = decouvert;
		this.tauxrem = tauxrem;
		this.idcli = idcli;
	}

	public Compte() {
    }

    public Compte(Integer numcompte) {
        this.numcompte = numcompte;
    }

    public Integer getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(Integer numcompte) {
        this.numcompte = numcompte;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public String getDateouv() {
        return dateouv;
    }

    public void setDateouv(String dateouv) {
        this.dateouv = dateouv;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public int getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(Integer decouvert) {
        this.decouvert = decouvert;
    }

    public double getTauxrem() {
        return tauxrem;
    }

    public void setTauxrem(Double tauxrem) {
        this.tauxrem = tauxrem;
    }

    public Client getIdcli() {
        return idcli;
    }

    public void setIdcli(Client idcli) {
        this.idcli = idcli;
    }


    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setNumcompte(int numcompte) {
		this.numcompte = numcompte;
	}

	public void setTauxrem(double tauxrem) {
		this.tauxrem = tauxrem;
	}

	@Override
    public String toString() {
        return "proxibanquev4scriptcorrige.Compte[ numcompte=" + numcompte + " ]";
    }
    
    
}