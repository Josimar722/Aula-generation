package Pessoa;

public class Admin extends Pessoa {
	
	  private String nome;
	  private int AjudaCusto;
	  
	  
	  public Admin(String nome,int AjudaCusto) {   
		 
		  super(nome,nome, nome, AjudaCusto, AjudaCusto);
		  this.nome = nome;
		  this.AjudaCusto = AjudaCusto;
	  }
		 public void imprimirInfo (){
		    System.out.println("\nO Adm: "+getNome()+"\n"+ "Vai ajudar com um valor de: " + getAjudaCusto());
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getAjudaCusto() {
			return AjudaCusto;
		}
		public void setAjudaCusto(int ajudaCusto) {
			AjudaCusto = ajudaCusto;
		}
		 
		
}
  


