package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		//Offer e add => add elementos na fila
		//diferente � quando a fila est� cheia
		fila.add("Ana");
		fila.offer("Bia");//lan�a uma exce�ao
		fila.offer("Carlos");
		fila.offer("Manu");
		fila.offer("Z�");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		
		System.out.println(fila.poll());
		
		
	}
}
