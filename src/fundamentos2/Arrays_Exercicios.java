package fundamentos2;

import java.util.Scanner;

public class Arrays_Exercicios {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num_1[] = new int [4];
		int num_2[] = new int [4];
		int num_3[] = new int [4];
		int num_4[] = new int [4];
		for (int x=0;x<4;x++) {
		System.out.println("Quais os num_1? ");
		num_1[x] = n.nextInt();
		System.out.println("Quais os num_2? ");
		num_2[x] = n.nextInt();
		System.out.println("Quais os num_3? ");
		num_3[x] = n.nextInt();
		System.out.println("Quais os num_4? ");
		num_4[x] = n.nextInt();
		}
		for (int i : num_1) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		for (int i : num_2) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		for (int i : num_3) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		for (int i : num_4) {
			System.out.print(i + " ");
			
		}
	}

}
