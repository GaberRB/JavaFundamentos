package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Forcenedor {
	
	public static void main(String[] args) {
		
		Supplier<List<String>> umLista =
				() -> Arrays.asList("Ana", "Bia", "Lia");
				
		System.out.println(umLista.get());
	}

}
