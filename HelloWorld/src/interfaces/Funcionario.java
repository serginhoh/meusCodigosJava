package interfaces;

public class Funcionario {
	int numero;
	String nome;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void trabalha() {
		System.out.println("Funcion�rio que trabalha.");
	}
	
	Funcionario(int numero, String nome){
		//System.out.println("Construtor Funcion�rio");
		this.numero = numero;
		this.nome = nome;
	}
	
	Funcionario(){}
	
	public int getBonificacao() {
		return 10;
	}
}
