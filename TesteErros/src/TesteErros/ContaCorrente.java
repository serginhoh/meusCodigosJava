package TesteErros;
public class ContaCorrente extends ContaBancaria{

	@Override
	public void saque (double valor) {
		saldo -= (valor + 0.10);
	}
	
//	@Override
//	public String getTipo() {
//		return super.getTipo() +  "Corrente";
//	}
	
	public String getTipo() {
		return "Conta Corrente";
	}
	
	public void saca(double valor) throws SaldoInsuficiente {
		this.saldo = saldo - valor;
	}
	
}