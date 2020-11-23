/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan62.livingthing;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Living Thing
 */
public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama + " Sedang Bernafas");
    }
    
    public void eat(String nama) {
        System.out.println(nama + " Sedang Makan");
    }
    
}