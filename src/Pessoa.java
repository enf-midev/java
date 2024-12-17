package Membros;

public abstract class Pessoa {
	public String nome;
	public String CPF;
	public String telefone;
	
	 public Pessoa(String nome, String CPF, String telefone) {
			this.nome = nome;
			this.CPF = CPF;
			this.telefone = telefone;
}
	
	public void acordar() {

		System.out.printf("%s acordou \n", nome);
	}
	public void dormir() {

		System.out.printf("%s está dormindo \n", nome);
	}
	public void trabalhar() {

		System.out.printf("%s está trabalhando \n", nome);
	}
	
}
