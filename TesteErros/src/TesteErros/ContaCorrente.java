package TesteErros;

import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria{

	private String nome;
	private String endereco;
	private String cpf;
	private LocalDate dataNascimento;
	
	public ContaCorrente(String nome, String endereco, String cpf, LocalDate dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
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