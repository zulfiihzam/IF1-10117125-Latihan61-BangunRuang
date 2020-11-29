/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan61.bangunruang;

/**
 *
 * Nama : Zulfi Ihzam Rahmat
 * Kelas : IF-1
 * Nim : 10117125 
 * Deskripsi Program : Program ini berisi tentang menghitung volume pada bangun 
 *                     ruang.
 */
public class IF110117125Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hitung Bola Basket
        BolaBasket bola = new BolaBasket();
        bola.setJari(7);
        System.out.println("=========HitungBola=========");
        System.out.println("Jari Jari Bola : "+bola.getJari());
        System.out.println("Volume Bola : "+bola.hitungVolume());
        System.out.println("");
        
        //Hitung Tabung
        Tabung tabung = new Tabung();
        tabung.setTinggi(21);
        tabung.setJari(10);
        System.out.println("=========HitungTabung==========");
        System.out.println("Tinggi Tabung : "+tabung.getTinggi());
        System.out.println("Jari Jari Tabung : "+tabung.getJari());
        System.out.println("Volume Tabung : "+Math.ceil(tabung.hitungVolume()));
        System.out.println("");
        
        //hitung Kerucut
        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.println("=========HitungKerucut===========");
        System.out.println("Tinggi Kerucut : "+kerucut.getTinggi());
        System.out.println("Jari Jari Kerucut : "+kerucut.getJari());
        System.out.println("Volume kerucut " + kerucut.hitungVolume());
    }
    
}
