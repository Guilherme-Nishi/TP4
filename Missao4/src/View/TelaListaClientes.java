package View;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaListaClientes implements ActionListener, ListSelectionListener {		
	private JFrame janelaLista;
	private JLabel tituloLista;
	private JButton cadastroProduto;
	private JButton refreshProduto;
	private static ControleDados dados;
	private JList<String> listaProdutosCadastrados;
	private String[] listaNomes = new String[50];
	
	public void ListaProdutos(ControleDados d) {
		dados=d;
		Color minhaCor4 = new Color(192, 192, 192);
		listaNomes = new ControleProduto(dados).getNomeProduto();
		listaProdutosCadastrados = new JList <String> (listaNomes);
		janelaLista = new JFrame("Lista de Produtos") ;
		tituloLista = new JLabel("Lista de produtos");
		cadastroProduto = new JButton("Cadastrar novo produto");
		refreshProduto = new JButton("Atualizar");
		
		tituloLista.setFont(new Font("Arial", Font.BOLD, 20));
		tituloLista.setBounds(90, 10, 250, 30);
		listaProdutosCadastrados.setBounds(20, 50, 340, 250);
		listaProdutosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaProdutosCadastrados.setVisibleRowCount(10);
		listaProdutosCadastrados.addListSelectionListener(this);
		
		cadastroProduto.setBounds(70, 330, 100, 30);
		refreshProduto.setBounds(200, 330, 100, 30);

		janelaLista.setLayout(null);

		janelaLista.add(tituloLista);
		janelaLista.add(listaProdutosCadastrados);
		janelaLista.add(cadastroProduto);
		janelaLista.add(refreshProduto);
		janelaLista.setLocationRelativeTo(null);
		
		refreshProduto.addActionListener(this);
		janelaLista.setSize(400, 400);
		janelaLista.setVisible(true);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == listaProdutosCadastrados) {
			new TelaEditarProduto().TelaCadastroProdutos2(dados, this, listaProdutosCadastrados.getSelectedIndex());
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == refreshProduto) {
			listaProdutosCadastrados.setListData(new ControleProduto(dados).getNomeProduto());			
			listaProdutosCadastrados.updateUI();
		}
		
	}



}