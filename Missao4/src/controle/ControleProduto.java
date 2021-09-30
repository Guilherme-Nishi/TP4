package controle;

import lojaRoupas.*;

public class ControleProduto {
	private Produto[] a;
	private int qtdProduto=0;
	
	public ControleProduto(ControleDados d) {
		a = d.getProduto();
		qtdProduto = d.getqtdProduto();
		
	}
	
	public String[] getNomeProduto() {
		String[] s = new String[qtdProduto];
		for(int i = 0; i < qtdProduto; i++) {
			s[i] = a[i].getNomeproduto();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdProduto;
	}

	public void setQtd(int qtd) {
		this.qtdProduto = qtd;
	}
	
	public String getNomeproduto(int i) {		
		return a[i].getNomeproduto();
	}
	
	public String getpreco(int i) {
		String valor = String.valueOf(a[i].getPreco());
		return valor;
	}
	
	public String getestoque(int i) {
		String estoque = String.valueOf(a[i].getEstoque());
		return estoque;
	}
	
	public String getcor(int i) {
		String cor = String.valueOf(a[i].getCor());
		return cor;
		
	}

	public void setqtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	
	
	
}