package controle;

import lojaRoupas.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Produto[] getProduto() {
		return this.d.getProduto();
	}
	
	public int getqtdProduto() {
		return this.d.getQtdproduto();
	}
	
	public int getqtdclient() {
		return this.d.getqtdclient();
	}
	
	public Cliente[] getCliente() {
		return this.d.getCliente();
	}
	


	public boolean inserirEditarCliente(String[] dadosCliente) {
		if(!dadosCliente[3].matches("[0-9]+") || !dadosCliente[4].matches("[0-9]+") || 
				!dadosCliente[5].matches("[0-9]+") || !dadosCliente[6].matches("[0-9]+")|| !dadosCliente[7].matches("[0-9]+")|| !dadosCliente[8].matches("[0-9]+")|| !dadosCliente[9].matches("[0-9]+")|| !dadosCliente[10].matches("[0-9]+")|| !dadosCliente[11].matches("[0-9]+")|| !dadosCliente[12].matches("[0-9]+")) {
			return false;
		} else {
				Cliente p = new Cliente(dadosCliente[1], dadosCliente[2], dadosCliente[3],
						new Endereço(dadosCliente[5], dadosCliente[6], Integer.parseInt(dadosCliente[7]), dadosCliente[8]),
						new Cartao(dadosCliente[9],Integer.parseInt(dadosCliente[10]),dadosCliente[11],dadosCliente[12]));
				d.inserirEditacliente(p, Integer.parseInt(dadosCliente[0]));
				return true;
		}
	}
	// a posicao 0 do vetor dadosProduto indica onde os dados devem ser inseridos
	public boolean inserirEditarProduto(String[] dadosProduto) {
		int tu = 1;
		if(tu==0) {
			return false;
		} else {
				Produto a = new Produto(dadosProduto[1], Double.parseDouble(dadosProduto[2]),Integer.parseInt(dadosProduto[3]), 
						dadosProduto[4], new Categoria(dadosProduto[5],dadosProduto[6],dadosProduto[7]),dadosProduto[8],dadosProduto[9],Integer.parseInt(dadosProduto[10]));
				d.inserirEditarProduto(a, Integer.parseInt(dadosProduto[0]));
				return true;
		}
	}
	
	
}