
public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Danilo", 10);
		//p1.setNome("Danilo");
		
		Pessoa p2 = new Pessoa("Daniel", 34);
		
		Pessoa p3 = new Pessoa("Daniela", 25);
		
		System.out.println(p1.getNome());

		System.out.println(p2.getIdentificador());
		
		System.out.println(Pessoa.identificador);

	}
}
