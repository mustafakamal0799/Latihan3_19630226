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
public class PersegiPanjang {
    double panjang, lebar;
    
    public PersegiPanjang(double panjang,double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void setLuas(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double getLuas(){
        return panjang*lebar;
    }
    public double setKeliling(){
        return 2*(panjang+lebar);
    }
}
