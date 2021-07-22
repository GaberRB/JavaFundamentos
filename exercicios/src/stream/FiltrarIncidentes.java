package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FiltrarIncidentes {
	public static void main(String[] args) {
		
		Incidente i1 = new Incidente(1, "Duplicidade no valor", "Raiza", "media", "novo");
		Incidente i2 = new Incidente(1, "Duplicidade no valor da conta", "Raiza", "media", "andamento");
		Incidente i3 = new Incidente(1, "Error na transmissão no valor", "Raiza", "media", "andamento");
		Incidente i4 = new Incidente(1, "End to end", "Raiza", "media", "resolvido");
		Incidente i5 = new Incidente(1, "A transmissão deu errador", "Raiza", "media", "novo");
		Incidente i6 = new Incidente(1, "duplicado no valor do cliente", "Raiza", "media", "andamento");
		
		List<Incidente> incidentes = Arrays.asList(i1,i2,i3,i4,i5,i6);
		
		Predicate<Incidente> duplicidade = 
				a -> a.descricao
						.toLowerCase()
						.contains("duplic");
	    Predicate<Incidente> transmissao =
	    		a -> a.descricao
	    				.toLowerCase()
	    				.contains("transmi");
	    		
	    Predicate<Incidente> status =
	       		a -> a.status
	       				.equalsIgnoreCase("andamento");
	  

	    incidentes.stream()
	    	//.filter(status)
	    	//.filter(duplicidade)
	    	.filter(transmissao)
	    	.map(a -> a.descricao)
	    	.forEach(System.out::println);
	   
	    
	    		
				
	}

}
