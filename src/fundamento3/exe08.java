package fundamento3;

public class exe08 {

	public static void main(String[] args) {
		// comparar se duas string são iguais independentes se são maiusculas ou minusculas;
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println(b4);

	}

}
