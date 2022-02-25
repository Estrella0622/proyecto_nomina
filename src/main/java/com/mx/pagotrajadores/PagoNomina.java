package com.mx.pagotrajadores;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JTextArea txtR;

	/**
	 * se crea un frame
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
		
		txtR = new JTextArea();
		txtR.setBounds(49, 195, 331, 77);
		contentPane.add(txtR);
		
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1
				String trabajador = txtTrabajador.getText();
				double tarifa = Double.parseDouble(txtTarifas.getText());
				int horas = Integer.parseInt(txtHoras.getText());
				//2
				int extras = 0;
				if(horas > 40) {
					extras = horas - 40;
					horas = 40;
				}
				//3
				int excede = 0;
				if(extras > 8) {
					excede = extras - 8;
					extras = 8;
				}
				//4
				double monto = horas*tarifa+extras*(tarifa*2)+excede*(tarifa*3);
				//5
				txtR.setText("");
				txtR.append("\nTrabajador: " + trabajador);
				txtR.append("\nHoras de trabajo: " + horas);
				txtR.append("\nTarifa: " + tarifa);
				txtR.append("\nHoras Extras: " + extras);
				txtR.append("\nHoras Extras de exceso: " + excede);
				txtR.append("\nMonto a recibir: $ " + String.format("%.2f",monto ));
				
			}
		});
		
		btnMostrar.setBounds(112, 149, 85, 21);
		contentPane.add(btnMostrar);
		
		JButton btnNewButton_1 = new JButton("LIMPIAR");
		btnNewButton_1.setBounds(227, 149, 85, 21);
		contentPane.add(btnNewButton_1);
		
		//valio
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = JOptionPane.showOptionDialog(this, "Estas seguro de salir...?","Control de Pagos",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,null,null);
				if(r == 0) System.exit(0);
				
			}
		});
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
