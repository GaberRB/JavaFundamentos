package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calculo.apply(2.2, 3.3));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(2.2, 3.3));
	}

}
