package Enum;

public enum ClassificacaoClientes {
	
	POTENCIAL(400000,500000), MEDIO(200000,400000), BAIXO(0,200000);
	
	private double faixaInicial;
	private double faixaFinal;
	
	ClassificacaoClientes(double faixaInicial, double faixaFinal){
		this.faixaInicial = faixaInicial;
		this.faixaFinal = faixaFinal;
	}
	
	public boolean isCompatible(ContaBancaria conta){
    	if (conta.getSaldo() >= faixaInicial && conta.getSaldo() <= faixaFinal){
    		System.out.println(this.name() + " Renda compat�vel.");
    		return true;
    	}
    	else
    	{
    		System.out.println(this.name() + " Renda n�o compat�vel.");
    		return false;
    	}
    }

}