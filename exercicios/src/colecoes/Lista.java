package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Lisa"));
		
		System.out.println(lista.get(3));
		
		
		lista.remove(1);
		lista.remove(new Usuario("Lisa"));
		
		lista.contains(new Usuario("Carlos"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}

}
