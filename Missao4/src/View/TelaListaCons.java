package View;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaListaCons implements ActionListener, ListSelectionListener {		
	private JFrame janelaLista2;
	private JLabel tituloLista2;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private static ControleDados dados;
	private JList<String> listaClientesCadastrados;
	private String[] listaNomes = new String[50];
	
	public void ListaClientes(ControleDados d) {
		dados=d;
		Color minhaCor4 = new Color(192, 192, 192);
		listaNomes = new ControleCliente(dados).getNomeCliente();
		listaClientesCadastrados = new JList <String> (listaNomes);
		janelaLista2 = new JFrame("Lista de Produtos") ;
		tituloLista2 = new JLabel("Lista de produtos");
		cadastroCliente = new JButton("Cadastrar novo produto");
		refreshCliente = new JButton("Atualizar");
		
		tituloLista2.setFont(new Font("Arial", Font.BOLD, 20));
		tituloLista2.setBounds(90, 10, 250, 30);
		listaClientesCadastrados.setBounds(20, 50, 340, 250);
		listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaClientesCadastrados.setVisibleRowCount(10);
		
		cadastroCliente.setBounds(70, 330, 100, 30);
		refreshCliente.setBounds(200, 330, 100, 30);

		janelaLista2.setLayout(null);

		janelaLista2.add(tituloLista2);
		janelaLista2.add(listaClientesCadastrados);
		janelaLista2.add(cadastroCliente);
		janelaLista2.add(refreshCliente);
		janelaLista2.setLocationRelativeTo(null);
		
		refreshCliente.addActionListener(this);
		janelaLista2.setSize(400, 400);
		janelaLista2.setVisible(true);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == refreshCliente) {
			listaClientesCadastrados.setListData(new ControleCliente(dados).getNomeCliente());			
			listaClientesCadastrados.updateUI();
		}
		
	}



}