package br.dev.milla.temperatura.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.milla.temperatura.model.Temperatura;

public class TelaConversor {

	private JLabel labelCelsius;
	private JTextField txtCelsius;
	private JButton buttonFahreinheit;
	private JButton buttonKelvin;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	public void criarTelaConversor() {

		JFrame tela = new JFrame();
		tela.setSize(500, 320);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);

		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius:");
		labelCelsius.setBounds(37, 20, 250, 35);
		labelCelsius.setFont(new Font("Arial", Font.BOLD, 15));

		txtCelsius = new JTextField();
		txtCelsius.setBounds(37, 55, 410, 35);
		txtCelsius.setFont(new Font("Arial", Font.BOLD, 15));

		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(37, 100, 200, 35);
		buttonFahreinheit.setFont(new Font("Arial", Font.BOLD, 15));
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String textCelsius = txtCelsius.getText();
				
				try {
				
					double celsius = Double.parseDouble(textCelsius);
						
					Temperatura fahreinheit = new Temperatura();
					fahreinheit.setCelsius(celsius);
					celsius = fahreinheit.converterParaFahreinheit();
						
					labelResultado.setText(String.valueOf(Math.round(celsius) + "  FAHREINHEIT"));
					
				} catch (NumberFormatException e2) {
					
					labelMensagemErro.setText("<html>Para que o conversor funcione corretamente <br> digite apenas números!<html>");
					
				}
					
			}
		});

		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(246, 100, 200, 35);
		buttonKelvin.setFont(new Font("Arial", Font.BOLD, 15));
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String textCelsius = txtCelsius.getText();
				
				try {
					
					double celsius = Double.parseDouble(textCelsius);
					
					Temperatura kelvin = new Temperatura();
					kelvin.setCelsius(celsius);
					celsius = kelvin.converterParaKevin();
						
					labelResultado.setText(String.valueOf(Math.round(celsius) + "  KELVIN"));
					
				} catch (NumberFormatException e2) {
					
					labelMensagemErro.setText("<html>Para que o conversor funcione corretamente <br> digite apenas números!<html>");
					
				}
					
			}
		});

		labelResultado = new JLabel();
		labelResultado.setBounds(140, 162, 250, 35);
		labelResultado.setFont(new Font("Arial", Font.BOLD, 22));

		labelMensagemErro = new JLabel();
		labelMensagemErro.setBounds(67, 210, 400, 40);
		labelMensagemErro.setForeground(Color.red);
		labelMensagemErro.setFont(new Font("Arial", Font.BOLD, 15));

		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		
		tela.setVisible(true);
		
	}

}
