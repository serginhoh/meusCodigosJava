package TesteErros;
public class ContaCorrente extends ContaBancaria{

	private String nome;
	private String endereco;
	private String cpf;
	
	public ContaCorrente(String nome, String endereco, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
	}
	
	public boolean equals(Object obj) {
		ContaCorrente conta = (ContaCorrente) obj;
		return (conta.cpf.equals(this.cpf));
	}
	
	@Override
	public void saque (double valor) {
		saldo -= (valor + 0.10);
	}

	public String getTipo() {
		return "Conta Corrente";
	}
	
	public void saca(double valor) throws SaldoInsuficiente {
		if (this.saldo < valor) {
			throw new SaldoInsuficiente("Saldo insuficiente para saque.");
		}
		this.saldo = saldo - valor;
	}
	
}