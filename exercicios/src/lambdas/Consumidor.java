package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta Amarela", 5.00, 0.9);
		
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Caneta Azul", 5.00, 0.9);
		Produto p3 = new Produto("Caneta Vermelha", 5.00, 0.9);
		Produto p4 = new Produto("Caneta Preta", 5.00, 0.9);
		Produto p5 = new Produto("Caneta Verde", 5.00, 0.9);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		
		
		
	}

}
