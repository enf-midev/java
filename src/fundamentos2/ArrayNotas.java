package fundamentos2;

import java.util.Scanner;

public class ArrayNotas {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double notas[] = new double[5], soma = 0, media = 0; 
		
		for(int y=0;y<notas.length;y++) {
			System.out.printf("Digite a nota %d",y);
			notas[y] = ent.nextDouble();
		
		}
		for (double h: notas ) {
			soma+=h;
		}
		media = soma/notas.length;
		System.out.println(media);
	}

}
