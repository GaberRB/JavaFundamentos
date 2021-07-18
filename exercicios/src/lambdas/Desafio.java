package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		Produto p =  new Produto("Ipad", 3235.89, 0.13);
		
		
		BinaryOperator<Double> precoDesconto =
				(Double preco, Double desconto) -> (preco - (preco * desconto));
				
		UnaryOperator<Double> imposto = n -> n >=  2500 ? n + (n * 0.085) : n;
		
		UnaryOperator<Double> frete = n -> n >=  3000 ? n + 100 : n + 50 ;
		
		UnaryOperator<Double> arredondar = n -> Math.ceil(n);
		
		Function<Double, String> formatar = n-> "R$" + n.toString();
		
		System.out.println(precoDesconto
								.andThen(imposto)
								.andThen(frete)
								.andThen(arredondar)
								.andThen(formatar)
								.apply(p.preco, p.desconto));
		
	}

}
