/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import IO.RepositorioEnum.Ciudad;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Matox
 */
public class InternalFrameCliente extends JInternalFrame {

    private JPanel contentPane;
    private JPanel pnlImagenEste;
    private JLabel lblImagenEste;
    private JPanel pnlCentro;

    private ImageIcon ImagenEste;

    private JTextField txtNombre;
    private JTextField txtCedula;
    private JTextField txtApellido;

    private JLabel lblDireccionDomicilio;
    private JLabel lblDireccionLaboral;

    private JLabel lblTituloRegistro;
    private JButton btnRegistrar;
    private JButton btnAsignarVehiculo;
    private JPanel pnlDireccionDomicilio;
    private JPanel pnlDireccionLaboral;

    private JComboBox<Ciudad> cmbCiudadL;
    private JComboBox<Ciudad> cmbCiudad;

    private JTextField txtCalleL;
    private JTextField txtCalle;
    private JTextField txtNumero;
    private JTextField txtNumeroL;

    public InternalFrameCliente() {
        initComponents();
        addListener();
    }

    public InternalFrameCliente(String titulo) {
        super(titulo);
        initComponents();
        addListener();

    }

    public void addListener() {
        InternalFrameClienteListener listener = new InternalFrameClienteListener(this);
        btnRegistrar.addActionListener(listener);
        btnAsignarVehiculo.addActionListener(listener);

    }

    private class JTextFieldRoundBorder implements Border {

        private int radio;

        public JTextFieldRoundBorder(int radio) {
            this.radio = radio;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radio + 1, this.radio + 1, this.radio + 1, this.radio + 1);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, this.radio, this.radio);
        }
    }

    public void initComponents() {
        setBounds(15, 5, 1000, 723);
        setResizable(true);
        setIconifiable(true);
        setClosable(true);
        setMaximizable(true);
        Color paletaCeleste = new Color(0x5271FF);
        Color paletaBlanco = new Color(0xF5F5FA);
        Color paletaNegro = new Color(0x000000);
        contentPane = new JPanel(new GridLayout(1, 2));
        setContentPane(contentPane);
        contentPane.setBackground(Color.white);

        //  Border bordeInferior = BorderFactory.createMatteBorder(0, 0, 50, 0, Color.BLACK);
        // Border bordeVacio = BorderFactory.createEmptyBorder(0, 0, 0, 0);
        // Border bordeCompuesto = BorderFactory.createCompoundBorder(bordeVacio, bordeInferior);
        /*
        
    private JPanel contentPane;
    private JPanel pnlImagenEste;
    private JPanel pnlCentro;
        
         
    private JLabel lblDireccionDomicilio;
    private JLabel lblDireccionLaboral;
    
    private JLabel lblTituloRegistro;
    private JButton btnRegistrar;
    private JPanel pnlDireccionDomicilio;
    private JPanel pnlDireccionLaboral;
        
         */
        pnlCentro = new JPanel(new GridLayout(7, 1));

        pnlDireccionDomicilio = new JPanel(new GridLayout(3, 2));
        pnlDireccionLaboral = new JPanel(new GridLayout(3, 2));
        pnlDireccionLaboral.setPreferredSize(new Dimension(100, 100)); 
        pnlDireccionDomicilio.setPreferredSize(new Dimension(100, 100)); 

        lblTituloRegistro = new JLabel("Registro ");
        Font font = lblTituloRegistro.getFont().deriveFont(40f);

        lblTituloRegistro.setFont(font);
        pnlCentro.setBackground(Color.WHITE);

        contentPane.add(pnlCentro);
        pnlCentro.add(lblTituloRegistro);

        JPanel pnlNombre = new JPanel(new GridLayout(2, 1));

        pnlNombre.setBackground(Color.white);
        JPanel pnlCedula = new JPanel(new GridLayout(2, 1));

        pnlCedula.setBackground(Color.white);
        JPanel pnlApellido = new JPanel(new GridLayout(2, 1));
        pnlApellido.setBackground(Color.white);
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblCedula = new JLabel("Cedula");
        JLabel lblApellido = new JLabel("Apellido");

        txtNombre = new JTextField(5);
        txtCedula = new JTextField(5);
        txtApellido = new JTextField(5);

        Border bordeRedondeado = new JTextFieldRoundBorder(10);
        // Asignar el borde redondeado a los JTextField
        txtNombre.setBorder(bordeRedondeado);
        txtCedula.setBorder(bordeRedondeado);
        txtApellido.setBorder(bordeRedondeado);

        /*
            private JTextField txtNombre;
    private JTextField txtCedula;
    private JTextField txtApellido;
        
         */
        pnlNombre.add(lblNombre);
        pnlNombre.add(txtNombre);

        pnlCentro.add(pnlNombre);

        pnlCedula.add(lblCedula);
        pnlCedula.add(txtCedula);
        pnlCentro.add(pnlCedula);

        pnlApellido.add(lblApellido);
        pnlApellido.add(txtApellido);
        pnlCentro.add(pnlApellido);

        JLabel lblCiudad = new JLabel("Ciudad");
        cmbCiudad = new JComboBox<>(Ciudad.values());
        cmbCiudad.setPreferredSize(new Dimension(100, 100));

        //JCOMBOBOX con enum 
        JLabel lblCalle = new JLabel("Calle");
       txtCalle = new JTextField(10);

        JLabel lblNumero = new JLabel("Numero de casa: ");
       txtNumero = new JTextField(10);

        //Laboral -------------------------------------------
        JLabel lblCiudadL = new JLabel("Ciudad");
        cmbCiudadL = new JComboBox<>(Ciudad.values());
        cmbCiudadL.setPreferredSize(new Dimension(100, 100));
        JLabel lblCalleL = new JLabel("Calle");
     txtCalleL = new JTextField(10);

        JLabel lblNumeroL = new JLabel("Numero de casa: ");
       txtNumeroL = new JTextField(10);
        //--------------------------------------------------

        JPanel pnlDireccionD = new JPanel(new GridLayout(2, 1));
        JPanel pnlDireccionL = new JPanel(new GridLayout(2, 1));
        lblDireccionDomicilio = new JLabel("Direccion Domicilio");
        Font font2 = lblDireccionDomicilio.getFont().deriveFont(20f);

        lblDireccionDomicilio.setFont(font2);
        lblDireccionLaboral = new JLabel("Direccion Laboral ");
        Font font3 = lblDireccionLaboral.getFont().deriveFont(20f);
        lblDireccionLaboral.setFont(font3);
        /*
       pnlDireccionDomicilio = new JPanel(new GridLayout(4,2));
        pnlDireccionLaboral = new JPanel(new GridLayout(4,2));
       
         */
         
        
        pnlDireccionD.add(lblDireccionDomicilio);
//       pnlDireccionD.add(lblCiudad);
//       pnlDireccionD.add(cmbCiudad);
        //TXT
        pnlDireccionDomicilio.add(lblCiudad);
        pnlDireccionDomicilio.add(cmbCiudad);
        pnlDireccionDomicilio.add(lblCalle);
        pnlDireccionDomicilio.add(txtCalle);
        pnlDireccionDomicilio.add(lblNumero);
        pnlDireccionDomicilio.add(txtNumero);

        pnlDireccionD.add(pnlDireccionDomicilio);
        pnlDireccionD.setBackground(Color.WHITE);
        pnlCentro.add(pnlDireccionD);

        /*
              JLabel lblCiudadL = new JLabel("Ciudad");
        JComboBox<Ciudad> cmbCiudadL = new JComboBox<>(Ciudad.values());
        JLabel lblCalleL = new JLabel("Calle");
        JTextField txtCalleL = new JTextField(10);

        JLabel lblNumeroL = new JLabel("Numero de casa: ");
        JTextField txtNumeroL = new JTextField(10);
        
        
         */
        pnlDireccionLaboral.add(lblCiudadL);
     
        pnlDireccionLaboral.add(cmbCiudadL);
        pnlDireccionLaboral.add(lblCalleL);
        pnlDireccionLaboral.add(txtCalleL);
        pnlDireccionLaboral.add(lblNumeroL);
        pnlDireccionLaboral.add(txtNumeroL);
        pnlDireccionDomicilio.setBackground(Color.WHITE);
           pnlDireccionLaboral.setBackground(Color.WHITE);
        pnlDireccionL.add(lblDireccionLaboral);
        pnlDireccionL.add(pnlDireccionLaboral);
        pnlDireccionL.setBackground(Color.WHITE);
        pnlCentro.add(pnlDireccionL);

        /*
            private JButton btnRegistrar;
    private JButton btnAsignarVehiculo;
        
         */
        btnRegistrar = new JButton("Registrar Cliente");
        btnAsignarVehiculo = new JButton("Asignar Vehiculo");

        JPanel pnlBotones = new JPanel();
        pnlBotones.add(btnRegistrar);
        pnlBotones.add(btnAsignarVehiculo);

        pnlCentro.add(pnlBotones);
        pnlBotones.setBackground(Color.WHITE);

        //  pnlCentro.add(btnRegistrar);
        // pnlCentro.add(btnAsignarVehiculo);
        //CAMBIAR COLOR A BLANCO Y LA LINEA NEGRA 
        ImagenEste = new ImageIcon("src/IMG/IMAGENREGISTRO.jpg");
        lblImagenEste = new JLabel(ImagenEste);
        contentPane.add(lblImagenEste);

        //MODIFICAR LA IMAGEN 
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JButton getBtnAsignarVehiculo() {
        return btnAsignarVehiculo;
    }

    public JComboBox<Ciudad> getCmbCiudadL() {
        return cmbCiudadL;
    }

    public JComboBox<Ciudad> getCmbCiudad() {
        return cmbCiudad;
    }

    public JTextField getTxtCalleL() {
        return txtCalleL;
    }

    public JTextField getTxtCalle() {
        return txtCalle;
    }

    public JTextField getTxtNumero() {
        return txtNumero;
    }

    public JTextField getTxtNumeroL() {
        return txtNumeroL;
    }

}
