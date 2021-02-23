/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_proje_ödevi_halilibrahim;

import java.util.ArrayList;

/**
 *
 * @author halil
 */
public class Alıcı extends Müsteri2 {
   
    static ArrayList <Alıcı> alıcılar= new ArrayList();

    public Alıcı(String adı, String soyadı, String Adresİli, String Adresİlçesi, String adres, String Telefon, String EPosta) {
        this.adı = adı;
        this.soyadı = soyadı;
        this.adresİli = Adresİli;
        this.adresİlçesi = Adresİlçesi;
        this.adres = adres;
        this.telefon = Telefon;
        this.ePosta = EPosta;
    }

    public Alıcı() {
    }
 
   
}
