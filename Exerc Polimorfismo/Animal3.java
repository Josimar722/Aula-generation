package Polimorfismo;

public class Animal3 extends Animal {
	public Animal3(String string, int idade2) {
		super(string, idade2);
		// TODO Auto-generated constructor stub
	}



	private String animal;
	private int idade;
	

	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public void setAnimal(String animal) {
		this.animal = animal;
	}



	public String getAnimal()
	{
		return "Preguiça: " + super.getAnimal()+  " tem idade:" +
			    this.getIdade();
	}
	
	
	
}
