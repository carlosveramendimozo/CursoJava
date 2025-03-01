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
public class test1 {
    public static void main(String[] args) {
        Persona1 p1 = new Persona1("12345678","miguel Angel");
        Persona1 p2 = new Persona1("98765432","ana maria");
        Pasaporte1 pass1 = new Pasaporte1("0012345678",p1);
        System.out.println(pass1);
    }
}
