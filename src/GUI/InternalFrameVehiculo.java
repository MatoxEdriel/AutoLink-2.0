/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import IO.RepositorioEnum.TipoMoto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
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
public class InternalFrameVehiculo extends JInternalFrame {

    private JPanel contentPane;
    private JPanel pnlInformacion;
    private JPanel pnlRegistroVehiculo;
    private JPanel pnlNumeroUsuario;
    private ImageIcon iconoUsuario;

    private JPanel pnlVehiculos;

    private JTextField txtNumeroUsuario;

    private JLabel lblNumeroChasis;
    private JLabel lblMatricula;
    private JLabel lblMarca;
    private JLabel lblModelo;

    private JTextField txtNumeroChasis;
    private JTextField txtMatricula;
    private JTextField txtMarca;
    private JTextField txtModelo;

    private JTextField txtNumeroAsiento;
    private JTextField txtNumeroPuertas;
    private JTextField txtTipoCambio;

    private JTextField txtCilindraje;
    private JComboBox<TipoMoto> cmbTipoMoto;
  

    private JButton btnCrearCarro;
    private JButton btnCrearMoto;

    public InternalFrameVehiculo() {
        initComponents();
        addListener();

    }

    public InternalFrameVehiculo(String titulo) {
        super(titulo);
        initComponents();
        addListener();
    }

    public void addListener() {

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
        contentPane = new JPanel(new BorderLayout());

        Color paletaCeleste = new Color(0x5271FF);
        Color paletaBlanco = new Color(0xF5F5FA);
        Color paletaNegro = new Color(0x000000);
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        /*
            private JPanel pnlRegistroVehiculo;
    private JPanel pnlNumeroUsuario;
        
         */
        pnlRegistroVehiculo = new JPanel(new GridLayout(5, 1));
        pnlNumeroUsuario = new JPanel(new GridLayout(2, 2));
        JPanel pnlNumeroUsuario2 = new JPanel(new GridLayout(5, 1));
        pnlInformacion = new JPanel(new BorderLayout());

        Border bordeRedondeado = new JTextFieldRoundBorder(10);

        /*
           IconoUsuario = new ImageIcon("src/IMG/usuario2.jpg");
        lblIconoUsuario = new JLabel(IconoUsuario);
         */
        iconoUsuario = new ImageIcon("src/IMG/usuario2.jpg");
        JLabel lblIconoUsuario = new JLabel(iconoUsuario);
        JLabel lblNumeroUsuario = new JLabel("Numero Usuario");
        txtNumeroUsuario = new JTextField(10);
        pnlNumeroUsuario.add(lblIconoUsuario);
        pnlNumeroUsuario.setBackground(Color.WHITE);
        pnlNumeroUsuario2.setBackground(Color.WHITE);

        pnlNumeroUsuario2.add(lblNumeroUsuario);
        pnlNumeroUsuario2.add(txtNumeroUsuario);
        pnlNumeroUsuario.add(pnlNumeroUsuario2);
        txtNumeroUsuario.setBorder(bordeRedondeado);
        //USUARIO FIN 

        pnlInformacion.add(pnlNumeroUsuario, BorderLayout.WEST);

        pnlInformacion.add(pnlRegistroVehiculo);
        contentPane.add(pnlInformacion, BorderLayout.NORTH);

        /*
           private JLabel lblNumeroChasis;
    private JLabel lblMatricula;
    private JLabel lblMarca;
    private JLabel lblModelo;

    private JTextField txtNumeroChasis;
    private JTextField txtMatricula;
    private JTextField txtMarca;
    private JTextField txtModelo;
        
         */
        JLabel lblTituloVehiculo = new JLabel("Registro Vehicular");
        //AQUI USAR PALETAS 
        lblTituloVehiculo.setForeground(paletaCeleste);
        Font font = lblTituloVehiculo.getFont().deriveFont(30f);

        lblTituloVehiculo.setFont(font);
        lblNumeroChasis = new JLabel("Numero de chasis");
        lblMatricula = new JLabel("Matricula");
        lblMarca = new JLabel("Marca");
        lblModelo = new JLabel("Modelo ");
        JLabel space = new JLabel("");

        txtNumeroChasis = new JTextField();
        txtMatricula = new JTextField();
        txtMarca = new JTextField();
        txtModelo = new JTextField();
        JPanel pnlnumeroChasis = new JPanel(new GridLayout(2, 1));
        JPanel pnlMatricula = new JPanel(new GridLayout(2, 1));
        JPanel pnlMarca = new JPanel(new GridLayout(2, 1));
        JPanel pnlModelo = new JPanel(new GridLayout(2, 1));
        pnlnumeroChasis.add(lblNumeroChasis);
        pnlnumeroChasis.add(txtNumeroChasis);

        pnlMatricula.add(lblMatricula);
        pnlMatricula.add(txtMatricula);

        pnlMarca.add(lblMarca);
        pnlMarca.add(txtMarca);

        pnlModelo.add(lblModelo);
        pnlModelo.add(txtModelo);

        pnlRegistroVehiculo.add(lblTituloVehiculo);

        pnlRegistroVehiculo.add(pnlnumeroChasis);
        pnlnumeroChasis.setBackground(Color.WHITE);

        pnlRegistroVehiculo.add(pnlMatricula);
        pnlMatricula.setBackground(Color.WHITE);

        pnlRegistroVehiculo.add(pnlMarca);
        pnlMarca.setBackground(Color.WHITE);

        pnlRegistroVehiculo.add(pnlModelo);
        pnlModelo.setBackground(Color.WHITE);
        //TITUTLO 
        pnlRegistroVehiculo.setBackground(Color.WHITE);

        txtNumeroChasis.setBorder(bordeRedondeado);
        txtMatricula.setBorder(bordeRedondeado);
        txtMarca.setBorder(bordeRedondeado);
        txtModelo.setBorder(bordeRedondeado);
        pnlVehiculos = new JPanel(new GridLayout(1, 2));
        JPanel pnlCarro = new JPanel(new GridLayout(5, 1));
        JPanel pnlMoto = new JPanel(new GridLayout(5, 1));
        pnlVehiculos.add(pnlCarro);
        pnlVehiculos.add(pnlMoto);

        //PNLCARRO
        JLabel lblRegistrarCarro = new JLabel("Registrar Carro");
        Font fontCarro = lblRegistrarCarro.getFont().deriveFont(22f);
        lblRegistrarCarro.setFont(fontCarro);

        JLabel lblNumeroAsiento = new JLabel("Numero de asiento ");
        JLabel lblNumeroPuertas = new JLabel("Numero de puertas");
        JLabel lblTipoCambio = new JLabel("Tipo de cambio");

        txtNumeroAsiento = new JTextField(10);
        txtNumeroPuertas = new JTextField(10);
        txtTipoCambio = new JTextField(10);

        JPanel pnlNumeroAsiento = new JPanel(new GridLayout(2, 1));
        JPanel pnlNumeroPuertas = new JPanel(new GridLayout(2, 1));
        JPanel pnlTipoCambio = new JPanel(new GridLayout(2, 1));

        pnlNumeroAsiento.add(lblNumeroAsiento);
        pnlNumeroAsiento.add(txtNumeroAsiento);
        pnlCarro.add(lblRegistrarCarro);
        pnlCarro.add(pnlNumeroAsiento);

        pnlNumeroPuertas.add(lblNumeroPuertas);
        pnlNumeroPuertas.add(txtNumeroPuertas);
        pnlCarro.add(pnlNumeroPuertas);

        pnlTipoCambio.add(lblTipoCambio);
        pnlTipoCambio.add(txtTipoCambio);
        pnlCarro.add(pnlTipoCambio);

        JPanel pnlBtnCarro = new JPanel();

        btnCrearCarro = new JButton("Registrar Carro");
        pnlBtnCarro.add(btnCrearCarro);

        pnlCarro.add(pnlBtnCarro);

        //PNLMOTO 
        JLabel lblRegistrarMoto = new JLabel("Registrar Moto");
        Font fontMoto = lblRegistrarMoto.getFont().deriveFont(22f);
        lblRegistrarMoto.setFont(fontMoto);
        JLabel lblCilindraje = new JLabel("Cilindraje");
        JLabel lblTipoMoto = new JLabel("Tipo de moto");

        txtCilindraje = new JTextField(10);
          cmbTipoMoto = new JComboBox<>(TipoMoto.values());

        JPanel pnlCilindraje = new JPanel(new GridLayout(2, 1));
        JPanel pnlTipoMoto = new JPanel(new GridLayout(2, 1));

        pnlCilindraje.add(lblCilindraje);
        pnlCilindraje.add(txtCilindraje);
        pnlMoto.add(lblRegistrarMoto);
        pnlMoto.add(pnlCilindraje);

        pnlTipoMoto.add(lblTipoMoto);
        pnlTipoMoto.add(cmbTipoMoto);
        pnlMoto.add(pnlTipoMoto);

        JLabel lblSpace = new JLabel("");
        pnlMoto.add(lblSpace);
        JPanel pnlBtnMoto = new JPanel();
        btnCrearMoto = new JButton("Registrar Moto");
        pnlBtnMoto.add(btnCrearMoto);
        pnlMoto.add(pnlBtnMoto);

        /*
          JPanel pnlBtnCarro = new JPanel();
        btnCrearCarro = new JButton("Registrar Carro");
        pnlBtnCarro.add(btnCrearCarro);

        pnlCarro.add(pnlBtnCarro);
         */
        contentPane.add(pnlVehiculos, BorderLayout.CENTER);

    }

}
