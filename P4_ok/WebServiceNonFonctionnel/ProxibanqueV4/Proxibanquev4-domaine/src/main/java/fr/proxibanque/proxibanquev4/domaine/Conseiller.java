package fr.proxibanque.proxibanquev4.domaine;
import java.io.Serializable;
import java.util.Collection;
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

/**
 * @author Victor 
 * La classe Conseiller permet l'instanciation des objets Conseiller avec comme attributs un idcons (unique), un loginCons (unique),
 * un password (unique), un nom et un prénom, ainsi qu'une liste de Client clientList, la liste de tous les clients sous sa responsabilité.
 * Cette classe est une "entity class" et va permettre la persistence en base de données d'un conseiller.
 */
@Entity
@Table(name = "CONSEILLER")
@XmlRootElement

public class Conseiller implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCONS")
    private Integer idcons;
    @Column(name = "LOGINCONS")
    private String logincons;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PRENOMCONS")
    private String prenomcons;
    @Column(name = "NOMCONS")
    private String nomcons;
    @JoinColumn(name = "IDGER", referencedColumnName = "IDGER")
    @ManyToOne
    private Gerant idger;
//    @OneToMany(mappedBy = "idcons")
//    private Collection<Virement> virementCollection;
//    @OneToMany(mappedBy = "idcons")
//    private Collection<Client> clientCollection;

    
    
    
    public Conseiller() {
    }

    public Conseiller(Integer idcons, String logincons, String password, String prenomcons, String nomcons) {
	super();
	this.idcons = idcons;
	this.logincons = logincons;
	this.password = password;
	this.prenomcons = prenomcons;
	this.nomcons = nomcons;
}

	public Conseiller(Integer idcons, String logincons, String password, String prenomcons, String nomcons, Gerant idger) {
	super();
	this.idcons = idcons;
	this.logincons = logincons;
	this.password = password;
	this.prenomcons = prenomcons;
	this.nomcons = nomcons;
	this.idger = idger;
}

	public Conseiller(Integer idcons) {
        this.idcons = idcons;
    }

    public Integer getIdcons() {
        return idcons;
    }

    public void setIdcons(Integer idcons) {
        this.idcons = idcons;
    }

    public String getLogincons() {
        return logincons;
    }

    public void setLogincons(String logincons) {
        this.logincons = logincons;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenomcons() {
        return prenomcons;
    }

    public void setPrenomcons(String prenomcons) {
        this.prenomcons = prenomcons;
    }

    public String getNomcons() {
        return nomcons;
    }

    public void setNomcons(String nomcons) {
        this.nomcons = nomcons;
    }

    public Gerant getIdger() {
        return idger;
    }

    public void setIdger(Gerant idger) {
        this.idger = idger;
    }

//    @XmlTransient
//    public Collection<Virement> getVirementCollection() {
//        return virementCollection;
//    }
//
//    public void setVirementCollection(Collection<Virement> virementCollection) {
//        this.virementCollection = virementCollection;
//    }
//
//    @XmlTransient
//    public Collection<Client> getClientCollection() {
//        return clientCollection;
//    }
//
//    public void setClientCollection(Collection<Client> clientCollection) {
//        this.clientCollection = clientCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcons != null ? idcons.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conseiller)) {
            return false;
        }
        Conseiller other = (Conseiller) object;
        if ((this.idcons == null && other.idcons != null) || (this.idcons != null && !this.idcons.equals(other.idcons))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication11.Conseiller[ idcons=" + idcons + " ]";
    }
    
}
