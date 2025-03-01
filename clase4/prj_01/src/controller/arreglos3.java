/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class arreglos3 {
    public static void main(String[] args) {
        model.automovil veh1 = new model.automovil("ABC100","KIA",2005);
        System.out.println(veh1);
        
        int cantidad = 5;
        model.automovil vehs[];
      
        vehs = new model.automovil[cantidad];
        for(int i =0;i<cantidad;i++){
            vehs[i]=null;
        }
        
        
        vehs[3]= new model.automovil("WXZ222","VOLVO",2020);
        vehs[1]= new model.automovil("ABX222","NISSAN",2019);
        
        
        System.out.println("Lista de vehiculos");
        
        for(int i =0;i<cantidad;i++){
            if(vehs[i] != null){
            System.out.println(vehs[i]);
            }
        }
    }
}
