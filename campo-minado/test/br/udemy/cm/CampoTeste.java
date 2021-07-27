package br.udemy.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.udemy.cm.execesao.ExplosaoException;
import br.udemy.cm.modelo.Campo;

class CampoTeste {
	
	private Campo campo;

	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
		
	}
	
	
	@Test
	void testeVizinhoRealDistancia1() {
		
		Campo vizinho = new Campo(3,2);
		

		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
		
	}
	

}
