/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_proje_ödevi_halilibrahim;




/**
 *
 * @author halil
 */
public class Gonderici extends Müsteri2 {

    //static ArrayList<Gonderici> göndericiler = new ArrayList();
    Paket p= new Paket();
    Alıcı a = new Alıcı();
    
        
    public Gonderici(String adı, String soyadı, String adresİli, String Adresİlçesi, String Adres, String telefon, String ePostaAdresi, String not) {
        this.adı = adı;
        this.soyadı = soyadı;
        this.adresİli = adresİli;
        this.adresİlçesi = Adresİlçesi;
        this.adres = Adres;
        this.telefon = telefon;
        this.ePosta = ePostaAdresi;
       
      
       
    }

    public Gonderici(String adı, String soyadı, String adresİli, String Adresİlçesi, String Adres, String telefon, String ePostaAdresi, String not, Paket p, Alıcı a) {
        this.adı = adı;
        this.soyadı = soyadı;
        this.adresİli = adresİli;
        this.adresİlçesi = Adresİlçesi;
        this.adres = Adres;
        this.telefon = telefon;
        this.ePosta = ePostaAdresi;
      
      
        this.p = p;
        this.a = a;
    }
    

    

    public Gonderici(String ePostaAdresi, String sifre) {
        this.ePosta = ePostaAdresi;
        this.sifre = sifre;
    }

    public Gonderici(String adı, String soyadı, String Adres, String telefon, String ePostaAdresi) {
        this.adı = adı;
        this.soyadı = soyadı;
        this.adres = Adres;
        this.telefon = telefon;
        this.ePosta = ePostaAdresi;
      
    }

    
    
    public Gonderici() {
    }

    Gonderici(String adı , String soyadı, String adresİli, String Adresİlçesi, String Adres, String telefon, String ePostaAdresi) {
        this.adı = adı;
        this.soyadı = soyadı;
        this.adresİli = adresİli;
        this.adresİlçesi = Adresİlçesi;
        this.adres = Adres;
        this.telefon = telefon;
        this.ePosta = ePostaAdresi;
    }

}
    

        
