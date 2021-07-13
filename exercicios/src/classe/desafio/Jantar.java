package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		//instancia
		Pessoa pessoa = new Pessoa("Gabriel", 93.0);
		Comida burrito =  new Comida("Burrito", 0.555);
		Comida hotRoll = new Comida("Hot Roll", 0.100);
		
		
		System.out.println("Antes de comer");
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Peso: " + pessoa.peso);
		pessoa.comer(hotRoll);
		System.out.println("------------------------");
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Peso: " + pessoa.peso);
		
		
	}

}
