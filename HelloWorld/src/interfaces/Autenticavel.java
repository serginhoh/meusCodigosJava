package interfaces;

public interface Autenticavel {
	boolean autentica(String senha);
	
	//M�todo n�o obrigat�rio -> default
	default int metodoDefault(int valor) {
		return 0;
	}
}
