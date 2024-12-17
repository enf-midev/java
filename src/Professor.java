package Membros;

public class Professor extends Pessoa{

	public Professor(String nome, String CPF, String telefone) {
		super(nome, CPF, telefone);
	}
		public double salario; 
		
		public void AplicarProva() {
			System.out.printf("%s aplicando prova \n",nome);
		}
}
