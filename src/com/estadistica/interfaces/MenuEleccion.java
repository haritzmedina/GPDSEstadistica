package com.estadistica.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuEleccion {

	private JFrame frmElegirActividad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEleccion window = new MenuEleccion();
					window.frmElegirActividad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuEleccion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmElegirActividad = new JFrame();
		frmElegirActividad.setTitle("Elegir actividad");
		frmElegirActividad.setBounds(100, 100, 705, 484);
		frmElegirActividad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmElegirActividad.getContentPane().setLayout(null);
		frmElegirActividad.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Selecciona el tipo de gr\u00E1fico a ejecutar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 11, 679, 27);
		frmElegirActividad.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ejemplo1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(47, 130, 89, 23);
		frmElegirActividad.getContentPane().add(btnNewButton);
		
		JButton btnEjemplo = new JButton("Ejemplo2");
		btnEjemplo.setBounds(47, 195, 89, 23);
		frmElegirActividad.getContentPane().add(btnEjemplo);
		
		JButton btnEjemplo_1 = new JButton("Ejemplo3");
		btnEjemplo_1.setBounds(47, 268, 89, 23);
		frmElegirActividad.getContentPane().add(btnEjemplo_1);
		
		JButton btnEjemplo_2 = new JButton("Ejemplo4");
		btnEjemplo_2.setBounds(47, 336, 89, 23);
		frmElegirActividad.getContentPane().add(btnEjemplo_2);
		
		JButton btnEjemplo_3 = new JButton("Ejemplo5");
		btnEjemplo_3.setBounds(552, 130, 89, 23);
		frmElegirActividad.getContentPane().add(btnEjemplo_3);
		
		JButton button = new JButton("Ejemplo6");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(552, 195, 89, 23);
		frmElegirActividad.getContentPane().add(button);
		
		JButton button_1 = new JButton("Ejemplo7");
		button_1.setBounds(552, 268, 89, 23);
		frmElegirActividad.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Ejemplo8");
		button_2.setBounds(552, 336, 89, 23);
		frmElegirActividad.getContentPane().add(button_2);
	}

}
