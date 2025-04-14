package br.dev.milla.temperatura.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
		tela.setSize(400, 350);
		tela.setDefaultCloseOperation(3);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);

		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius:");
		labelCelsius.setBounds(25, 15, 300, 35);

		txtCelsius = new JTextField();
		txtCelsius.setBounds(25, 50, 336, 30);

		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(25, 90, 165, 30);

		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(195, 90, 165, 30);

		labelResultado = new JLabel();
		labelResultado.setText("89 FAHREINHEIT");
		labelResultado.setBounds(112, 130, 225, 25);
		

		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("<html>Caso o valor fornecido pelo usuário esteja incorreto,<br>a mensagem de erro deverá aparecer aqui.</html>");
		labelMensagemErro.setBounds(20, 80, 400, 40);

		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);

		// Configurar os ouvintes (listener)
		buttonFahreinheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String celsius = txtCelsius.getText();

				// Casting -> conversão de um tipo para outro
				double celsiusDouble = Double.parseDouble(celsius);

				Temperatura temperatura = new Temperatura();
				temperatura.setMultiplicando(multiplicandoDouble);
				temperatura.setMinimoMultiplicador(minimoMultiplicadorDouble);
				temperatura.setMaximoMultiplicador(maximoMultiplicadorDouble);
				resultado = temperatura.converterParaKelvin();
				resultado = temperatura.converterParaFahreinheit();

			}

		});

		tela.setVisible(true);

	}

}
