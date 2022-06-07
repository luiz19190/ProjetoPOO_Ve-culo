package Aulacar;

public class Polo2022 extends Polo {
	
	@Override
	protected void tipoModelo() {
		System.out.println("Atualizou para hatch");
	}

	@Override
	protected void tamanhoMala() { 
		System.out.println("Pequena");
	}
}
