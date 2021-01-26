package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {

	public void criarTela() {
	
		JFrame telaRetangulo = new JFrame();
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaRetangulo.setSize(500, 300);
		telaRetangulo.setTitle("Cálculos com retângulo");
		telaRetangulo.setLayout(null);
		
		///** Criar um label
		JLabel labelAltura =new JLabel();
		labelAltura.setText("Altura");
		// *** DEFINIR A POSIÇÃO E TAMANHO DO LABEL
		labelAltura.setBounds(10, 10, 80, 30);
		// *** colocar o labelAltura  dentro do painel de conteudo
		// *** --> contentPane
		
		telaRetangulo.getContentPane().add(labelAltura);
		JTextField textAltura = new JTextField();
		textAltura.setBounds(50, 10, 100, 30);
		telaRetangulo.getContentPane().add(textAltura);
		
		//Label da base
		JLabel labelBase = new JLabel();
		labelBase.setText("Base");
		labelBase.setBounds(10, 50, 80, 30);
		telaRetangulo.getContentPane().add(labelBase);
		
		//** texto da base
		JTextField textBase = new JTextField();
		textBase.setBounds(50, 50, 100, 30);
		telaRetangulo.getContentPane().add(textBase);
		
		//** botao calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		Color laranja = new Color(255,128,0);
		buttonCalcular.setBackground(laranja);
		buttonCalcular.setBounds(10, 100, 180, 30);
		telaRetangulo.getContentPane().add(buttonCalcular);
		
		
		
		
		
		telaRetangulo.setVisible(true);
		//**clicks da tela
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Retangulo r = new Retangulo();
				r.setAltura(Double.parseDouble(textAltura.getText()));
				r.setBase(Double.parseDouble(textBase.getText()));
				
				labelAltura.setText(String.valueOf(r.calcularArea()));
				labelBase.setText(String.valueOf(r.calcularPerimeto()));
				
			}
		});
	}
}
