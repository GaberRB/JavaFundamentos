package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		//criar um cliente
		//criar 2 compras
		
		Cliente cliente = new Cliente("João");
		
		Compra compra1 = new Compra();
		compra1.adiconarItem("Caneta", 9.67, 100);
		compra1.adiconarItem(new Produto("Notebook", 5000.00), 1);
		
		
		Compra compra2 = new Compra();
		compra2.adiconarItem("Caderno", 9.67, 10);
		compra2.adiconarItem(new Produto("TV", 3000.00), 1);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}
}
