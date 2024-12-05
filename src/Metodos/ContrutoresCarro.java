package Metodos;

public class ContrutoresCarro {
      public String cor;
      public double preco;
      public String modelo;
      
      /* CONSTRUTOR PADRÃO */
      public ContrutoresCarro() {
      }
      /* CONSTRUTOR COM 2 PARAMETROS */ 
      public ContrutoresCarro(String modelo, double preco) {
    	  //Se for escolhido o contrutor sem a COR do veículo 
    	  // definimos a cor padrão como sendo PRETA
    	  this.cor = "PRETA";
    	  this.modelo = modelo;
    	  this.preco = preco;
      }
      /* CONSTRUTOR COM 3 PARÂMETROS */
	 public ContrutoresCarro(String cor, String modelo, double preco) {
			this.cor = cor;
			this.modelo = modelo;
			this.preco = preco;
}
}
