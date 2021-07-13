package arrays.desafios;

import java.util.Scanner;

public class Desafio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas : ");
		
		int quantidadeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			
			System.out.print("Digite à " + (i + 1) + "° nota: ");
			notas[i] = entrada.nextDouble();
		}
		entrada.close();
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.println("A média do aluno é: " +  (total / notas.length));
		
	}

}
