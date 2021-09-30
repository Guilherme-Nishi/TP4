package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controle.*;

public class RegisterView implements ActionListener{

	private static JFrame telaRegistro = new JFrame();
	private static JLabel tituloRegistro = new JLabel("Faca seu registro");
	private static JLabel userName = new JLabel("Nome completo:");
	private static JTextField nameText = new JTextField(20);
	private static JLabel userEmail = new JLabel("Email:");
	private static JTextField emailText = new JTextField(20);
	private static JLabel userPass = new JLabel("Nova Senha:");
	private static JPasswordField passText = new JPasswordField(20);
	private static JLabel userCep = new JLabel("CEP:");
	private static JTextField cepText = new JTextField(20);
	private static JLabel userRua = new JLabel("Rua:");
	private static JTextField ruaText = new JTextField(20);
	private static JLabel userNum = new JLabel("Num:");
	private static JTextField numText = new JTextField(20);
	private static JLabel userComple = new JLabel("Complemento:");
	private static JTextField compleText = new JTextField(20);
	private static JLabel cardNum = new JLabel("Num do cartao:");
	private static JTextField numCardText = new JTextField(20);
	private static JLabel cardName = new JLabel("Nome no cartao:");
	private static JTextField nameCardText = new JTextField(20);
	private static JLabel cardCvc = new JLabel("CVC:");
	private static JTextField cvcCardText = new JTextField(20);
	private static JLabel cardData = new JLabel("Venc:");
	private static JTextField dataCardText = new JTextField(20);
	private static JButton buttonRegister = new JButton("Registrar");
	
	
	
	public void RegisterView1(){
		Color minhaCor2 = new Color(192, 192, 192);
		
		telaRegistro.setLayout(null);
		tituloRegistro.setFont(new Font("Arial",Font.BOLD,20));
		tituloRegistro.setBounds(150,0,380,50);
		telaRegistro.add(tituloRegistro);
		
		userName.setBounds(10,40,100,60);
		userName.setFont(new Font("Arial",Font.BOLD,12));
		telaRegistro.add(userName);
		nameText.setBounds(130,55,330,27);
		telaRegistro.add(nameText);
		
		userEmail.setBounds(35,85,100,60);
		telaRegistro.add(userEmail);
		emailText.setBounds(130,100,330,27);
		telaRegistro.add(emailText);
		
		userPass.setBounds(20,140,100,60);
		telaRegistro.add(userPass);
		passText.setBounds(130,155,163,27);
		telaRegistro.add(passText);
		
		userCep.setBounds(10,205,50,60);
		telaRegistro.add(userCep);
		cepText.setBounds(50,220,163,27);
		telaRegistro.add(cepText);
		
		userRua.setBounds(250,205,50,60);
		telaRegistro.add(userRua);
		ruaText.setBounds(300,220,163,27);
		telaRegistro.add(ruaText);
		
		userNum.setBounds(10,260,100,60);
		telaRegistro.add(userNum);
		numText.setBounds(50,280,100,27);
		telaRegistro.add(numText);
		
		userComple.setBounds(200,260,100,60);
		telaRegistro.add(userComple);
		compleText.setBounds(300,275,163,27);
		telaRegistro.add(compleText);
		
		cardName.setBounds(30,310,130,60);
		telaRegistro.add(cardName);
		nameCardText.setBounds(150,325,313,27);
		telaRegistro.add(nameCardText);
		
		cardNum.setBounds(30,360,100,60);
		telaRegistro.add(cardNum);
		numCardText.setBounds(150,375,313,27);
		telaRegistro.add(numCardText);
		
		cardCvc.setBounds(260, 410, 80, 60);
		telaRegistro.add(cardCvc);
		cvcCardText.setBounds(300,425,163,27);
		telaRegistro.add(cvcCardText);
		
		cardData.setBounds(10,410,80,60);
		telaRegistro.add(cardData);
		dataCardText.setBounds(50,425,100,27);
		telaRegistro.add(dataCardText);
		
		buttonRegister.setBounds(20,475,450,50);
		telaRegistro.add(buttonRegister);
		buttonRegister.addActionListener(this);
		
		telaRegistro.getContentPane().setBackground(minhaCor2);
		telaRegistro.setVisible(true);
		telaRegistro.setSize(500,570);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==buttonRegister) {
			if(nameText.getText()==null||nameText.getText().trim().equals("")||numText.getText()==null||numText.getText().trim().equals("")||
					emailText.getText()==null||emailText.getText().trim().equals("")||
				passText.getPassword()==null||cepText.getText().trim().equals("")|| cepText.getText()==null||ruaText.getText()==null||ruaText.getText().trim().equals("")||
				compleText.getText()==null||compleText.getText().trim().equals("")||nameCardText.getText()==null||nameCardText.getText().trim().equals("")
				||numCardText.getText()==null||numCardText.getText().trim().equals("")||cvcCardText.getText().trim().equals("")||cvcCardText.getText()==null||
				dataCardText.getText().trim().equals("")||dataCardText.getText()==null||passText.getPassword().length==0) {
				
				 JOptionPane.showMessageDialog(null, "Voce precisa preencher todas as informacoes");
			}else {
				RegisterView.telaRegistro.dispose();
				new TelaLoginUser().TelaLoginUser1();
				
			}
		}
	}

	

	

}