/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan54.koordinat;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan koordinat dan warnanya
 */

public class PBOIF210119044Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : "+wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wk.getX()+", "+"y : "+wk.getY());     
    }  
}
