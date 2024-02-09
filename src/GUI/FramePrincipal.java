/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Matox
 */
public class FramePrincipal extends JFrame {

    private JPanel contentPane;
    private JPanel pnlOeste;
    //Seccion este centro informacion 
    private JPanel pnlCentro;
    private ImageIcon IconoTitulo;
    private JPanel pnlTitulo;
    private JPanel pnlDesktop;
    private JPanel pnlDerechosAutor;
    private JLabel lblDerechosNombre;
    

    //---------
    //Paleta de colores------
    private Color paletaCeleste;
    private Color paletaBlanco;
    private Color paletaNegro;

    //-----------------------
    //Seccion botones Oeste------------------
    private ImageIcon IconoUsuario;
    private ImageIcon IconoPrincipal;
    private JLabel lblIconoUsuario;
    private JLabel lblNombreUsuario;

    private JPanel pnlBtnRegistrar;
    private JButton btnRegistrarCliente;

    private JPanel pnlBtnVehiculo;
    private JButton btnRegistrarVehiculo;

    private JPanel pnlBtnVisualizar;
    private JButton btnVisualizar;

    private JPanel pnlBtnCerrar;
    private JButton btnCerrar;

    //------------------------------
    private JDesktopPane desktopPane;

    public FramePrincipal() {
        initComponents();
        setIconImage(IconoPrincipal.getImage());
        addListener();

    }

    public FramePrincipal(String titulo) {
        super(titulo);
        initComponents();
        setIconImage(IconoPrincipal.getImage());
        addListener();
    }

    public void addListener() {
        FramePrincipalListener listener  = new FramePrincipalListener(this);
        btnRegistrarCliente.addActionListener(listener);
        btnRegistrarVehiculo.addActionListener(listener);
        btnVisualizar.addActionListener(listener);
        btnCerrar.addActionListener(listener);
    }

    public void initComponents() {
        setSize(1200, 855);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        paletaCeleste = new Color(0x5271FF);
        paletaBlanco = new Color(0xF5F5FA);
        paletaNegro = new Color(0x000000);
         IconoPrincipal = new ImageIcon("src/IMG/ICONO.jpg");
        IconoTitulo = new ImageIcon("src/IMG/TITULO.jpg");
       
        

        pnlOeste = new JPanel(new GridLayout(6, 1));
        pnlOeste.setBackground(Color.WHITE);
        pnlCentro = new JPanel(new BorderLayout());
        pnlCentro.setBackground(paletaCeleste);
        desktopPane = new JDesktopPane();
        btnRegistrarCliente = new JButton("Registrar Cliente ");
        btnRegistrarVehiculo = new JButton("Registrar Vehiculo ");
        btnVisualizar = new JButton("Visualizar Informes");
        btnCerrar = new JButton("Finalizar");
        pnlBtnRegistrar = new JPanel();
        pnlBtnVehiculo = new JPanel();
        pnlBtnVisualizar = new JPanel();
        pnlBtnCerrar = new JPanel();
        contentPane.add(pnlOeste, BorderLayout.WEST);
        contentPane.add(pnlCentro, BorderLayout.CENTER);

        IconoUsuario = new ImageIcon("src/IMG/usuario2.jpg");
        lblIconoUsuario = new JLabel(IconoUsuario);

        JPanel pnlNombreUsuario = new JPanel();

        lblNombreUsuario = new JLabel("Hola Gabriel!!");

        pnlNombreUsuario.add(lblNombreUsuario);

        pnlOeste.add(lblIconoUsuario);
        pnlOeste.add(pnlNombreUsuario);
        pnlNombreUsuario.setBackground(paletaBlanco);

        pnlBtnRegistrar.add(btnRegistrarCliente);
        pnlOeste.add(pnlBtnRegistrar);
        pnlBtnRegistrar.setBackground(paletaBlanco);

        pnlBtnVehiculo.add(btnRegistrarVehiculo);
        pnlOeste.add(pnlBtnVehiculo);
        pnlBtnVehiculo.setBackground(paletaBlanco);

        pnlBtnVisualizar.add(btnVisualizar);
        pnlOeste.add(pnlBtnVisualizar);
        pnlBtnVisualizar.setBackground(paletaBlanco);
        pnlBtnCerrar.add(btnCerrar);
        pnlOeste.add(pnlBtnCerrar);
        pnlBtnCerrar.setBackground(paletaBlanco);

   
        JLabel lblIconoTitulo = new JLabel(IconoTitulo);

        pnlCentro.add(lblIconoTitulo, BorderLayout.NORTH);
        pnlDesktop = new JPanel();
        pnlDesktop.setBackground(paletaBlanco);

        pnlCentro.add(pnlDesktop, BorderLayout.CENTER);
        pnlCentro.add(desktopPane);
        
        pnlDerechosAutor = new JPanel(new BorderLayout());
        pnlCentro.add(pnlDerechosAutor, BorderLayout.SOUTH);
        lblDerechosNombre = new JLabel("by: Gabriel Campoverde Version 2.0, 2024-2025 ");   
                                    
     
        pnlDerechosAutor.setBackground(paletaCeleste);
        pnlDerechosAutor.add(lblDerechosNombre, BorderLayout.EAST );


    }

    public JButton getBtnRegistrarCliente() {
        return btnRegistrarCliente;
    }

    public JButton getBtnRegistrarVehiculo() {
        return btnRegistrarVehiculo;
    }

    public JButton getBtnVisualizar() {
        return btnVisualizar;
    }

    public JButton getBtnCerrar() {
        return btnCerrar;
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

}
