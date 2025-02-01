/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class DecisionUnaOpcion {
    public static void main(String[] args) {
        //determinar si un año es bisiesto
        //el año debe ser multiplo de 4 pero no de 100, pero si de 400
        int año = 2000;
        
       boolean r = (año % 4 == 0 && año % 100 !=0 || año % 400 == 0);
       
       if (r==true){
           System.out.println(año + " es bisiesto");
       }
                
    }
}
