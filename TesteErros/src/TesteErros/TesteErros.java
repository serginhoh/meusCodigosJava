package TesteErros;

import javax.swing.JOptionPane;

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
			
			metodo3(cc);
			/*
			for (int i = 0; i <= 15; i++) {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if (i ==5) {
					cc = null;
				}
			}
		System.out.println("Fim metodo2");
		*/
	}
	
	static void metodo3(ContaCorrente cc) {
		double valueDeposita = Double.valueOf(JOptionPane.showInputDialog("Valor depósito: "));
		cc.deposita(valueDeposita);
		System.out.println("Valor final: ");
		System.out.println(cc.getSaldo());
		
		double valueSaca = Double.valueOf(JOptionPane.showInputDialog("Valor saque: "));
		try {
			cc.saca(valueSaca);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Valor final 2: " + cc.getSaldo());
	}
}
