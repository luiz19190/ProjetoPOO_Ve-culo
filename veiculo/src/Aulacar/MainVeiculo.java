package Aulacar;

public class MainVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polo p = new Polo();
		Hilux h = new Hilux();
		Onix o = new Onix();
		Polo2022 n = new Polo2022();
		
		p.tamanhoMala();
		p.tipoModelo();
		
		h.tamanhoMala();
		h.tipoModelo();
		
		o.tamanhoMala();
		o.tipoModelo();
		
		n.tamanhoMala();
		n.tipoModelo();
	}

}
