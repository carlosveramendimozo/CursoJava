/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import model.*;
/**
 *
 * @author Alumno
 */
public class coleccion1 {
    public static void main(String[] args) {
        ArrayList colec1 = new ArrayList() ;
        
        colec1.add(3.14);
        colec1.add("Angie");
        colec1.add(2025);
        colec1.add(new automovil("ABC555","TOYOTA",2020));
        colec1.add(new automovil("ABC445","NISSAN",2010));
        colec1.add(new conductor("Q12345678","AIII-profesional","Ross"));
        colec1.add("Ultimo elemento");
        
        
        for(Object e: colec1){
            if(e instanceof automovil){
                System.out.println(((automovil)e).getPlaca());
            }else{
                System.out.println(e);
            }
            
        }
    }
}
