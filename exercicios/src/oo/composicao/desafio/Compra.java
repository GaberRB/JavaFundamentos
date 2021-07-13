package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	final ArrayList<Item> itens = new ArrayList<Item>();
	
	void adiconarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(quantidade, produto));
	}
	
	void adiconarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(quantidade, new Produto(nome, preco)));
	}
	
	
	double obterValorCompra() {
		double total = 0;
		
		for(Item item: itens) {
			
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}

}
