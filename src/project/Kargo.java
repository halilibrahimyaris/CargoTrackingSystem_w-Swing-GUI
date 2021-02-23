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
@Table(name = "KARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kargo.findAll", query = "SELECT k FROM Kargo k")
    , @NamedQuery(name = "Kargo.findByKargoid", query = "SELECT k FROM Kargo k WHERE k.kargoid = :kargoid")
    , @NamedQuery(name = "Kargo.findByAliciadi", query = "SELECT k FROM Kargo k WHERE k.aliciadi = :aliciadi")
    , @NamedQuery(name = "Kargo.findByG\u00f6nderitipi", query = "SELECT k FROM Kargo k WHERE k.g\u00f6nderitipi = :g\u00f6nderitipi")
    , @NamedQuery(name = "Kargo.findBy\u00d6demetipi", query = "SELECT k FROM Kargo k WHERE k.\u00f6demetipi = :\u00f6demetipi")
    , @NamedQuery(name = "Kargo.findByG\u00f6nderidurumu", query = "SELECT k FROM Kargo k WHERE k.g\u00f6nderidurumu = :g\u00f6nderidurumu")
    , @NamedQuery(name = "Kargo.findByTeslimatucreti", query = "SELECT k FROM Kargo k WHERE k.teslimatucreti = :teslimatucreti")
    , @NamedQuery(name = "Kargo.findByTeslimatarali\u011fi", query = "SELECT k FROM Kargo k WHERE k.teslimatarali\u011fi = :teslimatarali\u011fi")
    , @NamedQuery(name = "Kargo.findByAdresiLi", query = "SELECT k FROM Kargo k WHERE k.adresiLi = :adresiLi")
    , @NamedQuery(name = "Kargo.findByAdresiL\u00e7esi", query = "SELECT k FROM Kargo k WHERE k.adresiL\u00e7esi = :adresiL\u00e7esi")
    , @NamedQuery(name = "Kargo.findByAdres", query = "SELECT k FROM Kargo k WHERE k.adres = :adres")
    , @NamedQuery(name = "Kargo.findByG\u00f6nderiCiId", query = "SELECT k FROM Kargo k WHERE k.g\u00f6nderiCiId = :g\u00f6nderiCiId")
    , @NamedQuery(name = "Kargo.findByTariH", query = "SELECT k FROM Kargo k WHERE k.tariH = :tariH")
    , @NamedQuery(name = "Kargo.findByG\u00f6nderiCiAdi", query = "SELECT k FROM Kargo k WHERE k.g\u00f6nderiCiAdi = :g\u00f6nderiCiAdi")})
public class Kargo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KARGOID")
    private Integer kargoid;
    @Column(name = "ALICIADI")
    private String aliciadi;
    @Basic(optional = false)
    @Column(name = "G\u00d6NDERITIPI")
    private String gönderitipi;
    @Basic(optional = false)
    @Column(name = "\u00d6DEMETIPI")
    private String ödemetipi;
    @Basic(optional = false)
    @Column(name = "G\u00d6NDERIDURUMU")
    private String gönderidurumu;
    @Basic(optional = false)
    @Column(name = "TESLIMATUCRETI")
    private int teslimatucreti;
    @Column(name = "TESLIMATARALI\u011eI")
    private String teslimataraliği;
    @Column(name = "ADRES\u0130L\u0130")
    private String adresiLi;
    @Column(name = "ADRES\u0130L\u00c7ES\u0130")
    private String adresiLçesi;
    @Column(name = "ADRES")
    private String adres;
    @Column(name = "G\u00d6NDER\u0130C\u0130ID")
    private Integer gönderiCiId;
    @Column(name = "TAR\u0130H")
    private String tariH;
    @Column(name = "G\u00d6NDER\u0130C\u0130ADI")
    private String gönderiCiAdi;

    public Kargo() {
    }

    public Kargo(Integer kargoid) {
        this.kargoid = kargoid;
    }

    public Kargo(Integer kargoid, String gönderitipi, String ödemetipi, String gönderidurumu, int teslimatucreti) {
        this.kargoid = kargoid;
        this.gönderitipi = gönderitipi;
        this.ödemetipi = ödemetipi;
        this.gönderidurumu = gönderidurumu;
        this.teslimatucreti = teslimatucreti;
    }

    public Integer getKargoid() {
        return kargoid;
    }

    public void setKargoid(Integer kargoid) {
        this.kargoid = kargoid;
    }

    public String getAliciadi() {
        return aliciadi;
    }

    public void setAliciadi(String aliciadi) {
        this.aliciadi = aliciadi;
    }

    public String getGönderitipi() {
        return gönderitipi;
    }

    public void setGönderitipi(String gönderitipi) {
        this.gönderitipi = gönderitipi;
    }

    public String getÖdemetipi() {
        return ödemetipi;
    }

    public void setÖdemetipi(String ödemetipi) {
        this.ödemetipi = ödemetipi;
    }

    public String getGönderidurumu() {
        return gönderidurumu;
    }

    public void setGönderidurumu(String gönderidurumu) {
        this.gönderidurumu = gönderidurumu;
    }

    public int getTeslimatucreti() {
        return teslimatucreti;
    }

    public void setTeslimatucreti(int teslimatucreti) {
        this.teslimatucreti = teslimatucreti;
    }

    public String getTeslimataraliği() {
        return teslimataraliği;
    }

    public void setTeslimataraliği(String teslimataraliği) {
        this.teslimataraliği = teslimataraliği;
    }

    public String getAdresiLi() {
        return adresiLi;
    }

    public void setAdresiLi(String adresiLi) {
        this.adresiLi = adresiLi;
    }

    public String getAdresiLçesi() {
        return adresiLçesi;
    }

    public void setAdresiLçesi(String adresiLçesi) {
        this.adresiLçesi = adresiLçesi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getGönderiCiId() {
        return gönderiCiId;
    }

    public void setGönderiCiId(Integer gönderiCiId) {
        this.gönderiCiId = gönderiCiId;
    }

    public String getTariH() {
        return tariH;
    }

    public void setTariH(String tariH) {
        this.tariH = tariH;
    }

    public String getGönderiCiAdi() {
        return gönderiCiAdi;
    }

    public void setGönderiCiAdi(String gönderiCiAdi) {
        this.gönderiCiAdi = gönderiCiAdi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kargoid != null ? kargoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kargo)) {
            return false;
        }
        Kargo other = (Kargo) object;
        if ((this.kargoid == null && other.kargoid != null) || (this.kargoid != null && !this.kargoid.equals(other.kargoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_proje_\u00f6devi_halilibrahim.Kargo[ kargoid=" + kargoid + " ]";
    }
    
}
