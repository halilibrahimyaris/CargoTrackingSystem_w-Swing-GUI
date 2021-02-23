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
@Table(name = "KURYE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kurye.findAll", query = "SELECT k FROM Kurye k")
    , @NamedQuery(name = "Kurye.findByPaketId", query = "SELECT k FROM Kurye k WHERE k.paketId = :paketId")
    , @NamedQuery(name = "Kurye.findByAliciad", query = "SELECT k FROM Kurye k WHERE k.aliciad = :aliciad")
    , @NamedQuery(name = "Kurye.findByAlicisoyad", query = "SELECT k FROM Kurye k WHERE k.alicisoyad = :alicisoyad")
    , @NamedQuery(name = "Kurye.findByAliciiL", query = "SELECT k FROM Kurye k WHERE k.aliciiL = :aliciiL")
    , @NamedQuery(name = "Kurye.findByAliciiL\u00e7e", query = "SELECT k FROM Kurye k WHERE k.aliciiL\u00e7e = :aliciiL\u00e7e")
    , @NamedQuery(name = "Kurye.findByAliciadres", query = "SELECT k FROM Kurye k WHERE k.aliciadres = :aliciadres")
    , @NamedQuery(name = "Kurye.findByAlicitelefon", query = "SELECT k FROM Kurye k WHERE k.alicitelefon = :alicitelefon")
    , @NamedQuery(name = "Kurye.findByAlicieposta", query = "SELECT k FROM Kurye k WHERE k.alicieposta = :alicieposta")
    , @NamedQuery(name = "Kurye.findByPakettiPi", query = "SELECT k FROM Kurye k WHERE k.pakettiPi = :pakettiPi")
    , @NamedQuery(name = "Kurye.findByTariH", query = "SELECT k FROM Kurye k WHERE k.tariH = :tariH")
    , @NamedQuery(name = "Kurye.findByG\u00f6nderiCiId", query = "SELECT k FROM Kurye k WHERE k.g\u00f6nderiCiId = :g\u00f6nderiCiId")
    , @NamedQuery(name = "Kurye.findByKargodurum", query = "SELECT k FROM Kurye k WHERE k.kargodurum = :kargodurum")})
public class Kurye implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PAKET_ID")
    private String paketId;
    @Column(name = "ALICIAD")
    private String aliciad;
    @Column(name = "ALICISOYAD")
    private String alicisoyad;
    @Column(name = "ALICI\u0130L")
    private String aliciiL;
    @Column(name = "ALICI\u0130L\u00c7E")
    private String aliciiLçe;
    @Column(name = "ALICIADRES")
    private String aliciadres;
    @Column(name = "ALICITELEFON")
    private String alicitelefon;
    @Column(name = "ALICIEPOSTA")
    private String alicieposta;
    @Column(name = "PAKETT\u0130P\u0130")
    private String pakettiPi;
    @Column(name = "TAR\u0130H")
    private String tariH;
    @Column(name = "G\u00d6NDER\u0130C\u0130ID")
    private String gönderiCiId;
    @Column(name = "KARGODURUM")
    private String kargodurum;

    public Kurye() {
    }

    public Kurye(String paketId) {
        this.paketId = paketId;
    }

    public String getPaketId() {
        return paketId;
    }

    public void setPaketId(String paketId) {
        this.paketId = paketId;
    }

    public String getAliciad() {
        return aliciad;
    }

    public void setAliciad(String aliciad) {
        this.aliciad = aliciad;
    }

    public String getAlicisoyad() {
        return alicisoyad;
    }

    public void setAlicisoyad(String alicisoyad) {
        this.alicisoyad = alicisoyad;
    }

    public String getAliciiL() {
        return aliciiL;
    }

    public void setAliciiL(String aliciiL) {
        this.aliciiL = aliciiL;
    }

    public String getAliciiLçe() {
        return aliciiLçe;
    }

    public void setAliciiLçe(String aliciiLçe) {
        this.aliciiLçe = aliciiLçe;
    }

    public String getAliciadres() {
        return aliciadres;
    }

    public void setAliciadres(String aliciadres) {
        this.aliciadres = aliciadres;
    }

    public String getAlicitelefon() {
        return alicitelefon;
    }

    public void setAlicitelefon(String alicitelefon) {
        this.alicitelefon = alicitelefon;
    }

    public String getAlicieposta() {
        return alicieposta;
    }

    public void setAlicieposta(String alicieposta) {
        this.alicieposta = alicieposta;
    }

    public String getPakettiPi() {
        return pakettiPi;
    }

    public void setPakettiPi(String pakettiPi) {
        this.pakettiPi = pakettiPi;
    }

    public String getTariH() {
        return tariH;
    }

    public void setTariH(String tariH) {
        this.tariH = tariH;
    }

    public String getGönderiCiId() {
        return gönderiCiId;
    }

    public void setGönderiCiId(String gönderiCiId) {
        this.gönderiCiId = gönderiCiId;
    }

    public String getKargodurum() {
        return kargodurum;
    }

    public void setKargodurum(String kargodurum) {
        this.kargodurum = kargodurum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paketId != null ? paketId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kurye)) {
            return false;
        }
        Kurye other = (Kurye) object;
        if ((this.paketId == null && other.paketId != null) || (this.paketId != null && !this.paketId.equals(other.paketId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bp2_proje_\u00f6devi_halilibrahim.Kurye[ paketId=" + paketId + " ]";
    }
    
}
