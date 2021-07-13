package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra c1= new Compra();
		c1.cliente = "João Pedro";
		c1.itens.add(new Item("Notebook", 1, 6000.00));
		c1.itens.add(new Item("Monitor", 1, 1500.00));
		c1.itens.add(new Item("Caderno", 2, 18.56));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
	}
}
