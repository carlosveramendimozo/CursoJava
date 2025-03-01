/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class arreglos2 {
    
     public static void main(String[] args) {
        double precios[];
                precios = new double[5];
        precios[1]=25.5*1.1;
        precios[2]=198.90*1.1;
        precios[3]=45.50*1.1;
        precios[4]=1999.90*1.1;
        precios[5]=29.90*1.1;
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Precio1 es " + precios[i]+ ", IGV es " + precios[i]*0.18);
        }
}
}
