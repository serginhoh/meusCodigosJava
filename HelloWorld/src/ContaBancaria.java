
public class ContaBancaria {
	
	private String titular;
	private double saldo;
	private int numero;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		saldo -= valor;
	}

	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumeroConta() {
		return numero;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numero = numeroConta;
	}
}
