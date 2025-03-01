/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Persona1;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class EquipoFutbol {
    private String nombre;
    private ArrayList<Persona1> jugadores;

public EquipoFutbol(String nombre) {
    this.nombre = nombre;
    this.jugadores = new ArrayList<> ();
}


    
public void addJugador(Persona1 p){
    jugadores.add(p);
}

public void mostrarJugadores(){
    for(Persona1 j:jugadores){
        System.out.println(j);
    }
}

    @Override
    public String toString() {
        return "EquipoFutbol{" + "nombre=" + nombre + ", jugadores=" + jugadores + '}';
    }
}

