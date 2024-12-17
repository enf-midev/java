package encapsulamento;

public class Animal {
	private String Nome; 
	private String tipo;
	private String Raca; 
	private int Idade; 
	private String RG;
	private String Tutor;
	private char Porte;
	// set é ajudar 
	// get é ler
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaca() {
		return Raca;
	}
	public void setRaca(String raca) {
		Raca = raca;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getTutor() {
		return Tutor;
	}
	public void setTutor(String tutor) {
		Tutor = tutor;
	}
	public char getPorte() {
		return Porte;
	}
	public void setPorte(char porte) {
		Porte = porte;
	}
}