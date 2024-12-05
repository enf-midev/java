package Metodos;

public class LojadeCarro {

	public static void main(String[] args) {
		ContrutoresCarro p1 = new ContrutoresCarro();
		ContrutoresCarro p2 = new ContrutoresCarro("Abarth", 102000);
		ContrutoresCarro p3 = new ContrutoresCarro("Preto","Abarth", 102000.00);
		System.out.println(p2.modelo + " " + p2.preco);
		

	}

}
