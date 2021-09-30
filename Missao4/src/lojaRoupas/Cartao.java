package lojaRoupas;
public class Cartao {

	private String numeroCartao;
	private int codigoseg;
	private String nomeCartao;
	private String dataVenc;
	private Cliente cliente;
	
	public Cartao (String n, int i , String no , String d  ) {
		numeroCartao=n;
		codigoseg=i;
		nomeCartao=no;
		dataVenc=d;
	}
	
	public String toString() {
		return "Nome do cartao:  "+ nomeCartao +" \n Número do cartao: "+ numeroCartao + " \n Código de seguranca: "+ codigoseg + " \n Data de vencimento: "+ dataVenc;
	}
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao=numeroCartao;
	}
	
	public int getCodigoseg() {
		return codigoseg;
	}
	
	public void setCodigoseg(int codigoseg) {
		this.codigoseg=codigoseg;
	}
	
	public String getNomeCartao() {
		return nomeCartao;
	}
	
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao=nomeCartao;
	}
	
	public String getDataVenc() {
		return dataVenc;
	}
	
	public void setDataVenc(String dataVenc) {
		this.dataVenc=dataVenc;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		 this.cliente=cliente;
	}
}