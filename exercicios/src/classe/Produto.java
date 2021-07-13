package classe;

public class Produto {
	
	String nome;
	double preco;
	static final double DESCONTO = 0.25;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
		
	}
	
	Produto(){}
	
	double precoComDesconto(double descontoDoGerente) {
		
		return preco - (preco * DESCONTO + descontoDoGerente);
	}
}
