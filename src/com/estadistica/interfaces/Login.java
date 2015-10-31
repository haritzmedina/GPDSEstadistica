package com.estadistica.interfaces;

import com.estadistica.db.UserAccess;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Login {

	//ATRIBUTOS
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private static JTextArea textArea;
	private static Login miLogin;

	//MÉTODOS
	public static Login getLogin() {
		if(miLogin == null) {
			miLogin = new Login();
		}
		return miLogin;
	}
	
	public static JTextArea getTextArea() {
		return textArea;
	}
	
	private void initialize() {
		frame = new JFrame("Login");
		frame.setBounds(100, 100, 705, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
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
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(110, 150, 148, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		/*JLabel lblUsuarioRegistrado = new JLabel("Usuario registrado?");
		lblUsuarioRegistrado.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuarioRegistrado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuarioRegistrado.setBounds(318, 75, 167, 14);
		frame.getContentPane().add(lblUsuarioRegistrado);*/
		
		/*JRadioButton rdbtnUsuarioRegistrado = new JRadioButton("Usuario registrado");
		rdbtnUsuarioRegistrado.setBounds(318, 111, 148, 23);
		frame.getContentPane().add(rdbtnUsuarioRegistrado);
		
		JRadioButton rdbtnUsuarioNuevo = new JRadioButton("Usuario nuevo");
		rdbtnUsuarioNuevo.setBounds(318, 149, 148, 23);
		frame.getContentPane().add(rdbtnUsuarioNuevo);*/
		
		JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(318, 149, 148, 23);
		frame.getContentPane().add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((new UserAccess()).userLogin(textField.getText(), textField_1.getText())){
                    textArea.append("Login correcto para usuario: "+textField.getText()+"\n");
                    textArea.append("Abriendo menu para elección de programa\n");
                    try {
						MenuEleccion me = new MenuEleccion();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                }
                else{
                    textArea.append("Login incorrecto para usuario: "+textField.getText()+"\n");
                }
            }
        });

		JButton btnSignup = new JButton("Registrar");
        btnSignup.setBounds(318, 111, 148, 23);
		frame.getContentPane().add(btnSignup);

        btnSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                (new UserAccess()).createUser(textField.getText(), textField_1.getText());
                textArea.append("Usuario registrado: "+textField.getText()+"\n");
            }
        });
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(590, 149, 89, 23);
		frame.getContentPane().add(btnAyuda);
		
		JLabel lblIdentificacinDelUsuario = new JLabel("IDENTIFICACI\u00D3N DEL USUARIO (USUARIO/PASSWORD)");
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
	private Login() {
		initialize();
	}
}