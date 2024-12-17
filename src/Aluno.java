package Membros;

public class Aluno extends Pessoa{

		public Aluno(String nome, String CPF, String telefone) {
		super(nome, CPF, telefone);
		
	}

		public double nota;
		
		public void sofrer() {

			System.out.printf("%s %s está sofrendo \n",nome,CPF);
		}
}
