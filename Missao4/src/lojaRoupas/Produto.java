package lojaRoupas;

import java.util.*;
public class Produto {

	private String nomeProduto;
	private double precoProduto;
	private int produtoEstoque;
	private String produtoCor;
	private double tamanhoProduto;
	private int numeroProduto;
	private Categoria categoria;
	private String marcaProduto;
	private String descriçaoProduto;
	private int avaliaçaoProduto;
	private String produtoCamisa;
	private String produtoCalca;
	private String produtoBone;
	private String produtoMoletom;
	private String produtoTenis;
	
	
	public Produto(String nn,double p,int e,String c,Categoria ca, String ma, String des, int num ){
		nomeProduto=nn;
		precoProduto=p;
		produtoEstoque=e;
		produtoCor=c;
		categoria=ca;
		marcaProduto=ma;
		descriçaoProduto=des;
		numeroProduto=num;
		
	}
	
	public String toString() {
		return "Nome do produto: " + nomeProduto + " \nValor do produto:" +  precoProduto+" \nO estoque do produto é: "+produtoEstoque+"\nA cor do produto é:"+produtoCor+categoria ;
	}
	
	public String getNomeproduto() {
		return nomeProduto;
	}

	public void setNomeproduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPreco() {
		return precoProduto;
	}

	public void setPreco(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getEstoque() {
		return produtoEstoque;
	}

	public void setPreco(int produtoEstoque) {
		this.produtoEstoque =produtoEstoque;
	}
	public String getCor() {
		return produtoCor;
	}

	public void setPreco(String produtoCor) {
		this. produtoCor = produtoCor;
	}
	public double getTamanho() {
		return tamanhoProduto;
	}

	public void setTamanho(double tamanhoProduto) {
		this. tamanhoProduto =tamanhoProduto;
	}
	public int getNumero() {
		return numeroProduto;
	}

	public void setNumero(int numeroProduto) {
		this. numeroProduto =numeroProduto;
	}
	public Categoria getCategoria() {
		return categoria;
	}

	public void setcategoria(Categoria categoria) {
		this. categoria =categoria;
	}
	public String getMarca() {
		return marcaProduto;
	}

	public void setMarca(String marcaProduto) {
		this.marcaProduto =marcaProduto;
	}
	public String getDescricao() {
		return  descriçaoProduto;
	}

	public void setDescricao(String  descriçaoProduto) {
		this. descriçaoProduto = descriçaoProduto;
	}
	public int getAvaliacao() {
		return  avaliaçaoProduto;
	}

	public void setDescricao(int avaliaçaoProduto) {
		this. avaliaçaoProduto = avaliaçaoProduto;
	}
	public String getCamisa() {
		return produtoCamisa;
	}

	public void setCamisa(String produtoCamisa) {
		this.produtoCamisa =produtoCamisa;
	}
	public String getCalca() {
		return produtoCalca;
	}

	public void setCalca(String produtoCalca) {
		this.produtoCalca =produtoCalca;
	}
	public String getBone() {
		return produtoBone;
	}

	public void setBone(String produtoBone) {
		this.produtoBone =produtoBone;
	}
	public String getMoletom() {
		return produtoMoletom;
	}

	public void setMoletom(String produtoMoletom) {
		this.produtoMoletom =produtoMoletom;
	}
	public String getTenis() {
		return produtoTenis;
	}

	public void setTenis(String produtoTenis) {
		this.produtoTenis =produtoTenis;
	}
}
