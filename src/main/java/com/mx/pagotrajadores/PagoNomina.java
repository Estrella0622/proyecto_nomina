package com.mx.pagotrajadores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class PagoNomina extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public PagoNomina() {
		PagoNomina frame = new PagoNomina();
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(195, 10, 45, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(170, 39, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(49, 83, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(284, 83, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(111, 127, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(229, 127, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(84, 158, 270, 77);
		contentPane.add(textArea);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(84, 245, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
