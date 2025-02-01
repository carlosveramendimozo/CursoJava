/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class AreaCirculo {
    public static void main(String[] args) {
        // calcular el area de una
        // circunferencia de radio = 2,5
        double radio = 2.5f; // declaracion o definicion de la varible
                      // Tipo_de_dato nombre_variable;
        double area;
        final double pi=3.141592654f ;// final antes -> no se puede cambiar el valor
        area = pi * radio * radio;
       System.out.println("El area de un circulo de radio " + radio + " es " +  area);
    }
}
