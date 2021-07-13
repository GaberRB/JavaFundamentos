package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		/**
		 * Usar Scanner para pegar a entrada
		 * Usar nextLine
		 * Receber 3 strings
		 * pegar 3 ultimos salarios de um funcionario
		 * calcular a m�dia dos 3 salarios
		 * o funcionario pode ter a op��o de trocar a casa decimal por virgula ou ponto
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro s�lario: ");
		String valor1 = entrada.nextLine();
		
		System.out.println("Digite o segundo s�lario: ");
		String valor2 = entrada.nextLine();
		
		System.out.println("Digite o terceiro s�lario: ");
		String valor3 = entrada.nextLine();
		
		//trata valores com virgula
		valor1 = valor1.replace(",", ".");
		valor2 = valor2.replace(",", ".");
		valor3 = valor3.replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		
		System.out.println("A m�dia dos 3 s�larios �: " 
		+ (salario1 + salario2 + salario3) / 3);
		
		entrada.close();
	}
}
