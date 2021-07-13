package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro palio = new Carro();
		
		System.out.println(palio.estaLigado());
		
		palio.ligar();
		System.out.println(palio.estaLigado());
		
		System.out.println(palio.motor.giros());
		
		palio.acelerar();
		palio.acelerar();
		palio.acelerar();
		palio.acelerar();
		
		System.out.println(palio.motor.giros());
		
		palio.frear();
		palio.frear();
		palio.frear();
		palio.frear();
		
		System.out.println(palio.motor.giros());
		
		
	}

}
