package com.estadistica.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

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
	 * @throws IOException 
	 */
	public MenuEleccion() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
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
		
		JButton btnNewButton = new JButton("N\u00FAmeros aleatorios");
		btnNewButton.setFont(new Font("Modern No. 20", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login.getTextArea().append("Has elegido realizar el ejemplo1\n");
				NumerosAleatorios pe = new NumerosAleatorios(1);
				System.out.println(pe.getNumeroEjemplo());
			}
		});
		btnNewButton.setBounds(257, 161, 199, 23);
		frmElegirActividad.getContentPane().add(btnNewButton);
		
    
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		frmElegirActividad.getContentPane().add(scrollPane);
		
		JButton btnDistribucionesYTeoremas = new JButton("Muestras");
		btnDistribucionesYTeoremas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.getTextArea().append("Has elegido realizar el ejemplo3\n");
				Muestras pe = new Muestras(3);
				System.out.println(pe.getNumeroEjemplo());
			}
		});
		btnDistribucionesYTeoremas.setFont(new Font("Modern No. 20", Font.PLAIN, 17));
		btnDistribucionesYTeoremas.setBounds(257, 331, 199, 23);
		frmElegirActividad.getContentPane().add(btnDistribucionesYTeoremas);
		
		JButton button = new JButton("Distribuciones y teoremas importantes");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.getTextArea().append("Has elegido realizar el ejemplo2\n");
				DistribucionesYTeoremas pe = new DistribucionesYTeoremas(2);
				System.out.println(pe.getNumeroEjemplo());
			}
		});
		button.setFont(new Font("Modern No. 20", Font.PLAIN, 17));
		button.setBounds(200, 247, 302, 23);
		frmElegirActividad.getContentPane().add(button);
	}
}
