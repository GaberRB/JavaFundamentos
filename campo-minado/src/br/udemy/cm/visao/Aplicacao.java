package br.udemy.cm.visao;

import br.udemy.cm.modelo.Tabuleiro;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);

	}

}
