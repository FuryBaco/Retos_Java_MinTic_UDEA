package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controlador.PersonaController;

//Crear una clase que herede de JFrame 
public class Formulario extends JFrame {
    //  ATRIBUTOS
    private PersonaController controller;
    //  ATRIBUTOS GUI
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblEdad;
    private JLabel lblSexo;
    private JLabel lblCedula;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtEdad;
    private JTextField txtSexo;
    private JTextField txtCedula;
    private JButton btnRegistrar;

    //  CONSTRUCTOR
    public Formulario() {
        controller = new PersonaController();
        //  Inicializar los atributos
        lblNombre = new JLabel("Nombre");
        lblApellido = new JLabel("Apellido");
        lblEdad = new JLabel("Edad");
        lblSexo = new JLabel("Sexo");
        lblCedula = new JLabel("Cedula");
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtEdad = new JTextField();
        txtSexo = new JTextField();
        txtCedula = new JTextField();
        btnRegistrar = new JButton("Registrar");
        //  Agregar los componentes a la ventana
        lblNombre.setBounds(10, 10, 70, 10);
        this.add(lblNombre);
        txtNombre.setBounds(80, 10, 70, 20);
        this.add(txtNombre);
        lblApellido.setBounds(10, 30, 70, 10);
        this.add(lblApellido);
        txtApellido.setBounds(80, 30, 70, 20);
        this.add(txtApellido);
        lblEdad.setBounds(10, 50, 70, 10);
        this.add(lblEdad);
        txtEdad.setBounds(80, 50, 70, 20);
        this.add(txtEdad);
        lblSexo.setBounds(10, 70, 70, 10);
        this.add(lblSexo);
        txtSexo.setBounds(80, 70, 70, 20);
        this.add(txtSexo);
        lblCedula.setBounds(10, 90, 70, 10);
        this.add(lblCedula);
        txtCedula.setBounds(80, 90, 70, 20);
        this.add(txtCedula);
        btnRegistrar.setBounds(80, 150, 140, 20);
        this.add(btnRegistrar);

        //  Configurar el layout de la ventana
        this.getContentPane().setLayout(null);
        //  Configurar el tamaño de la ventana y la ubicacion en el centro de la pantalla
        this.setBounds(200, 200, 300, 300);
        //  Configurar el titulo de la ventana
        this.setTitle("Formulario");
        //  Hacer que la ventana se cierre al hacer click en el boton cerrar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  MANEJADORES DE EVENTOS
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //  Poner acciones a realizar cuando se haga click en el boton
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                int edad = Integer.parseInt(txtEdad.getText());
                char sexo = txtSexo.getText().charAt(0);
                String cedula = txtCedula.getText();

                controller.agregarPersona(nombre, apellido, edad, sexo, cedula);
                JOptionPane.showMessageDialog(null, "Persona registrada");
                //  llamar al metodo limpiarCampos()
                limpiarCampos();

            }
        //Metodo para Limpiar ls campos de texto
        public void limpiarCampos() {
            txtNombre.setText("");
            txtApellido.setText("");
            txtEdad.setText("");
            txtSexo.setText("");
            txtCedula.setText("");
        }
        });


        //  Hacer que la ventana se vea
        this.setVisible(true);
    }
}//fin de la clase Formulario


