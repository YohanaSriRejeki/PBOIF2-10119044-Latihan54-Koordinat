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
public class WarnaKoordinat extends Koordinat{
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna){
        super(x, y);
        this.namaWarna = "Jingga";
    }
    
    public String getNamaWarna(){
        return namaWarna;
    }
    
    public void setNamaWarna(String namaWarna){
        this.namaWarna = namaWarna;
    }
}
