package Calculadora;

import javax.swing.JOptionPane;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		//Soma
		 String valor1 = JOptionPane.showInputDialog(null, "Valor 1 : ", "Soma", JOptionPane.PLAIN_MESSAGE);
		 String valor2 = JOptionPane.showInputDialog(null, "Valor 2 : ", "Soma", JOptionPane.PLAIN_MESSAGE);
		 System.out.println("Soma : (" + valor1 + " + " + valor2  + ") -> " + calc.somar(Float.parseFloat(valor1), Float.parseFloat(valor2)));
		
		 //Subtra��o
		 valor1 = JOptionPane.showInputDialog(null, "Valor 1 : ", "Subtra��o", JOptionPane.PLAIN_MESSAGE);
		 valor2 = JOptionPane.showInputDialog(null, "Valor 2 : ", "Subtra��o", JOptionPane.PLAIN_MESSAGE);
		 System.out.println("Subtra��o : (" + valor1 + " - " + valor2 + ") -> " +  calc.subtrair(Float.parseFloat(valor1), Float.parseFloat(valor2)));
		 
		 //Divis�o
		 valor1 = JOptionPane.showInputDialog(null, "Valor 1 : ", "Divis�o", JOptionPane.PLAIN_MESSAGE);
		 valor2 = JOptionPane.showInputDialog(null, "Valor 2 : ", "Divis�o", JOptionPane.PLAIN_MESSAGE);
		 System.out.println("Divis�o : (" + valor1 + " / " + valor2 + ") -> " + calc.dividir(Float.parseFloat(valor1), Float.parseFloat(valor2)));

		 //Multiplica��o
		 valor1 = JOptionPane.showInputDialog(null, "Valor 1 : ", "Multiplica��o", JOptionPane.PLAIN_MESSAGE);
		 valor2 = JOptionPane.showInputDialog(null, "Valor 2 : ", "Multiplica��o", JOptionPane.PLAIN_MESSAGE);
		 System.out.println("Multiplica��o : (" + valor1 + " * " + valor2 + ") -> " +  calc.multiplicar(Float.parseFloat(valor1), Float.parseFloat(valor2)));

	}

}
