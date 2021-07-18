package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Jeep;

public class CarroTeste {
	public static void main(String[] args) {
		
		Jeep jeep = new Jeep();
		Civic civic = new Civic();
		
		jeep.acelerar();
		jeep.acelerar();
		jeep.acelerar();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println("Velocidade Jeep ==> " + jeep.velocidadeAtual);
		System.out.println("Velocidade Civic ==> " + civic.velocidadeAtual);
	}

}
