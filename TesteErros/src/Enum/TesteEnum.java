package Enum;

import java.time.LocalDate;

public class TesteEnum {

	public static void main(String[] args) {
		ContaDigital conta1 = new ContaDigital("Jo�o", "R. X", "1234", LocalDate.of(1981, 1, 12), LocalDate.now());
		conta1.deposita(300000);
		
		ClassificacaoClientes.POTENCIAL.isCompatible(conta1);
		ClassificacaoClientes.MEDIO.isCompatible(conta1);
		ClassificacaoClientes.BAIXO.isCompatible(conta1);

	}
	
}
