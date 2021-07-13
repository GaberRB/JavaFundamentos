package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("NoteBook");
		//p1.nome = "Notebook";
		p1.preco = 4356.89;
		//p1.desconto = 0.35;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.33;
		//p2.desconto = 0.25;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		
		double precoFinal = p1.precoComDesconto(0.1);
		
		System.out.println(precoFinal);
	}

}
