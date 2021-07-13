package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta": 			
			System.out.println("Sei o Bassai-Dai");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		default:
			System.out.println("Não sei nada");
		}
			
	}
}
