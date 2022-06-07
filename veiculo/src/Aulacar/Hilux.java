package Aulacar;

public class Hilux extends Carro {
	
	private int aroPneu;
	
	public int getAropneu() {
		return aroPneu;
	}

	public void setAroPneu(int aroPneu) {
		this.aroPneu = aroPneu;
	}

	@Override
	protected void tipoModelo() {
		System.out.println("SUV");
	}

	@Override
	protected void tamanhoMala() { 
		System.out.println("Enorme");
	}

}
