package oo.heranca.desafio;

public class Carro {
	
	private final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual = 0;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar(){
		if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += 5;
		}
		
	}
	
	public void frear(){
		if(velocidadeAtual >= 0) {
			velocidadeAtual -= 5;
		}		
	}
	

}
