/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class Participacion {
    public static void main(String[] args) {
        float nota=25f;
            if(nota<=20 && nota >=14){
                System.out.println("APROVADO");
            } 
            if(nota <14 && nota >=10){
                System.out.println("SUSTITURORIO");
            } 
            if(nota <10 && nota>=0){
                System.out.println("DESAPROBADO");
            }
            if(nota>20 || nota<0){
                System.out.println("CALIFICACION INVALIDA");
            }
            
    }
    }

