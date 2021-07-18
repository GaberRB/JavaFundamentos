package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Heroi heroi = new Heroi(0,0);
		heroi.x =10;
		heroi.y = 10;
		
		Monstro monstro = new Monstro();
		monstro.x =10;
		monstro.y = 11;
		
		
		System.out.println(heroi.vida);
		System.out.println(monstro.vida);
		
		heroi.atacar(monstro);
		
		System.out.println(heroi.vida);
		System.out.println(monstro.vida);
		
		
	}
}
