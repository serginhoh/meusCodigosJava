
public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private static int identificador;
	
	public Pessoa (String nome) {
		this.nome = nome;
		identificador ++;
	}
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		identificador ++;
	}
	

	public void caminha(){
		System.out.println("Pessoa está caminhando.");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdentificador() {
		return identificador;
	}
}
