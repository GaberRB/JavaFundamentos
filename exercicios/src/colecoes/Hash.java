package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Andr�"));
		usuarios.add(new Usuario("Jo�o"));
		
		boolean resultado = usuarios.contains(new Usuario("Jo�o"));
		System.out.println(resultado);
		
	}

}
