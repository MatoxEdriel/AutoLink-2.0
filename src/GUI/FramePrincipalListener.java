/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Matox
 */
public class FramePrincipalListener implements ActionListener{
    FramePrincipal frm;

    public FramePrincipalListener(FramePrincipal frm) {
        this.frm = frm;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == frm.getBtnRegistrarCliente()){
            InternalFrameCliente frameCliente= new InternalFrameCliente("Registro Cliente");
            frameCliente.setVisible(true);
            frm.getDesktopPane().add(frameCliente);
            System.out.println("AQUI");
        }
        
        if(obj == frm.getBtnRegistrarVehiculo()){
        
        
        }
        
        if(obj == frm.getBtnVisualizar()){
        
        
        }
        
        if(obj == frm.getBtnCerrar()){
            System.exit(0);
        }
        
  
    
    
    
    }
    
    
}
