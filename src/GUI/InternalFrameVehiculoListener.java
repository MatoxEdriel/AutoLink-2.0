/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Clases.Carro;
import Clases.Cliente;
import Clases.Moto;
import Clases.Vehiculo;
import IO.RepositorioEnum.TipoMoto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matox
 */
public class InternalFrameVehiculoListener implements ActionListener {

    InternalFrameVehiculo frm;
    List<Vehiculo> lstVehiculo;

    public InternalFrameVehiculoListener(InternalFrameVehiculo frm) {
        this.frm = frm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == frm.getBtnCrearCarro()) {
            String numeroChasis = frm.getTxtNumeroChasis().getText();
            String matricula = frm.getTxtMatricula().getText();
            String marca = frm.getTxtMarca().getText();
            String modelo = frm.getTxtModelo().getText();

            int numeroAsiento = Integer.parseInt(frm.getTxtNumeroAsiento().getText());
            int numeroPuertas = Integer.parseInt(frm.getTxtNumeroPuertas().getText());
            String tipoCambio = frm.getTxtTipoCambio().getText();

            Carro carro = new Carro(numeroAsiento, numeroPuertas, tipoCambio, numeroChasis, matricula, marca, modelo);

            addVehiculo(carro);

        }

        if (obj == frm.getBtnCrearMoto()) {
            String numeroChasis = frm.getTxtNumeroChasis().getText();
            String matricula = frm.getTxtMatricula().getText();
            String marca = frm.getTxtMarca().getText();
            String modelo = frm.getTxtModelo().getText();
            
            double cilindraje = Double.parseDouble(frm.getTxtCilindraje().getText());
            TipoMoto tipoMoto = (TipoMoto) frm.getCmbTipoMoto().getSelectedItem();
            
            Moto moto = new Moto(cilindraje, tipoMoto, numeroChasis, matricula, marca, modelo);
            
            addVehiculo(moto);
            
            
        }

    }

    public void addVehiculo(Vehiculo v) {
        if (lstVehiculo == null) {
            lstVehiculo = new ArrayList();

        } else {

            lstVehiculo.add(v);
        }

    }

}
