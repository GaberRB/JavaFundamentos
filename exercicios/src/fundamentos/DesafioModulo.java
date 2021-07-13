package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		/*
		 * ler 2 numeros informados pelo usuario
		 * receber uma operação
		 * exibir o resultado
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o operador: ");
		String operador = entrada.next();
		
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
		
		entrada.close();
		
	}
}
