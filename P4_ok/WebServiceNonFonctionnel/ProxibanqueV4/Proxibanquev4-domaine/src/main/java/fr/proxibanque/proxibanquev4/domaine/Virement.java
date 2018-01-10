package fr.proxibanque.proxibanquev4.domaine;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
 * Cette classe permettra l'instanciation d'un objet de type Virement, ayant pour attributs :
 * - un numéro de virement numVir,
 * - un Compte compte émetteur,
 * - un Compte compte cible,
 * - un libellé
 * - un Conseiller, le conseiller étant  à l'origine du virement.
 * Cette classe est une "entity class" et va permettre la persistence en base de données d'un virement.
 */
@Entity
@Table(name = "VIREMENT")
@XmlRootElement

public class Virement implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NUMVIR")
    private int numvir;
    @Column(name = "COMPTEEMETTEUR")
    private int compteemetteur;
    @Column(name = "COMPTECIBLE")
    private int comptecible;
    @Column(name = "MONTANTVIR")
    private int montantvir;
    @Column(name = "DATEVIR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datevir;
    @Column(name = "LIBELLE")
    private String libelle;
    @JoinColumn(name = "IDCONS", referencedColumnName = "IDCONS")
    @ManyToOne
    private Conseiller idcons;
    
    

    public Virement(int numvir, int compteemetteur, int comptecible, int montantvir, Date datevir,
			String libelle, Conseiller idcons) {
		super();
		this.numvir = numvir;
		this.compteemetteur = compteemetteur;
		this.comptecible = comptecible;
		this.montantvir = montantvir;
		this.datevir = datevir;
		this.libelle = libelle;
		this.idcons = idcons;
	}

	public Virement() {
    }

    public Virement(int numvir) {
        this.numvir = numvir;
    }

    public int getNumvir() {
        return numvir;
    }

    public void setNumvir(int numvir) {
        this.numvir = numvir;
    }

    public Integer getCompteemetteur() {
        return compteemetteur;
    }

    public void setCompteemetteur(Integer compteemetteur) {
        this.compteemetteur = compteemetteur;
    }

    public Integer getComptecible() {
        return comptecible;
    }

    public void setComptecible(Integer comptecible) {
        this.comptecible = comptecible;
    }

    public int getMontantvir() {
        return montantvir;
    }

    public void setMontantvir(int montantvir) {
        this.montantvir = montantvir;
    }

    public Date getDatevir() {
        return datevir;
    }

    public void setDatevir(Date datevir) {
        this.datevir = datevir;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Conseiller getIdcons() {
        return idcons;
    }

    public void setIdcons(Conseiller idcons) {
        this.idcons = idcons;
    }

    @Override
    public String toString() {
        return "proxibanquev4scriptcorrige.Virement[ numvir=" + numvir + " ]";
    }
    
}