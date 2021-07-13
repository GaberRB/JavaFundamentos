package fundamentos.exercicios;

import java.util.Scanner;

public class ConverterTemperatura {
	public static void main(String[] args) {
		/*
		 *Criar um programa que leia uma temperatura em Fahrenheit e converta para Celsius 
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit");
		int f = entrada.nextInt();
		
		int c =  (f - 32) * 5/9;
		
		System.out.printf("A Temperatura é %d °C", c);
		
		entrada.close();
	}
}
