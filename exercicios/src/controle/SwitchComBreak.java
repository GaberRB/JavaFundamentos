package controle;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		String conceito ="";
		int nota = 7;
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		default:
			conceito = "não informado";

		}
		
		System.out.println("Conceito é " + conceito);
	}
}
