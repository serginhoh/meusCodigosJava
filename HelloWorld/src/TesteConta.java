
public class TesteConta {
	public static void main(String[] args) {
		
//		ContaBancaria conta1 = new ContaBancaria();
//		conta1.setTitular("Titular 1");
//		conta1.setNumeroConta(1);
//		
//		System.out.println("Titular : " +  conta1.getTitular());
//		System.out.println("Número Conta : "  + conta1.getNumeroConta());
//		conta1.deposita(50);
//		System.out.println(conta1.getSaldo());
//		conta1.deposita(100);
//		System.out.println(conta1.getSaldo());
//		conta1.saque(80);
//		System.out.println(conta1.getSaldo());
//		
//		ContaBancaria conta2 = new ContaBancaria();
//		conta2.setTitular("Titular 2");
//		conta2.setNumeroConta(2);
//
//		System.out.println("Titular : " +  conta2.getTitular());
//		System.out.println("Número Conta : "  + conta2.getNumeroConta());
//		conta2.deposita(10);
//		System.out.println(conta2.getSaldo());
//		conta2.saque(50);
//		System.out.println(conta2.getSaldo());
//		conta2.deposita(60);
//		System.out.println(conta2.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setTitular("Titular Poupança");
		cp.deposita(100);
		System.out.println(cp.getSaldo());
		cp.saque(90);
		System.out.println(cp.getSaldo());
		System.out.println(cp.getTitular());
		System.out.println(cp.getTipo());
		
		ContaCorrente cc = new ContaCorrente();
		cc.setTitular("Titular Corrente");
		cc.deposita(100);
		System.out.println(cc.getSaldo());
		cc.saque(90);
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular());
		System.out.println(cc.getTipo());
		
		
	}
}
