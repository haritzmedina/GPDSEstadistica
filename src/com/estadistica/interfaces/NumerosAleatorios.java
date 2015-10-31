package com.estadistica.interfaces;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.estadistica.db.UserAccess;
import com.estadistica.examples.E1Random;
import com.estadistica.examples.E3Random;
import com.estadistica.examples.E4Random;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class NumerosAleatorios {

	//ATRIBUTOS
	private JFrame frame;
	private int numeroEjemplo;
	private JLabel labelNombre;

	//MÉTODOS
	public int getNumeroEjemplo() {
		return numeroEjemplo;
	}
	
	public void setNumeroEjemplo(int numeroEjemplo) {
		this.numeroEjemplo = numeroEjemplo;
	}
	

	/**
	 * Create the application.
	 */
	public NumerosAleatorios(int numeroEjemplo) {
		setNumeroEjemplo(numeroEjemplo);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 705, 530);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmeros aleatorios");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 669, 22);
		frame.getContentPane().add(lblNewLabel);
		
		labelNombre = new JLabel("Clases de Java para la generaci\u00F3n de n\u00FAmeros aleatorios");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelNombre.setHorizontalAlignment(SwingConstants.CENTER);
		labelNombre.setBounds(10, 44, 669, 14);
		frame.getContentPane().add(labelNombre);
		
		añadirDatos();
		
		JLabel lblNewLabel_2 = new JLabel("Descripci\u00F3n:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(189, 95, 279, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Ejecutar E1Random");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E1Random Rand1 = new E1Random();
			}
		});
		

		
		
		
		
		
		btnNewButton.setBounds(31, 423, 155, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnIrACdigo = new JButton("C\u00F3digo fuente de E1Random");
		btnIrACdigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CargarImagen Im = new CargarImagen();
				try {
					Im.cargar("Imagenes/E1Random.PNG");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnIrACdigo.setBounds(10, 448, 188, 33);
		frame.getContentPane().add(btnIrACdigo);
		
		JTextArea txtrLaClaseE = new JTextArea(2, 5);
		txtrLaClaseE.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtrLaClaseE.setText("The class E1Random demonstrates the generation of random numbers\r\n\r\nOne can choose interactively between three generators. After clicking on Go 100 random numbers are generated and displayed. The seeds before and after generation are shown and can be changed interactively.\r\n\r\nThe class E4Random demonstrates the generation of random numbers from a multivariate normal distribution\r\nThe procedure of Sect. 4.10 is realized for the case of two variables. Parameter input is interactive. The generated number pairs are displayed numerically.\r\n\r\n\r\n");
		txtrLaClaseE.setTabSize(20);
		txtrLaClaseE.setLineWrap(true);
		txtrLaClaseE.setBounds(10, 240, 643, 164);
		frame.getContentPane().add(txtrLaClaseE);
		
		JButton EjecutarE3 = new JButton("Ejecutar E4Random");
		EjecutarE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E4Random Rand4 = new E4Random();
			}
		});
		EjecutarE3.setBounds(453, 423, 155, 23);
		frame.getContentPane().add(EjecutarE3);
		
		JButton CodigoE3 = new JButton("C\u00F3digo fuente de E4Random");
		CodigoE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CargarImagen Im = new CargarImagen();
				try {
					Im.cargar("Imagenes/E4Random.PNG");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		CodigoE3.setBounds(435, 448, 188, 33);
		frame.getContentPane().add(CodigoE3);
		
		JTextPane txtpnDatarandomContieneMtodos = new JTextPane();
		txtpnDatarandomContieneMtodos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnDatarandomContieneMtodos.setBackground(Color.LIGHT_GRAY);
		txtpnDatarandomContieneMtodos.setText("DatanRandom contains methods for the generation of random numbers following various distributions, in particular DatanRandom.ecuy for the uniform, DatanRandom.standardNormal for the standard normal, and DatanRandom.multivariateNormal for the multivariate normal Distribution. Further methods are used to illustrate a simple MLC generator or to demonstrate the following examples.");
		txtpnDatarandomContieneMtodos.setBounds(70, 109, 567, 102);
		frame.getContentPane().add(txtpnDatarandomContieneMtodos);
		
	}
		
	/*	
		JButton botonvolver = new JButton("<= Volver");
		botonvolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		botonvolver.setBounds(22, 412, 89, 22);
		frame.getContentPane().add(botonvolver);
	}
	*/
	
	
	
	

	
	
	
	
	public void añadirDatos() {
		switch (numeroEjemplo) {
		case 1:
			labelNombre.setText(labelNombre.getText() + " 1");
			System.out.println("1");
			break;
		case 2:
			labelNombre.setText(labelNombre.getText() + " 2");
			break;
		case 3:
			labelNombre.setText(labelNombre.getText() + " 3");
			break;
		case 4:
			labelNombre.setText(labelNombre.getText() + " 4");
			break;
		case 5:
			labelNombre.setText(labelNombre.getText() + " 5");
			break;
		case 6:
			labelNombre.setText(labelNombre.getText() + " 6");
			break;
		case 7:
			labelNombre.setText(labelNombre.getText() + " 7");
			break;
		case 8:
			labelNombre.setText(labelNombre.getText() + " 8");
			break;
		}
	}
}
