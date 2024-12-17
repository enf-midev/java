package Poli;

public class Cavalo extends Mamífero{

	public Cavalo(String nome) {
		super(nome);
	}
	public void locomover() {
		System.out.printf("%s o cavalo está galopando \n",nome);
	}
	public void comer(String Comida) {
		
		System.out.printf("%s o cavalo está comendo %s\n",nome, Comida);
	}
}
