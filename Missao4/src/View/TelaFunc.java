package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import controle.*;

import java.awt.*;

public class TelaFunc implements ActionListener {
	private static JFrame telaFunc = new JFrame();
	private static JLabel tituloFunc = new JLabel("Menu do funcionario");
	private static JButton buttonListaClientes = new JButton("Lista de clientes");
	private static JButton buttonListaProdutos = new JButton("Lista de produtos");
	private static JButton buttonCadastrarProdutos = new JButton("Cadastrar produtos");
	public static ControleDados dados = new ControleDados();
	
	
	public void TelaFunc1() {
		Color minhaCor4 = new Color(192, 192, 192);
		telaFunc.setLayout(null);
		
		tituloFunc.setBounds(90, 0, 380, 50);
		tituloFunc.setFont(new Font("Arial",Font.BOLD,20));
		telaFunc.add(tituloFunc);
		
		buttonListaClientes.setBounds(110,70,150,40);
		telaFunc.add(buttonListaClientes);
		
		buttonListaProdutos.setBounds(110,130,150,40);
		telaFunc.add(buttonListaProdutos);
		
		buttonCadastrarProdutos.setBounds(110,190,150,40);
		telaFunc.add(buttonCadastrarProdutos);
		
		
		
		
		
		
		telaFunc.setSize(400,300);
		telaFunc.getContentPane().setBackground(minhaCor4);
		telaFunc.setVisible(true);
		telaFunc.setLocationRelativeTo(null);
		buttonListaClientes.addActionListener(this);
		buttonListaProdutos.addActionListener(this);
		buttonCadastrarProdutos.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==buttonListaProdutos) {
			new TelaListaClientes().ListaProdutos(dados);
		}
		
		if(src==buttonCadastrarProdutos) {
			new TelaCadastroProdutos().TelaCadastroProdutos1(dados);
		}
		
		if(src==buttonListaClientes) {
			new TelaListaCons().ListaClientes(dados);
		}
	}

}
