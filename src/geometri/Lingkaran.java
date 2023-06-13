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
public class Lingkaran {
    double radius;
    
    public Lingkaran(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double hitungLuas(){
        return Math.PI*radius*radius;
    }
    public double hitungKeliling(){
        return 2*Math.PI*radius;
    }
}
