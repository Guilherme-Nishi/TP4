package lojaRoupas;


import java.util.*;

public class Dados {
	private  Funcionario[] funcionarios = new Funcionario[50];
	private int qtdfuncionarios = 0;
	private Venda [] venda = new Venda[50];
	private int qtdvend = 0;
	private Produto[] produto = new Produto[50];
	private int qtdproduto = 0;
	private Endereço[] Endereço = new Endereço[50];
	private int qtdend = 0;
	private Categoria[] cat = new Categoria[50];
	private int qtdcat = 0;
	private Cartao[] cart = new Cartao[50];
	private int qtdcart = 0;
	
	
	private Cliente[] cliente = new Cliente[50];
	private int qtdclient = 0;
	
	public void fillWithSomeData() {
		Date d = Calendar.getInstance().getTime();
		for(int i = 0; i < 5; i++) {
			Endereço[i] = new Endereço("1234567"+i,"Rua:"+i,i,"Em frente a avenida"+i);
			funcionarios[i] = new Funcionario("Funcionario"+i,"000000"+1,"01010"+i,Endereço[i]);
			cat[i] = new Categoria("M","Masculino","Infantil");	
			produto[i] = new Produto("Produto"+i,i+5.55,i+20,"Amarelo",cat[i], "nike", "lindo", i+1000 );		
		cart[i]=new Cartao("Nome "+i,100+i,"10000"+i,"17/10/2002"+i);
			cliente[i] = new Cliente("Cliente "+i,"32423"+i,i+"@hotmail.com",Endereço[i],cart[i]);
			
			
		}
		qtdcart=5;
		
		qtdfuncionarios = 5;
		qtdvend = 5;
		qtdproduto = 5;
		qtdend = 5;
		qtdcat = 5;
		qtdclient = 5;
	}
	
	public Cartao[] getCart() {
		return cart;
	}

	public void setCart(Cartao[] cart) {
		this.cart = cart;
	}

	public int getQtdcart() {
		return qtdcart;
	}

	public void setQtdcart(int qtdcart) {
		this.qtdcart = qtdcart;
	}



	public Produto[] getProduto() {
		return produto;
	}
	
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	
	public void inserirEditarProduto(Produto a, int pos) {
		this.produto[pos] = a;
		if(pos == qtdproduto) qtdproduto++;
	}
	
	public int getqtdproduto() {
		return qtdproduto;
	}
	public void setQqtdproduto(int qtdproduto) {
		this.qtdproduto = qtdproduto;
	}
	public Venda[] getVenda() {
		return venda;
	}
	public void setVenda(Venda[] venda) {
		this.venda = venda;
	}

	
	public Cliente[] getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}
	
	public void inserirEditacliente(Cliente p, int pos) {
		this.cliente[pos] = p;
		if(pos == qtdclient) qtdclient++;
	}
	
	
	public int getqtdclient() {
		return qtdclient;
	}
	public void setqtdclient(int qtdclient) {
		this.qtdclient = qtdclient;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public int getQtdfuncionarios() {
		return qtdfuncionarios;
	}

	public void setQtdfuncionarios(int qtdfuncionarios) {
		this.qtdfuncionarios = qtdfuncionarios;
	}

	public int getQtdvend() {
		return qtdvend;
	}

	public void setQtdvend(int qtdvend) {
		this.qtdvend = qtdvend;
	}

	public int getQtdproduto() {
		return qtdproduto;
	}

	public void setQtdproduto(int qtdproduto) {
		this.qtdproduto = qtdproduto;
	}

	public Endereço[] getEndereço() {
		return Endereço;
	}

	public void setEndereço(Endereço[] Endereço) {
		this.Endereço = Endereço;
	}

	public int getQtdend() {
		return qtdend;
	}

	public void setQtdend(int qtdend) {
		this.qtdend = qtdend;
	}

	public Categoria[] getCat() {
		return cat;
	}

	public void setCat(Categoria[] cat) {
		this.cat = cat;
	}
	

	public int getQtdcat() {
		return qtdcat;
	}

	public void setQtdcat(int qtdcat) {
		this.qtdcat = qtdcat;
	}

	public int getQtdclient() {
		return qtdclient;
	}

	public void setQtdclient(int qtdclient) {
		this.qtdclient = qtdclient;
	}

	
}