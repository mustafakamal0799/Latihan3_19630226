/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

/**
 *
 * @author MUSTAFA KAMAL
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran kamal1 = new Lingkaran(2);
        PersegiPanjang kamal2 = new PersegiPanjang(2,5);
        
        System.out.println("Luas : "+kamal1.hitungLuas());
        System.out.println("Keliling : "+kamal1.hitungKeliling());
        System.out.println("Luas : "+kamal2.getLuas());
        System.out.println("Keliling : "+kamal2.setKeliling());
    }
}
