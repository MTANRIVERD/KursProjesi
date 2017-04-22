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
@Table(name = "EGITIM", catalog = "", schema = "MEHMET")
@NamedQueries({
    @NamedQuery(name = "Egitim.findAll", query = "SELECT e FROM Egitim e")
    , @NamedQuery(name = "Egitim.findById", query = "SELECT e FROM Egitim e WHERE e.id = :id")
    , @NamedQuery(name = "Egitim.findBySinifduzeyi", query = "SELECT e FROM Egitim e WHERE e.sinifduzeyi = :sinifduzeyi")
    , @NamedQuery(name = "Egitim.findByOkulu", query = "SELECT e FROM Egitim e WHERE e.okulu = :okulu")
    , @NamedQuery(name = "Egitim.findByOkulno", query = "SELECT e FROM Egitim e WHERE e.okulno = :okulno")
    , @NamedQuery(name = "Egitim.findByAcikliseno", query = "SELECT e FROM Egitim e WHERE e.acikliseno = :acikliseno")
    , @NamedQuery(name = "Egitim.findByAciklisesifre", query = "SELECT e FROM Egitim e WHERE e.aciklisesifre = :aciklisesifre")})
public class Egitim implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SINIFDUZEYI")
    private String sinifduzeyi;
    @Column(name = "OKULU")
    private String okulu;
    @Column(name = "OKULNO")
    private String okulno;
    @Column(name = "ACIKLISENO")
    private String acikliseno;
    @Column(name = "ACIKLISESIFRE")
    private String aciklisesifre;

    public Egitim() {
    }

    public Egitim(Integer id) {
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

    public String getSinifduzeyi() {
        return sinifduzeyi;
    }

    public void setSinifduzeyi(String sinifduzeyi) {
        String oldSinifduzeyi = this.sinifduzeyi;
        this.sinifduzeyi = sinifduzeyi;
        changeSupport.firePropertyChange("sinifduzeyi", oldSinifduzeyi, sinifduzeyi);
    }

    public String getOkulu() {
        return okulu;
    }

    public void setOkulu(String okulu) {
        String oldOkulu = this.okulu;
        this.okulu = okulu;
        changeSupport.firePropertyChange("okulu", oldOkulu, okulu);
    }

    public String getOkulno() {
        return okulno;
    }

    public void setOkulno(String okulno) {
        String oldOkulno = this.okulno;
        this.okulno = okulno;
        changeSupport.firePropertyChange("okulno", oldOkulno, okulno);
    }

    public String getAcikliseno() {
        return acikliseno;
    }

    public void setAcikliseno(String acikliseno) {
        String oldAcikliseno = this.acikliseno;
        this.acikliseno = acikliseno;
        changeSupport.firePropertyChange("acikliseno", oldAcikliseno, acikliseno);
    }

    public String getAciklisesifre() {
        return aciklisesifre;
    }

    public void setAciklisesifre(String aciklisesifre) {
        String oldAciklisesifre = this.aciklisesifre;
        this.aciklisesifre = aciklisesifre;
        changeSupport.firePropertyChange("aciklisesifre", oldAciklisesifre, aciklisesifre);
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
        if (!(object instanceof Egitim)) {
            return false;
        }
        Egitim other = (Egitim) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kursdenemesi.Egitim[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
