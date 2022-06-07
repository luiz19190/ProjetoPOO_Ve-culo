package Aulacar;

public abstract class Carro {

private String mala;
private int farol;
private int pneu;


public String getMala() {
	return mala;
}
public void setMala(String mala) {
	this.mala = mala;
}
public float getFarol() {
	return farol;
}
public void setFarol(int farol) {
	this.farol = farol;
}
public float getPneu() {
	return pneu;
}
public void setPneu(int pneu) {
	this.pneu = pneu;
}
//MÉTODOS
protected abstract void tipoModelo();
protected abstract void tamanhoMala();

}

