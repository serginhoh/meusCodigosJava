package TesteErros;

@SuppressWarnings("serial")
public class SaldoInsuficiente extends Exception {
	public SaldoInsuficiente(String message) {
		super(message); 
	}
}
