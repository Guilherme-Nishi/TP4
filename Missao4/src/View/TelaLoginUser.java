package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import lojaRoupas.Cliente;



public class TelaLoginUser implements ActionListener {
	private static JFrame tela1 = new JFrame();
	private static JLabel user1 = new JLabel("Cliente:");
	private static JTextField userText1 = new JTextField(20);
	private static JLabel senha1 = new JLabel("Senha:");
	private static JPasswordField textoSenha1 = new JPasswordField(20);
	private static JButton login1 = new JButton("Login");
	private static JButton register1 = new JButton("Registro");
	private static Cliente email;
	

	
	public void TelaLoginUser1 (){
			Color minhaCor1 = new Color(192, 192, 192);
			tela1.setLayout(null);
		
			
			user1.setBounds(10,10,80,60);
			
			tela1.add(user1);
		
			
			userText1.setBounds(100,27,250,27);
			tela1.add(userText1);
		
			
			senha1.setBounds(10,60,80,60);
			tela1.add(senha1);
		
			
			textoSenha1.setBounds(100,75,250,27);
			tela1.add(textoSenha1);
		
			
			login1.setBounds(10,160,90,30);
			tela1.add(login1);
		
		
			
			register1.setBounds(280,160,90,30);
			tela1.add(register1);
			
			tela1.setSize(400, 300);
			tela1.getContentPane().setBackground(minhaCor1);
			
			tela1.setLocationRelativeTo(null);
			tela1.setVisible(true);
			register1.addActionListener(this);
			login1.addActionListener(this);
			
		}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==register1) {
			
				
			
			new RegisterView().RegisterView1();
			TelaLoginUser.tela1.dispose();
			
		
		}
		
		if(src==login1) {
			if(userText1.getText()==null||userText1.getText().trim().equals("")||textoSenha1.getPassword().length==0) {
				 JOptionPane.showMessageDialog(null, "Voce precisa preencher todas as informacoes");
			}else {
				TelaLoginUser.tela1.dispose();
				new TelaUser().TelaUser1();
			}
		}
		}
	}


		

	
