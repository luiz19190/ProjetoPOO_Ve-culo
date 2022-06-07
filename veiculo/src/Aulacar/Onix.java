package Aulacar;

public class Onix extends Carro{
	
private String corPainel;
	
	public String getCorpainel() {
		return corPainel;
	}

	public void setCorPainel(String corPainel) {
		this.corPainel = corPainel;
	}

	@Override
	protected void tipoModelo() {
		System.out.println("Hatch");
	}

	@Override
	protected void tamanhoMala() { 
		System.out.println("Pequena");
	}

}
