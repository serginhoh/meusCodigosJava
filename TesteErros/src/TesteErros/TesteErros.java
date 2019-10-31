package TesteErros;

public class TesteErros {

	public static void main (String[] args) {
		System.out.println("Início main");
		try {
			metodo1();
		} catch (NullPointerException e) {
			System.out.println("Teve um erro:" + e);
		}
		System.out.println("Fim main");
	}
	
	static void metodo1() {
		System.out.println("Início metodo1");
		metodo2();
		System.out.println("Fim metodo1");
	}
	
	static void metodo2() {
		System.out.println("Início metodo2");
		
			ContaCorrente cc = new ContaCorrente();
			for (int i = 0; i <= 15; i++) {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if (i ==5) {
					cc = null;
				}
			}
	
		
		/*
		try {
			ContaCorrente cc = new ContaCorrente();
			for (int i = 0; i <= 15; i++) {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if (i ==5) {
					cc = null;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Erro: " + e);
		}
		*/
		/*
			ContaCorrente cc = new ContaCorrente();
			for (int i = 0; i <= 15; i++) {
				try {
					cc.deposita(i + 1000);
					System.out.println(cc.getSaldo());
					if (i ==5) {
						cc = null;
					}
				} catch (NullPointerException e) {
					System.out.println("Erro: " + e);
				}
			}
		 */
		
		System.out.println("Fim metodo2");
	}
}
