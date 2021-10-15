package br.senai.sp.jandira.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("nome app");
		tela.setSize(300, 300);
		tela.setLayout(null);

		JLabel lblNome = new JLabel();
		lblNome.setText("Digite seu nome: ");
		lblNome.setBounds(10, 10, 150, 30);

		JTextField txtNome = new JTextField();
		txtNome.setBounds(10, 45, 100, 30);

		JButton btnOK = new JButton();
		btnOK.setText("OK");
		btnOK.setBounds(115, 45, 150, 30);

		JLabel lblComprimento = new JLabel();
		lblComprimento.setText("Resultado");
		lblComprimento.setBounds(10, 80, 150, 30);

		tela.setVisible(true);

		btnOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nome = txtNome.getText();
				// lblComprimento.setText("Olá " + nome + " !");

				int valor = Integer.parseInt(nome);
				int resultado = valor * 15;

				lblComprimento.setText(String.valueOf(resultado));

			}
		});

		tela.getContentPane().add(lblNome);
		tela.getContentPane().add(btnOK);
		tela.getContentPane().add(txtNome);
		tela.getContentPane().add(lblComprimento);

	}

}
