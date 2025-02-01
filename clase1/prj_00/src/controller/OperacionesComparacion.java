/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class OperacionesComparacion {
    public static void main(String[] args) {
        int a=127,b=49,c=71;
        //>,<,>=,<=,!=,==
        System.out.println("a>b es " + (a>b));
        System.out.println("b>c es " + (b>c));
        System.out.println("a!=c es " + (a!=c));
        System.out.println("a==c es " + (a==c));
        
    // &&(and),||(or), !(not)
    // operaciones logicas
    System.out.println("a > b && b > c resulta " + (a > b || b > c ));
    System.out.println("a > b || b > c resulta " + (a > b || b > c ));
    System.out.println("a > b && !( b > c ) resulta " + (a > b && !( b > c )));
    }
}
