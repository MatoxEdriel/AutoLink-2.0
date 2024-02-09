/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Matox
 */
public abstract class Vehiculo {
    protected String numeroChasis;
    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String numeroChasis, String matricula, String marca, String modelo) {
        this.numeroChasis = numeroChasis;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "numeroChasis=" + numeroChasis + ", matricula=" + matricula + ", marca=" + marca +
                ", modelo=" + modelo + '}';
    }
    
    
    
    
    
    
    
    
}
