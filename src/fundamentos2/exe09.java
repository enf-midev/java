package fundamentos2;

import java.util.Scanner;

public class exe09 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in); // objeto do tipo scanner para entrada de dado
		int aluno,cont=0;
		double notas=0,media; 
		
		System.out.println("Quantos alunos existem na sala? ");
		aluno = n.nextInt();
	
	
		for (int i = 0; i< aluno; i++){
		 System.out.println("Informe a nota do aluno ");
		 notas += n.nextDouble();
			cont++; 
		}
		media = notas/aluno;
		System.out.println("A média da turma é: "  + media );
	}

}


