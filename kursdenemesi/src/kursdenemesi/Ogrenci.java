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
@Table(name = "OGRENCI", catalog = "", schema = "MEHMET")
@NamedQueries({
    @NamedQuery(name = "Ogrenci.findAll", query = "SELECT o FROM Ogrenci o")
    , @NamedQuery(name = "Ogrenci.findById", query = "SELECT o FROM Ogrenci o WHERE o.id = :id")
    , @NamedQuery(name = "Ogrenci.findByAdi", query = "SELECT o FROM Ogrenci o WHERE o.adi = :adi")
    , @NamedQuery(name = "Ogrenci.findBySoyadi", query = "SELECT o FROM Ogrenci o WHERE o.soyadi = :soyadi")
    , @NamedQuery(name = "Ogrenci.findByTcno", query = "SELECT o FROM Ogrenci o WHERE o.tcno = :tcno")
    , @NamedQuery(name = "Ogrenci.findByDogumgunu", query = "SELECT o FROM Ogrenci o WHERE o.dogumgunu = :dogumgunu")
    , @NamedQuery(name = "Ogrenci.findByDogumayi", query = "SELECT o FROM Ogrenci o WHERE o.dogumayi = :dogumayi")
    , @NamedQuery(name = "Ogrenci.findByDogumyili", query = "SELECT o FROM Ogrenci o WHERE o.dogumyili = :dogumyili")
    , @NamedQuery(name = "Ogrenci.findByCinsiyet", query = "SELECT o FROM Ogrenci o WHERE o.cinsiyet = :cinsiyet")
    , @NamedQuery(name = "Ogrenci.findByMemleket", query = "SELECT o FROM Ogrenci o WHERE o.memleket = :memleket")
    , @NamedQuery(name = "Ogrenci.findByEmail", query = "SELECT o FROM Ogrenci o WHERE o.email = :email")
    , @NamedQuery(name = "Ogrenci.findByTelefon", query = "SELECT o FROM Ogrenci o WHERE o.telefon = :telefon")})
public class Ogrenci implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "TCNO")
    private String tcno;
    @Column(name = "DOGUMGUNU")
    private String dogumgunu;
    @Column(name = "DOGUMAYI")
    private String dogumayi;
    @Column(name = "DOGUMYILI")
    private String dogumyili;
    @Column(name = "CINSIYET")
    private String cinsiyet;
    @Column(name = "MEMLEKET")
    private String memleket;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEFON")
    private String telefon;

    public Ogrenci() {
    }

    public Ogrenci(Integer id) {
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

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        String oldAdi = this.adi;
        this.adi = adi;
        changeSupport.firePropertyChange("adi", oldAdi, adi);
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        String oldSoyadi = this.soyadi;
        this.soyadi = soyadi;
        changeSupport.firePropertyChange("soyadi", oldSoyadi, soyadi);
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        String oldTcno = this.tcno;
        this.tcno = tcno;
        changeSupport.firePropertyChange("tcno", oldTcno, tcno);
    }

    public String getDogumgunu() {
        return dogumgunu;
    }

    public void setDogumgunu(String dogumgunu) {
        String oldDogumgunu = this.dogumgunu;
        this.dogumgunu = dogumgunu;
        changeSupport.firePropertyChange("dogumgunu", oldDogumgunu, dogumgunu);
    }

    public String getDogumayi() {
        return dogumayi;
    }

    public void setDogumayi(String dogumayi) {
        String oldDogumayi = this.dogumayi;
        this.dogumayi = dogumayi;
        changeSupport.firePropertyChange("dogumayi", oldDogumayi, dogumayi);
    }

    public String getDogumyili() {
        return dogumyili;
    }

    public void setDogumyili(String dogumyili) {
        String oldDogumyili = this.dogumyili;
        this.dogumyili = dogumyili;
        changeSupport.firePropertyChange("dogumyili", oldDogumyili, dogumyili);
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        String oldCinsiyet = this.cinsiyet;
        this.cinsiyet = cinsiyet;
        changeSupport.firePropertyChange("cinsiyet", oldCinsiyet, cinsiyet);
    }

    public String getMemleket() {
        return memleket;
    }

    public void setMemleket(String memleket) {
        String oldMemleket = this.memleket;
        this.memleket = memleket;
        changeSupport.firePropertyChange("memleket", oldMemleket, memleket);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        String oldTelefon = this.telefon;
        this.telefon = telefon;
        changeSupport.firePropertyChange("telefon", oldTelefon, telefon);
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
        if (!(object instanceof Ogrenci)) {
            return false;
        }
        Ogrenci other = (Ogrenci) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kursdenemesi.Ogrenci[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
