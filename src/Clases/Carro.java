/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Matox
 */
public class Carro extends Vehiculo{
    private int numeroAsiento;
    private int numeroPuertas;
    private String tipoCambio;

    public Carro(int numeroAsiento, int numeroPuertas, String tipoCambio, String numeroChasis, String matricula, String marca, String modelo) {
        super(numeroChasis, matricula, marca, modelo);
        this.numeroAsiento = numeroAsiento;
        this.numeroPuertas = numeroPuertas;
        this.tipoCambio = tipoCambio;
    }

    
    
    
    
    
    
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    
    
    

   
    
    
    
    
}
