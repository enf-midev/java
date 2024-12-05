package Metodos;

import java.util.Scanner;

public class JavaMetodos {

		int idade() {
			Scanner id = new Scanner(System.in);
			System.out.println("Digite sua idade:");
			int resp = id.nextInt(); 
			return resp; 
		}
		double valor() {
			return 25.50;
		}
		String nome() {
			return "Wellington"; 
		}
		boolean estado() {
			return true;
		}
		void mostraNome(){
			System.out.println("João");
		}
	}


