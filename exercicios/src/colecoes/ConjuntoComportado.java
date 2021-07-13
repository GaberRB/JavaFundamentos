package colecoes;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>();
		Set<String> listaAprovados = new TreeSet<>();//ordenando o set
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Preto");
		
		for(String canditato: listaAprovados) {
			System.out.println(canditato);
			
		}
		
	}

}
