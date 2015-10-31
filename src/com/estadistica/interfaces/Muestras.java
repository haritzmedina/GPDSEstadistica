package com.estadistica.interfaces;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.estadistica.db.UserAccess;
import com.estadistica.examples.E1Random;
import com.estadistica.examples.E2Sample;
import com.estadistica.examples.E3Random;
import com.estadistica.examples.E3Sample;
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

public class Muestras {

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
	public Muestras(int numeroEjemplo) {
		setNumeroEjemplo(numeroEjemplo);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 705, 605);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Muestras");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 669, 22);
		frame.getContentPane().add(lblNewLabel);
		
		labelNombre = new JLabel("Clases de Java que se refieren a muestras");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelNombre.setHorizontalAlignment(SwingConstants.CENTER);
		labelNombre.setBounds(102, 44, 506, 14);
		frame.getContentPane().add(labelNombre);
		
		añadirDatos();
		
		JLabel lblNewLabel_2 = new JLabel("Descripci\u00F3n:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(202, 69, 279, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Ejecutar E2Sample");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E2Sample sam2 = new E2Sample();
			}
		});
		

		
		
		
		
		
		btnNewButton.setBounds(26, 500, 155, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnIrACdigo = new JButton("C\u00F3digo fuente de E2Sample");
		btnIrACdigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CargarImagen Im = new CargarImagen();
				try {
					Im.cargar("Imagenes/E2Sample.PNG");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//CargarImagen im = new CargarImagen("Imagenes/Mosquitos2");
			}
		});
		btnIrACdigo.setBounds(10, 523, 188, 33);
		frame.getContentPane().add(btnIrACdigo);
		
		JTextArea txtrLaClaseE = new JTextArea(2, 5);
		txtrLaClaseE.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtrLaClaseE.setText("Example Program 6.2: The class E2Sample demonstrates the use of the classes Histogram and GraphicsWithHistogram\r\n\r\nInitialization, filling and graphical representation of a histogram are demonstrated for a sample of N elements from the standardized normal distribution. Interactive input is provided for N as well as for the lower boundary x0, bin width \u0394x and the number of bins nx of the histogram. The histogram is initialized, the sample elements are generated and entered into the histogram. Finally the histogram graphics is produced.\r\n\r\nExample Program 6.3: The class E3Sample demonstrates the use of class GraphicsWith2DScatterDiagram\r\n\r\nA scatter plot is created and later displayed graphically. The coordinates of the points making up the scatter plot are given as pairs of random numbers from a bivariate normal distribution (cf. Sect. 4.10). The program asks for the parameters of the normal distribution (means a1, a2, standard deviations \u03C31, \u03C32, correlation coefficient \u03C1) and for the number of random number pairs to be generated. It generates the pairs and prepares the caption and the labeling of axes and scales and displays the plot (Fig. 6.12).");
		txtrLaClaseE.setTabSize(20);
		txtrLaClaseE.setLineWrap(true);
		txtrLaClaseE.setBounds(10, 173, 669, 316);
		frame.getContentPane().add(txtrLaClaseE);
		
		JButton EjecutarE3 = new JButton("Ejecutar E3Sample");
		EjecutarE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E3Sample Sam3 = new E3Sample();
			}
		});
		EjecutarE3.setBounds(470, 500, 155, 23);
		frame.getContentPane().add(EjecutarE3);
		
		JButton CodigoE3 = new JButton("C\u00F3digo fuente de E3Sample");
		CodigoE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CargarImagen Im = new CargarImagen();
				try {
					Im.cargar("Imagenes/E3RSample.PNG");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		CodigoE3.setBounds(445, 523, 188, 33);
		frame.getContentPane().add(CodigoE3);
		
		JTextPane txtpnDatarandomContieneMtodos = new JTextPane();
		txtpnDatarandomContieneMtodos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnDatarandomContieneMtodos.setBackground(Color.LIGHT_GRAY);
		txtpnDatarandomContieneMtodos.setText("Sample contains methods computing characteristic parameters of a sample:\r\nmean, variance and standard deviation as well as the errors of these quantities.\r\nSmallSample contains methods computing the confidence limits for small samples.\r\nHistogram allows the construction and administration of a histogram.");
		txtpnDatarandomContieneMtodos.setBounds(102, 94, 506, 81);
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
