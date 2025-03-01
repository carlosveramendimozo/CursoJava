/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
/**
 *
 * @author Alumno
 */
public class test2 {
    public static void main(String[] args) {
        Persona1 p1 = new Persona1("12345678","miguel Angel");
        Persona1 p2 = new Persona1("98765432","ana maria");
        
       EquipoFutbol eq = new EquipoFutbol("boca junior");
        
        eq.addJugador(p1);
        eq.addJugador(p2);
        eq.addJugador(new Persona1("5558567","Abel"));
        eq.addJugador(new Persona1("1234567","Andres"));
        
        System.out.println(eq);
        eq.mostrarJugadores();
    }
}
