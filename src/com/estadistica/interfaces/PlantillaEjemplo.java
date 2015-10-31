package com.estadistica.interfaces;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlantillaEjemplo {

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
	public PlantillaEjemplo(int numeroEjemplo) {
		setNumeroEjemplo(numeroEjemplo);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 705, 484);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Ejemplo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 669, 22);
		frame.getContentPane().add(lblNewLabel);
		
		labelNombre = new JLabel("Nombre:");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelNombre.setHorizontalAlignment(SwingConstants.CENTER);
		labelNombre.setBounds(10, 44, 669, 14);
		frame.getContentPane().add(labelNombre);
		
		añadirDatos();
		
		JLabel lblNewLabel_2 = new JLabel("Descripci\u00F3n:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 104, 279, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Ir al ejemplo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(309, 373, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel_3 = new JLabel("C\u00F3digo fuente:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(467, 104, 161, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}
	
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
