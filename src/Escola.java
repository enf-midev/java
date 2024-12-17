package Membros;

public class Escola {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Milene", "17174809821","81987654022");
		Professor prof = new Professor("Peixe", "67584832032032","85920398232");
		prof.AplicarProva();
		aluno.sofrer();
		aluno.acordar();
		prof.trabalhar();
	}

}
