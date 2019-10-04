package Calculadora;

import javax.swing.JOptionPane;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		//Soma
		 String valor1 = JOptionPane.showInputDialog(null, "Valor 1 : ", "Soma", JOptionPane.PLAIN_MESSAGE);
		 String valor2 = JOptionPane.showInputDialog(null, "Valor 2 : ", "Soma", JOptionPane.PLAIN_MESSAGE);
		 System.out.println("Soma : (" + valor1 + " + " + valor2  + ") -> " + calc.somar(Float.parseFloat(valor1), Float.parseFloat(valor2)));
		
		 //Subtração
		 valor1 = JOptionPane.showInputDialog(null, "Valor 1 : ", "Subtração", JOptionPane.PLAIN_MESSAGE);
		 valor2 = JOptionPane.showInputDialog(null, "Valor 2 : ", "Subtração", JOptionPane.PLAIN_MESSAGE);
		 System.out.println("Subtração : (" + valor1 + " - " + valor2 + ") -> " +  calc.subtrair(Float.parseFloat(valor1), Float.parseFloat(valor2)));
		 
		 //Divisão
		 valor1 = JOptionPane.showInputDialog(null, "Valor 1 : ", "Divisão", JOptionPane.PLAIN_MESSAGE);
		 valor2 = JOptionPane.showInputDialog(null, "Valor 2 : ", "Divisão", JOptionPane.PLAIN_MESSAGE);
		 System.out.println("Divisão : (" + valor1 + " / " + valor2 + ") -> " + calc.dividir(Float.parseFloat(valor1), Float.parseFloat(valor2)));

		 //Multiplicação
		 valor1 = JOptionPane.showInputDialog(null, "Valor 1 : ", "Multiplicação", JOptionPane.PLAIN_MESSAGE);
		 valor2 = JOptionPane.showInputDialog(null, "Valor 2 : ", "Multiplicação", JOptionPane.PLAIN_MESSAGE);
		 System.out.println("Multiplicação : (" + valor1 + " * " + valor2 + ") -> " +  calc.multiplicar(Float.parseFloat(valor1), Float.parseFloat(valor2)));

	}

}
