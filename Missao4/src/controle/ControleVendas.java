package controle;

import lojaRoupas.*;

public class ControleVendas {
	private Venda[] a;
	private int qtdVenda=0;
	
	public ControleVendas(ControleDados d) {
		a = d.getVenda();
		qtdVenda = d.getqtdProduto();
		
	}
	
	public String[] getVenda() {
		String[] s = new String[qtdVenda];
		for(int i = 0; i < qtdVenda; i++) {
			s[i] = a[i].getNumerovenda();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdVenda;
	}

	public void setQtd(int qtd) {
		this.qtdVenda = qtd;
	}
	
	public String getNumerovenda(int i) {		
		return a[i].getNumerovenda();
	}

	public int getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(int qtdVenda) {
		this.qtdVenda = qtdVenda;
	}
	
}