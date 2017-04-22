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
@Table(name = "KURSB\u0130LG\u0130S\u0130", catalog = "", schema = "MEHMET")
@NamedQueries({
    @NamedQuery(name = "KursbiLgiSi.findAll", query = "SELECT k FROM KursbiLgiSi k")
    , @NamedQuery(name = "KursbiLgiSi.findByKursadi", query = "SELECT k FROM KursbiLgiSi k WHERE k.kursadi = :kursadi")
    , @NamedQuery(name = "KursbiLgiSi.findByKursyoneticisi", query = "SELECT k FROM KursbiLgiSi k WHERE k.kursyoneticisi = :kursyoneticisi")
    , @NamedQuery(name = "KursbiLgiSi.findByTarih", query = "SELECT k FROM KursbiLgiSi k WHERE k.tarih = :tarih")
    , @NamedQuery(name = "KursbiLgiSi.findByKursadresi", query = "SELECT k FROM KursbiLgiSi k WHERE k.kursadresi = :kursadresi")
    , @NamedQuery(name = "KursbiLgiSi.findByKursweb", query = "SELECT k FROM KursbiLgiSi k WHERE k.kursweb = :kursweb")
    , @NamedQuery(name = "KursbiLgiSi.findByKursemail", query = "SELECT k FROM KursbiLgiSi k WHERE k.kursemail = :kursemail")
    , @NamedQuery(name = "KursbiLgiSi.findByKurstel1", query = "SELECT k FROM KursbiLgiSi k WHERE k.kurstel1 = :kurstel1")
    , @NamedQuery(name = "KursbiLgiSi.findByKurstel2", query = "SELECT k FROM KursbiLgiSi k WHERE k.kurstel2 = :kurstel2")
    , @NamedQuery(name = "KursbiLgiSi.findByKurstel3", query = "SELECT k FROM KursbiLgiSi k WHERE k.kurstel3 = :kurstel3")})
public class KursbiLgiSi implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KURSADI")
    private String kursadi;
    @Column(name = "KURSYONETICISI")
    private String kursyoneticisi;
    @Column(name = "TARIH")
    private String tarih;
    @Column(name = "KURSADRESI")
    private String kursadresi;
    @Column(name = "KURSWEB")
    private String kursweb;
    @Column(name = "KURSEMAIL")
    private String kursemail;
    @Column(name = "KURSTEL1")
    private String kurstel1;
    @Column(name = "KURSTEL2")
    private String kurstel2;
    @Column(name = "KURSTEL3")
    private String kurstel3;

    public KursbiLgiSi() {
    }

    public KursbiLgiSi(String kursadi) {
        this.kursadi = kursadi;
    }

    public String getKursadi() {
        return kursadi;
    }

    public void setKursadi(String kursadi) {
        String oldKursadi = this.kursadi;
        this.kursadi = kursadi;
        changeSupport.firePropertyChange("kursadi", oldKursadi, kursadi);
    }

    public String getKursyoneticisi() {
        return kursyoneticisi;
    }

    public void setKursyoneticisi(String kursyoneticisi) {
        String oldKursyoneticisi = this.kursyoneticisi;
        this.kursyoneticisi = kursyoneticisi;
        changeSupport.firePropertyChange("kursyoneticisi", oldKursyoneticisi, kursyoneticisi);
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        String oldTarih = this.tarih;
        this.tarih = tarih;
        changeSupport.firePropertyChange("tarih", oldTarih, tarih);
    }

    public String getKursadresi() {
        return kursadresi;
    }

    public void setKursadresi(String kursadresi) {
        String oldKursadresi = this.kursadresi;
        this.kursadresi = kursadresi;
        changeSupport.firePropertyChange("kursadresi", oldKursadresi, kursadresi);
    }

    public String getKursweb() {
        return kursweb;
    }

    public void setKursweb(String kursweb) {
        String oldKursweb = this.kursweb;
        this.kursweb = kursweb;
        changeSupport.firePropertyChange("kursweb", oldKursweb, kursweb);
    }

    public String getKursemail() {
        return kursemail;
    }

    public void setKursemail(String kursemail) {
        String oldKursemail = this.kursemail;
        this.kursemail = kursemail;
        changeSupport.firePropertyChange("kursemail", oldKursemail, kursemail);
    }

    public String getKurstel1() {
        return kurstel1;
    }

    public void setKurstel1(String kurstel1) {
        String oldKurstel1 = this.kurstel1;
        this.kurstel1 = kurstel1;
        changeSupport.firePropertyChange("kurstel1", oldKurstel1, kurstel1);
    }

    public String getKurstel2() {
        return kurstel2;
    }

    public void setKurstel2(String kurstel2) {
        String oldKurstel2 = this.kurstel2;
        this.kurstel2 = kurstel2;
        changeSupport.firePropertyChange("kurstel2", oldKurstel2, kurstel2);
    }

    public String getKurstel3() {
        return kurstel3;
    }

    public void setKurstel3(String kurstel3) {
        String oldKurstel3 = this.kurstel3;
        this.kurstel3 = kurstel3;
        changeSupport.firePropertyChange("kurstel3", oldKurstel3, kurstel3);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kursadi != null ? kursadi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KursbiLgiSi)) {
            return false;
        }
        KursbiLgiSi other = (KursbiLgiSi) object;
        if ((this.kursadi == null && other.kursadi != null) || (this.kursadi != null && !this.kursadi.equals(other.kursadi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kursdenemesi.KursbiLgiSi[ kursadi=" + kursadi + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
