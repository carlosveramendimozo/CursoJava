/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class automovil {
    private String placa;
    private String marca;
    private int año_fab;

    public automovil(String placa, String marca, int año_fab) {
        this.placa = placa;
        this.marca = marca;
        this.año_fab = año_fab;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño_fab() {
        return año_fab;
    }

    public void setAño_fab(int año_fab) {
        this.año_fab = año_fab;
    }
    
    public int getAntiguedad() {
        return 2025 - año_fab;
    }

    @Override
    public String toString() {
        return "automovil{" + "placa=" + placa + ", marca=" + marca + ", a\u00f1o_fab=" + año_fab + '}';
    }
    
    
}
