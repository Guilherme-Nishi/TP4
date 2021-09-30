package lojaRoupas;

public class Cliente extends Pessoa {

	private String emailCliente;
	private Cartao cartaoCliente;
	private Endereço endereco;
	private Cartao cartao;
	
	public Cliente (String n,String s,String ec,Endereço ed2,Cartao ca) {
		nome=n;
		senha=s;
		emailCliente=ec;
		endereco=ed2;
		cartao=ca;
		
		

	}
	
	//Como ela será apresentada
	public String toString() {
		return "\nNome do cliente: "+nome+" Senha do cliente: "+senha+" Email do cliente: "+emailCliente+endereco+cartao;
		
		//Gets e sets
	}
	public  String getNome(){
		return nome;
		
	}
	
	public void   setNome(String nome) {
		this.nome=nome;
		
	}
	
	public  Cartao getCartao(){
		return cartaoCliente;
		
	}
	
	public void   setCartao(Cartao cartaoCliente) {
		this.cartaoCliente=cartaoCliente;
		
	}
	public Endereço getEndereco(){
		return endereco;
		
	}
	
	public void   setEndereço(Endereço endereco) {
		this.endereco=endereco;
		
	}
	
	public  String getEmail(){
		return emailCliente;
		
	}
	
	public void   setEmail(String emailCliente) {
		this.emailCliente=emailCliente;
		
	}
	public  String getSenha(){
		return senha;
		
	}
	
	public void   setSenha(String senha) {
		this.senha=senha;
		
	}
	
	
}