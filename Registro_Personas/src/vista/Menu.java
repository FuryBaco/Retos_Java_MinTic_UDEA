package vista;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Persona;
import controlador.PersonaController;

public class Menu extends JFrame {

    // ATRIBUTOS
    private PersonaController controller;
    private JButton btnRegistrar;
    private JButton btnConsultar;
    private JButton btnConsultarXCedula;
    private JButton btnEliminar;
    private JButton btnSalir;  
    
    // CONSTRUCTOR
    public Menu() {
        controller = new PersonaController();
        // Configurar la ventana
        this.setTitle("Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.setBounds (300, 300, 300, 300);

        // Inicializar los atributos
        btnRegistrar = new JButton("Registrar");
        btnConsultar = new JButton("Consultar");
        btnConsultarXCedula = new JButton("ConsultarXCedula");
        btnEliminar = new JButton("Eliminar");
        btnSalir = new JButton("Salir");
        // Agregar los componentes a la ventana
        btnRegistrar.setBounds(10, 10, 100, 20);
        this.add(btnRegistrar);
        btnConsultar.setBounds(10, 30, 100, 20);
        this.add(btnConsultar);
        btnConsultarXCedula.setBounds(100, 50, 100, 20);
        this.add(btnConsultarXCedula);
        btnEliminar.setBounds(10, 70, 100, 20);
        this.add(btnEliminar);
        btnSalir.setBounds(10, 90, 100, 20);
        this.add(btnSalir);

        // Configurar los eventos
        registrar();
        consultar();
        consultarXCedula();
        

        // hacer visible la ventana
        this.setVisible(true);
    }

    // METODOS
    // Metodo para el boton Registrar
    public void registrar() {
        // Pone al boton a la escucha de eventos
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Abrir la ventana de formulario
                Formulario formulario = new Formulario(controller);
            }
        });
    }

    // Metodo para el boton Consultar
    public void consultar() {
        // Pone al boton a la escucha de eventos
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Mostrar el contenido de la lista
                String contenido = "";
                for (int i = 0; i < controller.getSize(); i++) {
                    contenido += controller.getPersona(i).toString() + "\n";
                }
                JOptionPane.showMessageDialog(null, contenido);
            }
        });
    }

    // Metodo para el boton ConsultarXCedula
    public void consultarXCedula() {
        // Pone al boton a la escucha de eventos
        btnConsultarXCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Pedir el numero de cedula
                String cedula = JOptionPane.showInputDialog("Ingrese la cedula");
                // Buscar la persona con la cedula
                Persona persona = controller.buscarPersona(cedula);
                // Mostrar el contenido de la persona
                if (persona != null) {
                    JOptionPane.showMessageDialog(null, persona.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No existe la persona");
                }
            }
        });
    }
}
