package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		//Offer e add => add elementos na fila
		//diferente é quando a fila está cheia
		fila.add("Ana");
		fila.offer("Bia");//lança uma exceçao
		fila.offer("Carlos");
		fila.offer("Manu");
		fila.offer("Zé");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		
		System.out.println(fila.poll());
		
		
	}
}
