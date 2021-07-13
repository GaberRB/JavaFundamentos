package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(1, 11, 2021);
		
		System.out.println(d1.dia + "/" + "/" + d1.mes +"/"+ d1.ano);
		System.out.println(d2.dia + "/" + "/" + d2.mes +"/"+ d2.ano);
				
	}
	
	

}
