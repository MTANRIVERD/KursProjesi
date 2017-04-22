/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursdenemesi;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author tanrverdi
 */
@Entity
@Table(name = "AILE", catalog = "", schema = "MEHMET")
@NamedQueries({
    @NamedQuery(name = "Aile.findAll", query = "SELECT a FROM Aile a")
    , @NamedQuery(name = "Aile.findById", query = "SELECT a FROM Aile a WHERE a.id = :id")
    , @NamedQuery(name = "Aile.findByAnneadi", query = "SELECT a FROM Aile a WHERE a.anneadi = :anneadi")
    , @NamedQuery(name = "Aile.findByAnnemeslek", query = "SELECT a FROM Aile a WHERE a.annemeslek = :annemeslek")
    , @NamedQuery(name = "Aile.findByBabaadi", query = "SELECT a FROM Aile a WHERE a.babaadi = :babaadi")
    , @NamedQuery(name = "Aile.findByBabameslek", query = "SELECT a FROM Aile a WHERE a.babameslek = :babameslek")
    , @NamedQuery(name = "Aile.findByBabacep", query = "SELECT a FROM Aile a WHERE a.babacep = :babacep")
    , @NamedQuery(name = "Aile.findByAdres", query = "SELECT a FROM Aile a WHERE a.adres = :adres")})
public class Aile implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ANNEADI")
    private String anneadi;
    @Column(name = "ANNEMESLEK")
    private String annemeslek;
    @Column(name = "BABAADI")
    private String babaadi;
    @Column(name = "BABAMESLEK")
    private String babameslek;
    @Column(name = "BABACEP")
    private String babacep;
    @Column(name = "ADRES")
    private String adres;

    public Aile() {
    }

    public Aile(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getAnneadi() {
        return anneadi;
    }

    public void setAnneadi(String anneadi) {
        String oldAnneadi = this.anneadi;
        this.anneadi = anneadi;
        changeSupport.firePropertyChange("anneadi", oldAnneadi, anneadi);
    }

    public String getAnnemeslek() {
        return annemeslek;
    }

    public void setAnnemeslek(String annemeslek) {
        String oldAnnemeslek = this.annemeslek;
        this.annemeslek = annemeslek;
        changeSupport.firePropertyChange("annemeslek", oldAnnemeslek, annemeslek);
    }

    public String getBabaadi() {
        return babaadi;
    }

    public void setBabaadi(String babaadi) {
        String oldBabaadi = this.babaadi;
        this.babaadi = babaadi;
        changeSupport.firePropertyChange("babaadi", oldBabaadi, babaadi);
    }

    public String getBabameslek() {
        return babameslek;
    }

    public void setBabameslek(String babameslek) {
        String oldBabameslek = this.babameslek;
        this.babameslek = babameslek;
        changeSupport.firePropertyChange("babameslek", oldBabameslek, babameslek);
    }

    public String getBabacep() {
        return babacep;
    }

    public void setBabacep(String babacep) {
        String oldBabacep = this.babacep;
        this.babacep = babacep;
        changeSupport.firePropertyChange("babacep", oldBabacep, babacep);
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        String oldAdres = this.adres;
        this.adres = adres;
        changeSupport.firePropertyChange("adres", oldAdres, adres);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aile)) {
            return false;
        }
        Aile other = (Aile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kursdenemesi.Aile[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
