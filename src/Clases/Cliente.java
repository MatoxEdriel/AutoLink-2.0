/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author Matox
 */
public class Cliente {

    private String nombre;
    private String cedula;
    private String apellido;
    private Direccion direccionLaboral;
    private Direccion direccionDomicilio;
    private List<Vehiculo> lstVehiculo = null;

    private String codigo;

    public Cliente(String nombre, String cedula, String apellido, Direccion direccionLaboral, Direccion direccionDomicilio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        //Dos objetos 
        this.direccionLaboral = direccionLaboral;
        this.direccionDomicilio = direccionDomicilio;
        //Pensar Aqui 
        generarCodigo();
        
        
        
    }


    
    
    
    public void generarCodigo() {

        //Code
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Direccion getDireccionLaboral() {
        return direccionLaboral;
    }

    public Direccion getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public List<Vehiculo> getLstVehiculo() {
        return lstVehiculo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccionLaboral=" + direccionLaboral + ", direccionDomicilio=" + direccionDomicilio + ", lstVehiculo=" + lstVehiculo + '}';
    }

    public void addVehiculo(Vehiculo vehiculo) {
        lstVehiculo.add(vehiculo);

    }

}
