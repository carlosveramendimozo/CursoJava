/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Pasaporte1 {
    private String nro_pasaporte;
    private Persona1 persona;

    public Pasaporte1(String nro_pasaporte, Persona1 persona) {
        this.nro_pasaporte = nro_pasaporte;
        this.persona = persona;
    }

    public String getNro_pasaporte() {
        return nro_pasaporte;
    }

    public void setNro_pasaporte(String nro_pasaporte) {
        this.nro_pasaporte = nro_pasaporte;
    }

    public Persona1 getPersona() {
        return persona;
    }

    public void setPersona(Persona1 persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "pasaporte{" + "nro_pasaporte=" + nro_pasaporte + ", persona=" + persona + '}';
    }
    
    
}
