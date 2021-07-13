package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		// TODO Auto-generated constructor stub
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
}
