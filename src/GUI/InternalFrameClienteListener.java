/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Clases.Cliente;
import Clases.Direccion;
import IO.RepositorioEnum.Ciudad;
import IO.Serializacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matox
 */
public class InternalFrameClienteListener implements ActionListener {

    InternalFrameCliente frm;
    List<Cliente> lstCliente;

    public InternalFrameClienteListener(InternalFrameCliente frm) {
        this.frm = frm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == frm.getBtnRegistrar()) {
            String nombre = frm.getTxtNombre().getText();
            String cedula = frm.getTxtCedula().getText();
            String apellido = frm.getTxtApellido().getText();
            //

            //REPASAR 
            Ciudad ciudad = (Ciudad) frm.getCmbCiudad().getSelectedItem();
            String calle = frm.getTxtCalle().getText();
            String numeroCasa = frm.getTxtNumero().getText();
            Direccion direccionDomicilio = new Direccion(ciudad, calle, numeroCasa);

            //---------------------------------------
            Ciudad ciudadL = (Ciudad) frm.getCmbCiudadL().getSelectedItem();
            String calleL = frm.getTxtCalleL().getText();
            String numeroCasaL = frm.getTxtNumeroL().getText();
            Direccion direccionLaboral = new Direccion(ciudadL, calleL, numeroCasaL);

            Cliente cliente = new Cliente(nombre, cedula, apellido, direccionLaboral, direccionDomicilio);

            addCliente(cliente);
            
            
            Serializacion.guardarLista(lstCliente);
            
            
        }

    }

    public void addCliente(Cliente c) {
        if (lstCliente == null) {
            lstCliente = new ArrayList();

        } else {

            lstCliente.add(c);
        }

    }
    
    

}
