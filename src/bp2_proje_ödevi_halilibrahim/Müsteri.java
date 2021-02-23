/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_proje_ödevi_halilibrahim;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author halil
 */
@Entity
@Table(name = "M\u00dcSTER\u0130")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "M\u00fcsteri.findAll", query = "SELECT m FROM M\u00fcsteri m")
    , @NamedQuery(name = "M\u00fcsteri.findByMId", query = "SELECT m FROM M\u00fcsteri m WHERE m.mId = :mId")
    , @NamedQuery(name = "M\u00fcsteri.findByMAdi", query = "SELECT m FROM M\u00fcsteri m WHERE m.mAdi = :mAdi")
    , @NamedQuery(name = "M\u00fcsteri.findByMSoyadi", query = "SELECT m FROM M\u00fcsteri m WHERE m.mSoyadi = :mSoyadi")
    , @NamedQuery(name = "M\u00fcsteri.findByMTelefon", query = "SELECT m FROM M\u00fcsteri m WHERE m.mTelefon = :mTelefon")
    , @NamedQuery(name = "M\u00fcsteri.findByMSiFre", query = "SELECT m FROM M\u00fcsteri m WHERE m.mSiFre = :mSiFre")
    , @NamedQuery(name = "M\u00fcsteri.findByEposta", query = "SELECT m FROM M\u00fcsteri m WHERE m.eposta = :eposta")
    , @NamedQuery(name = "M\u00fcsteri.findByAdresiL", query = "SELECT m FROM M\u00fcsteri m WHERE m.adresiL = :adresiL")
    , @NamedQuery(name = "M\u00fcsteri.findByAdresiL\u00e7e", query = "SELECT m FROM M\u00fcsteri m WHERE m.adresiL\u00e7e = :adresiL\u00e7e")
    , @NamedQuery(name = "M\u00fcsteri.findByAdres", query = "SELECT m FROM M\u00fcsteri m WHERE m.adres = :adres")})
public class Müsteri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "M_ID")
    private Integer mId;
    @Basic(optional = false)
    @Column(name = "M_ADI")
    private String mAdi;
    @Basic(optional = false)
    @Column(name = "M_SOYADI")
    private String mSoyadi;
    @Basic(optional = false)
    @Column(name = "M_TELEFON")
    private int mTelefon;
    @Basic(optional = false)
    @Column(name = "M_S\u0130FRE")
    private String mSiFre;
    @Column(name = "EPOSTA")
    private String eposta;
    @Column(name = "ADRES\u0130L")
    private String adresiL;
    @Column(name = "ADRES\u0130L\u00c7E")
    private String adresiLçe;
    @Column(name = "ADRES")
    private String adres;

    public Müsteri() {
    }

    public Müsteri(Integer mId) {
        this.mId = mId;
    }

    public Müsteri(Integer mId, String mAdi, String mSoyadi, int mTelefon, String mSiFre) {
        this.mId = mId;
        this.mAdi = mAdi;
        this.mSoyadi = mSoyadi;
        this.mTelefon = mTelefon;
        this.mSiFre = mSiFre;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public String getMAdi() {
        return mAdi;
    }

    public void setMAdi(String mAdi) {
        this.mAdi = mAdi;
    }

    public String getMSoyadi() {
        return mSoyadi;
    }

    public void setMSoyadi(String mSoyadi) {
        this.mSoyadi = mSoyadi;
    }

    public int getMTelefon() {
        return mTelefon;
    }

    public void setMTelefon(int mTelefon) {
        this.mTelefon = mTelefon;
    }

    public String getMSiFre() {
        return mSiFre;
    }

    public void setMSiFre(String mSiFre) {
        this.mSiFre = mSiFre;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getAdresiL() {
        return adresiL;
    }

    public void setAdresiL(String adresiL) {
        this.adresiL = adresiL;
    }

    public String getAdresiLçe() {
        return adresiLçe;
    }

    public void setAdresiLçe(String adresiLçe) {
        this.adresiLçe = adresiLçe;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mId != null ? mId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Müsteri)) {
            return false;
        }
        Müsteri other = (Müsteri) object;
        if ((this.mId == null && other.mId != null) || (this.mId != null && !this.mId.equals(other.mId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_proje_\u00f6devi_halilibrahim.M\u00fcsteri[ mId=" + mId + " ]";
    }
    
}
