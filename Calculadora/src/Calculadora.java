import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
    //ATRIBUTOS
    private JLabel lblNumero1;
    private JLabel lblNumero2;
    private JLabel lblResultado;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnSumar;
    
    //CONSTRUCTOR
    public Calculadora(){
        //Poner titulo a la ventana
        this.setTitle("Calculadora GUI");
        //Poner tamaño a la ventana y coordenadas
        this.setBounds(0, 0, 300, 300);
        //Configurar el boton de cerrar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Eliminar el esquema que trae por defecto el JFrame (por defecto un FlowLayout)
        this.getContentPane().setLayout(null);

        //Inicializar los atributos
        //lblNumero1
        lblNumero1 = new JLabel("Numero 1:");
        //lblNumero1 posicionamiento y tamaño
        lblNumero1.setBounds(10, 10, 100, 20);
        //lblNumero1 añadir al JFrame
        this.getContentPane().add(lblNumero1);

        //txtNumero1
        txtNumero1 = new JTextField();
        //txtNumero1 posicionamiento y tamaño
        txtNumero1.setBounds(120, 10, 100, 20);
        //txtNumero1 añadir al JFrame
        this.getContentPane().add(txtNumero1);

        //lblNumero2
        lblNumero2 = new JLabel("Numero 2:");
        //lblNumero2 posicionamiento y tamaño
        lblNumero2.setBounds(10, 40, 100, 20);
        //lblNumero2 añadir al JFrame
        this.getContentPane().add(lblNumero2);

        //txtNumero2
        txtNumero2 = new JTextField();
        //txtNumero2 posicionamiento y tamaño
        txtNumero2.setBounds(120, 40, 100, 20);
        //txtNumero2 añadir al JFrame
        this.getContentPane().add(txtNumero2);
        
        //lblResultado
        lblResultado = new JLabel("Resultado:");
        //lblResultado posicionamiento y tamaño
        lblResultado.setBounds(100, 130, 100, 20);
        //lblResultado añadir al JFrame
        this.getContentPane().add(lblResultado);
        
        //btnSumar
        btnSumar = new JButton("Sumar");
        //btnSumar posicionamiento y tamaño
        btnSumar.setBounds(100, 100, 100, 20);
        //btnSumar añadir al JFrame
        this.getContentPane().add(btnSumar);

        //MANEJA EL EVENTOS
        //Añadir manejador de eventos al boton btnSumar
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Obtener el valor de los campos de texto
                String numero1 = txtNumero1.getText();
                String numero2 = txtNumero2.getText();
                //Convertir los valores a int
                int num1 = Integer.parseInt(numero1);
                int num2 = Integer.parseInt(numero2);
                //Sumar los valores
                int resultado = sumar(num1, num2);
                //Mostrar el resultado en el label
                lblResultado.setText("Resultado:"+String.valueOf(resultado));
                //Limpiar los campos de texto
                limpiar();
            }
        });

        //Mostrar la calculadora
        this.setVisible(true);
    }

        //Crear un metodo para sumar dos numeros
        public int sumar(int num1, int num2){
            return num1 + num2;
        }

        //Crear un metodo para limpiar los campos de texto
        public void limpiar(){
            txtNumero1.setText("");
            txtNumero2.setText("");
        }
}

