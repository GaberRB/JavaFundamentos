package oo.heranca.desafio;

public class Jeep extends Carro implements Esportivo{
	
	public Jeep(){
		super(260);
	}
	
	public void acelerar(){
		super.acelerar();
		super.acelerar();
		super.acelerar();
		
	}
	
	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		
	}

}
