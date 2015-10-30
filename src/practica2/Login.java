package practica2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Login {

	//ATRIBUTOS
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	//MÉTODOS
	private void initialize() {
		frame = new JFrame("Login");
		frame.setBounds(100, 100, 705, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 237, 689, 209);
		frame.getContentPane().add(textArea);
		
		JLabel labelIdentificacion = new JLabel("Identificaci\u00F3n del usuario");
		labelIdentificacion.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelIdentificacion.setHorizontalAlignment(SwingConstants.LEFT);
		labelIdentificacion.setBounds(41, 75, 167, 14);
		frame.getContentPane().add(labelIdentificacion);
		
		JLabel labelUsuario = new JLabel("USUARIO");
		labelUsuario.setBounds(41, 115, 59, 14);
		frame.getContentPane().add(labelUsuario);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(41, 153, 65, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(110, 112, 148, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 150, 148, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsuarioRegistrado = new JLabel("Usuario registrado?");
		lblUsuarioRegistrado.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuarioRegistrado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuarioRegistrado.setBounds(318, 75, 167, 14);
		frame.getContentPane().add(lblUsuarioRegistrado);
		
		JRadioButton rdbtnUsuarioRegistrado = new JRadioButton("Usuario registrado");
		rdbtnUsuarioRegistrado.setBounds(318, 111, 148, 23);
		frame.getContentPane().add(rdbtnUsuarioRegistrado);
		
		JRadioButton rdbtnUsuarioNuevo = new JRadioButton("Usuario nuevo");
		rdbtnUsuarioNuevo.setBounds(318, 149, 148, 23);
		frame.getContentPane().add(rdbtnUsuarioNuevo);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(491, 149, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(590, 149, 89, 23);
		frame.getContentPane().add(btnAyuda);
		
		JLabel lblIdentificacinDelUsuario = new JLabel("IDENTIFICACI\u00D3N DEL USUARIO (USUARIO/PASSWORD");
		lblIdentificacinDelUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIdentificacinDelUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdentificacinDelUsuario.setBounds(0, 11, 689, 14);
		frame.getContentPane().add(lblIdentificacinDelUsuario);
	}

	//MAIN
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//CONSTRUCTOR
	public Login() {
		initialize();
	}
}