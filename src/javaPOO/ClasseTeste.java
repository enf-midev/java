package javaPOO;

public class ClasseTeste {

	public static void main(String[] args) {
		ClassePessoa aluno01 = new ClassePessoa();
		ClassePessoa aluno02 = new ClassePessoa();
		aluno01.nome = "Wellington";
		aluno01.sobrenome = "Silva";
		aluno02.nome = "Danyel";
		aluno02.sobrenome = "Souza";
		aluno01.comer();
		aluno02.comer();
		
	}

}
