package acabou;

public class Triatleta implements Nadador, Ciclista, Corredor {
	public String nome;
	public int idade;
	
	public void correr() {
	 System.out.printf("O %s está correndo \n", nome);
		
	}


	public void pedalar() {
	System.out.printf("O %s está pedalando \n", nome);
	}


	public void nadar() {
	System.out.printf("O %s está nadando \n", nome);	
		
	}


	public void aquecer() {
		System.out.printf("O %s está aquecendo \n", nome);	
	}

}
