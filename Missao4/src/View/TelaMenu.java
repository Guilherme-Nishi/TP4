package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import controle.ControleDados;



public class TelaMenu implements ActionListener {
	private static JFrame tela = new JFrame();
	private static JLabel titulo = new JLabel("Menu do programa");
	private static JButton func = new JButton("Funcionario");
	private static JButton user = new JButton ("Usuario");
	
	
	public TelaMenu (){
		Color minhaCor = new Color(192, 192, 192);
		tela.setLayout(null);
		
		titulo.setBounds(100,0,380,50);
		titulo.setFont(new Font("Arial",Font.BOLD,20));
		tela.add(titulo);
		
		func.setBounds(110,160,150,40);
		tela.add(func);
		
		user.setBounds(110,100,150,40);
		tela.add(user);
		tela.setSize(400,300);
		tela.getContentPane().setBackground(minhaCor);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);
	}

	public static void main(String[] args) {
		TelaMenu novaTela = new TelaMenu();
		user.addActionListener(novaTela);
		func.addActionListener(novaTela);
		

	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src==user) {
			  new TelaLoginUser().TelaLoginUser1();
			 TelaMenu.tela.dispose();
		}
		
		if(src==func) {
			new TelaFunc().TelaFunc1();
			 TelaMenu.tela.dispose();
		}
		
		
		
	}

}