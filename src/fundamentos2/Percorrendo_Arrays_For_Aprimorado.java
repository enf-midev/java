package fundamentos2;

public class Percorrendo_Arrays_For_Aprimorado {

	public static void main(String[] args) {
		int[] arrayNum = {87,68,52,5,49,83,45,12,64};
		int total = 0;
		// ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL 
		for (int i : arrayNum)
			total +=i;
		System.out.printf("Soma dos elementos arrayNum: %d\n", total);

	}

}
