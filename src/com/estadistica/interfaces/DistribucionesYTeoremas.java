package com.estadistica.interfaces;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.estadistica.db.UserAccess;
import com.estadistica.examples.E1Distrib;
import com.estadistica.examples.E1Random;
import com.estadistica.examples.E3Distrib;
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

public class DistribucionesYTeoremas {

	//ATRIBUTOS
	private JFrame frame;
	private int numeroEjemplo;
	//private JLabel labelNombre;

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
	public DistribucionesYTeoremas(int numeroEjemplo) {
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
		
		JLabel lblNewLabel = new JLabel("Distribuciones y teoremas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 669, 22);
		frame.getContentPane().add(lblNewLabel);
		
		//añadirDatos();
		
		JLabel lblNewLabel_2 = new JLabel("Descripci\u00F3n: Class E1Distrib to simulate empirical frequency and demonstrate statistical fluctuations");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(31, 76, 592, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Ejecutar E1Distrib");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E1Distrib Dis1 = new E1Distrib();
			}
		});
		
/*
		labelNombre = new JLabel("Clases de Java para la generaci\u00F3n de n\u00FAmeros aleatorios");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelNombre.setHorizontalAlignment(SwingConstants.CENTER);
		labelNombre.setBounds(10, 44, 669, 14);
		frame.getContentPane().add(labelNombre);
*/		
		
		
		
		btnNewButton.setBounds(93, 423, 155, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnIrACdigo = new JButton("C\u00F3digo fuente de E1Distrib");
		btnIrACdigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CargarImagen Im = new CargarImagen();
				try {
					Im.cargar("Imagenes/E1Distrib.PNG");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//CargarImagen im = new CargarImagen("Imagenes/Mosquitos2");
			}
		});
		btnIrACdigo.setBounds(77, 448, 188, 33);
		frame.getContentPane().add(btnIrACdigo);
		
		JButton EjecutarE3 = new JButton("Ejecutar E3Distrib");
		EjecutarE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E3Distrib Dis3 = new E3Distrib();
			}
		});
		EjecutarE3.setBounds(453, 423, 155, 23);
		frame.getContentPane().add(EjecutarE3);
		
		JButton CodigoE3 = new JButton("C\u00F3digo fuente de E3Distrib");
		CodigoE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CargarImagen Im = new CargarImagen();
				try {
					Im.cargar("Imagenes/E3Distrib.PNG");
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
		txtpnDatarandomContieneMtodos.setText("The program simulates the problem of Example 5.1. It allows input of values for nexp,nfly, and P(A), and then consecutively performs nexp simulated experiments. In each\r\nexperiment nfly objects are analyzed. Each object has a probability P(A) to have theproperty A. For each experiment one line of output is produced containing the current\r\nnumber iexp of the experiment, the number NA of objects with the property A and thefrequency hA = NA/nfly with which the property A was found. The fluctuation of\r\nhA around the known input value P(A) in the individual experiments gives a good impression of the statistical error of an experiment.");
		txtpnDatarandomContieneMtodos.setBounds(31, 96, 606, 145);
		frame.getContentPane().add(txtpnDatarandomContieneMtodos);
		
		JLabel lblDescripcinClassEdistrib = new JLabel("Descripci\u00F3n: Class E3Distrib to simulate Galton\u2019s board");
		lblDescripcinClassEdistrib.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescripcinClassEdistrib.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcinClassEdistrib.setBounds(136, 252, 424, 14);
		frame.getContentPane().add(lblDescripcinClassEdistrib);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("The program simulates the problem of Example 5.1. It allows input of values for nexp,nfly, and P(A), and then consecutively performs nexp simulated experiments. In each\r\nexperiment nfly objects are analyzed. Each object has a probability P(A) to have theproperty A. For each experiment one line of output is produced containing the current\r\nnumber iexp of the experiment, the number NA of objects with the property A and thefrequency hA = NA/nfly with which the property A was found. The fluctuation of\r\nhA around the known input value P(A) in the individual experiments gives a good impression of the statistical error of an experiment.");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(31, 267, 606, 145);
		frame.getContentPane().add(textPane);
		
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
	
	
	
	

	
	
	
	/*
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
	}*/
}
