package fundamentos;

public class DesafioAritimetico {
	public static void main(String[] args) {
		
		int soma1 = 3 + 2;
		int mult1 = (int) Math.pow(6 * soma1, 2);
		int div1 = mult1 / (3 * 2);
		
		int sub1 = (1 - 5) * (2 - 7);
		int div2 = (int) Math.pow(sub1 / 2, 2);
		
		int fracao1 = (int) Math.pow(div1 - div2, 3);
		
		int fracao2 = (int) fracao1 / (int) Math.pow(10, 3); 
		
		System.out.println(fracao2);
	}
}
