/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import IO.RepositorioEnum.Ciudad;

/**
 *
 * @author Matox
 */
public class Direccion {
    private Ciudad ciudad;
    private String calle;
    private String numeroCasa;

    public Direccion(Ciudad ciudad, String calle, String numeroCasa) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numeroCasa = numeroCasa;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
