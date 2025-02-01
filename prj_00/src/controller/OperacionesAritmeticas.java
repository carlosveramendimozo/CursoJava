/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        double a = 147 , b = 39;
        
        System.out.println("la suma de a+b es " + (a+b));
        System.out.println("la resta de a-b es " + (a-b));
        System.out.println("la multiplicacion de a*b es " + (a*b));
        System.out.println("la division de a/b es " + (a/b));
        System.out.println("el resto de a%b es " + (a%b));
        
        a++;
        System.out.println("El valor de a despues de a++ es " + a);
        b--;
        System.out.println("El valor de a despues de b-- es " + b);
    }
}
