/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import IO.RepositorioEnum.TipoMoto;

/**
 *
 * @author Matox
 */
public class Moto extends Vehiculo{
    private double cilindraje;
    private TipoMoto tipoMoto;

    public Moto(double cilindraje, TipoMoto tipoMoto, String numeroChasis, String matricula, String marca, String modelo) {
        super(numeroChasis, matricula, marca, modelo);
        this.cilindraje = cilindraje;
        this.tipoMoto = tipoMoto;
    }

    
    
    
    
    public double getCilindraje() {
        return cilindraje;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
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
