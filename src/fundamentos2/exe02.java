package fundamentos2;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in); 
		int num = 1, valor;		
		
		System.out.println("Informe um número: ");
		valor = n.nextInt();
		
		while (num < valor) {
			if (num % 2 !=0) {
		 System.out.printf(num+ ",");
		 }
		num++; 
		}
		System.out.println();
		num = 1;
		while (num<=100) {
			if(num % 2==0) {
			System.out.print(num+ " ");
		}
		num++;
	}
}
}