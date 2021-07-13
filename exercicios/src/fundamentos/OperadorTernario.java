package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		
		double media = 5.6;
		String resultadoRecuperacao = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultado = media >= 7.0 ? "aprovado" : resultadoRecuperacao;
		
		System.out.println("O Aluno está " + resultado);
	}
}
