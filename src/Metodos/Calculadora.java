package Metodos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
		System.out.println("Digite seu numero A:");
		int a = id.nextInt(); 
		System.out.println("Digite seu numero B:");
		int b = id.nextInt(); 
		CalcularMetodos s1 = new CalcularMetodos(); 
		int num = s1.somar(a, b);
		System.out.println(num);
		int num2 = s1.sub(a, b);
		System.out.println(num2);
		int num3 = s1.mul(a, b);
		System.out.println(num3);
		int num4 = s1.div(a, b);
		System.out.println(num4);

	}

}
