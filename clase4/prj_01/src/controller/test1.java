/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class test1 {
    public static void main(String[] args) {
        int x,y,r;
        
        x = 25;
        y = 0;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        try {
          r = x / y;
          System.out.println(x + "/" + y + " resulta " + r);
        }
        catch(ArithmeticException e) { // para division por cero
            System.out.println("Se produjo un error de división por cero");
            System.out.println("Mensaje de error : " + e.getMessage());
        }
        catch(Exception e) { // para otro error
            System.out.println("Se produjo un error desconocido");
            System.out.println("Mensaje de error : " + e.getMessage());
        }
        System.out.println("\nSistema terminado correctamente");
    }
}