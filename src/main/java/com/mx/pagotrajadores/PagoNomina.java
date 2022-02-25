package com.mx.pagotrajadores;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PagoNomina extends JFrame {

	private JPanel contentPane;
	private JTextField txtTrabajador;
	private JTextField txtHoras;
	private JTextField txtTarifas;

	/**
	 * Create the frame.
	 */
	public PagoNomina() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//posicion y tamaño de la ventana
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		componentes();
		
		
	}
	
	public void componentes() {
		JLabel lbPagoTrabajadores = new JLabel("Pago de trabajadores");
		lbPagoTrabajadores.setBounds(155, 10, 132, 13);
		contentPane.add(lbPagoTrabajadores);
		
		txtTrabajador = new JTextField();
		txtTrabajador.setBounds(49, 39, 331, 34);
		contentPane.add(txtTrabajador);
		txtTrabajador.setColumns(10);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(49, 106, 109, 24);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnMostrar.setBounds(112, 149, 85, 21);
		contentPane.add(btnMostrar);
		
		JButton btnNewButton_1 = new JButton("LIMPIAR");
		btnNewButton_1.setBounds(227, 149, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JTextArea txtR = new JTextArea();
		txtR.setBounds(49, 195, 331, 77);
		contentPane.add(txtR);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(49, 282, 85, 21);
		contentPane.add(btnSalir);
		
		JLabel lbHorasTrabajo = new JLabel("Horas de Trabajo");
		lbHorasTrabajo.setBounds(49, 83, 96, 13);
		contentPane.add(lbHorasTrabajo);
		
		txtTarifas = new JTextField();
		txtTarifas.setColumns(10);
		txtTarifas.setBounds(259, 106, 109, 24);
		contentPane.add(txtTarifas);
		
		JLabel lbTarifaHora = new JLabel("Tarifa por Hora");
		lbTarifaHora.setBounds(259, 83, 96, 13);
		contentPane.add(lbTarifaHora);
	}
}
