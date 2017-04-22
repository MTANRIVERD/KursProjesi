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
@Table(name = "PANSIYON", catalog = "", schema = "MEHMET")
@NamedQueries({
    @NamedQuery(name = "Pansiyon.findAll", query = "SELECT p FROM Pansiyon p")
    , @NamedQuery(name = "Pansiyon.findById", query = "SELECT p FROM Pansiyon p WHERE p.id = :id")
    , @NamedQuery(name = "Pansiyon.findBySicilno", query = "SELECT p FROM Pansiyon p WHERE p.sicilno = :sicilno")
    , @NamedQuery(name = "Pansiyon.findByKayitgunu", query = "SELECT p FROM Pansiyon p WHERE p.kayitgunu = :kayitgunu")
    , @NamedQuery(name = "Pansiyon.findByKayitayi", query = "SELECT p FROM Pansiyon p WHERE p.kayitayi = :kayitayi")
    , @NamedQuery(name = "Pansiyon.findByKayityili", query = "SELECT p FROM Pansiyon p WHERE p.kayityili = :kayityili")
    , @NamedQuery(name = "Pansiyon.findByOdano", query = "SELECT p FROM Pansiyon p WHERE p.odano = :odano")
    , @NamedQuery(name = "Pansiyon.findByYatakno", query = "SELECT p FROM Pansiyon p WHERE p.yatakno = :yatakno")
    , @NamedQuery(name = "Pansiyon.findByDolapno", query = "SELECT p FROM Pansiyon p WHERE p.dolapno = :dolapno")
    , @NamedQuery(name = "Pansiyon.findByAyrilisgunu", query = "SELECT p FROM Pansiyon p WHERE p.ayrilisgunu = :ayrilisgunu")
    , @NamedQuery(name = "Pansiyon.findByAyrilisayi", query = "SELECT p FROM Pansiyon p WHERE p.ayrilisayi = :ayrilisayi")
    , @NamedQuery(name = "Pansiyon.findByAyrilisyili", query = "SELECT p FROM Pansiyon p WHERE p.ayrilisyili = :ayrilisyili")
    , @NamedQuery(name = "Pansiyon.findByTuru", query = "SELECT p FROM Pansiyon p WHERE p.turu = :turu")
    , @NamedQuery(name = "Pansiyon.findByNobetyeri", query = "SELECT p FROM Pansiyon p WHERE p.nobetyeri = :nobetyeri")
    , @NamedQuery(name = "Pansiyon.findByTemizlikyeri", query = "SELECT p FROM Pansiyon p WHERE p.temizlikyeri = :temizlikyeri")})
public class Pansiyon implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SICILNO")
    private String sicilno;
    @Column(name = "KAYITGUNU")
    private String kayitgunu;
    @Column(name = "KAYITAYI")
    private String kayitayi;
    @Column(name = "KAYITYILI")
    private String kayityili;
    @Column(name = "ODANO")
    private String odano;
    @Column(name = "YATAKNO")
    private String yatakno;
    @Column(name = "DOLAPNO")
    private String dolapno;
    @Column(name = "AYRILISGUNU")
    private String ayrilisgunu;
    @Column(name = "AYRILISAYI")
    private String ayrilisayi;
    @Column(name = "AYRILISYILI")
    private String ayrilisyili;
    @Column(name = "TURU")
    private String turu;
    @Column(name = "NOBETYERI")
    private String nobetyeri;
    @Column(name = "TEMIZLIKYERI")
    private String temizlikyeri;

    public Pansiyon() {
    }

    public Pansiyon(Integer id) {
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

    public String getSicilno() {
        return sicilno;
    }

    public void setSicilno(String sicilno) {
        String oldSicilno = this.sicilno;
        this.sicilno = sicilno;
        changeSupport.firePropertyChange("sicilno", oldSicilno, sicilno);
    }

    public String getKayitgunu() {
        return kayitgunu;
    }

    public void setKayitgunu(String kayitgunu) {
        String oldKayitgunu = this.kayitgunu;
        this.kayitgunu = kayitgunu;
        changeSupport.firePropertyChange("kayitgunu", oldKayitgunu, kayitgunu);
    }

    public String getKayitayi() {
        return kayitayi;
    }

    public void setKayitayi(String kayitayi) {
        String oldKayitayi = this.kayitayi;
        this.kayitayi = kayitayi;
        changeSupport.firePropertyChange("kayitayi", oldKayitayi, kayitayi);
    }

    public String getKayityili() {
        return kayityili;
    }

    public void setKayityili(String kayityili) {
        String oldKayityili = this.kayityili;
        this.kayityili = kayityili;
        changeSupport.firePropertyChange("kayityili", oldKayityili, kayityili);
    }

    public String getOdano() {
        return odano;
    }

    public void setOdano(String odano) {
        String oldOdano = this.odano;
        this.odano = odano;
        changeSupport.firePropertyChange("odano", oldOdano, odano);
    }

    public String getYatakno() {
        return yatakno;
    }

    public void setYatakno(String yatakno) {
        String oldYatakno = this.yatakno;
        this.yatakno = yatakno;
        changeSupport.firePropertyChange("yatakno", oldYatakno, yatakno);
    }

    public String getDolapno() {
        return dolapno;
    }

    public void setDolapno(String dolapno) {
        String oldDolapno = this.dolapno;
        this.dolapno = dolapno;
        changeSupport.firePropertyChange("dolapno", oldDolapno, dolapno);
    }

    public String getAyrilisgunu() {
        return ayrilisgunu;
    }

    public void setAyrilisgunu(String ayrilisgunu) {
        String oldAyrilisgunu = this.ayrilisgunu;
        this.ayrilisgunu = ayrilisgunu;
        changeSupport.firePropertyChange("ayrilisgunu", oldAyrilisgunu, ayrilisgunu);
    }

    public String getAyrilisayi() {
        return ayrilisayi;
    }

    public void setAyrilisayi(String ayrilisayi) {
        String oldAyrilisayi = this.ayrilisayi;
        this.ayrilisayi = ayrilisayi;
        changeSupport.firePropertyChange("ayrilisayi", oldAyrilisayi, ayrilisayi);
    }

    public String getAyrilisyili() {
        return ayrilisyili;
    }

    public void setAyrilisyili(String ayrilisyili) {
        String oldAyrilisyili = this.ayrilisyili;
        this.ayrilisyili = ayrilisyili;
        changeSupport.firePropertyChange("ayrilisyili", oldAyrilisyili, ayrilisyili);
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        String oldTuru = this.turu;
        this.turu = turu;
        changeSupport.firePropertyChange("turu", oldTuru, turu);
    }

    public String getNobetyeri() {
        return nobetyeri;
    }

    public void setNobetyeri(String nobetyeri) {
        String oldNobetyeri = this.nobetyeri;
        this.nobetyeri = nobetyeri;
        changeSupport.firePropertyChange("nobetyeri", oldNobetyeri, nobetyeri);
    }

    public String getTemizlikyeri() {
        return temizlikyeri;
    }

    public void setTemizlikyeri(String temizlikyeri) {
        String oldTemizlikyeri = this.temizlikyeri;
        this.temizlikyeri = temizlikyeri;
        changeSupport.firePropertyChange("temizlikyeri", oldTemizlikyeri, temizlikyeri);
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
        if (!(object instanceof Pansiyon)) {
            return false;
        }
        Pansiyon other = (Pansiyon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kursdenemesi.Pansiyon[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
