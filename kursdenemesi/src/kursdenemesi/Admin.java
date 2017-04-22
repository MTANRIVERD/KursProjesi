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
@Table(name = "ADMIN", catalog = "", schema = "MEHMET")
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a")
    , @NamedQuery(name = "Admin.findById", query = "SELECT a FROM Admin a WHERE a.id = :id")
    , @NamedQuery(name = "Admin.findByKullaniciadi", query = "SELECT a FROM Admin a WHERE a.kullaniciadi = :kullaniciadi")
    , @NamedQuery(name = "Admin.findBySifre", query = "SELECT a FROM Admin a WHERE a.sifre = :sifre")
    , @NamedQuery(name = "Admin.findByYetki", query = "SELECT a FROM Admin a WHERE a.yetki = :yetki")})
public class Admin implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "KULLANICIADI")
    private String kullaniciadi;
    @Column(name = "SIFRE")
    private String sifre;
    @Column(name = "YETKI")
    private String yetki;

    public Admin() {
    }

    public Admin(Integer id) {
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

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        String oldKullaniciadi = this.kullaniciadi;
        this.kullaniciadi = kullaniciadi;
        changeSupport.firePropertyChange("kullaniciadi", oldKullaniciadi, kullaniciadi);
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        String oldSifre = this.sifre;
        this.sifre = sifre;
        changeSupport.firePropertyChange("sifre", oldSifre, sifre);
    }

    public String getYetki() {
        return yetki;
    }

    public void setYetki(String yetki) {
        String oldYetki = this.yetki;
        this.yetki = yetki;
        changeSupport.firePropertyChange("yetki", oldYetki, yetki);
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
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kursdenemesi.Admin[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
