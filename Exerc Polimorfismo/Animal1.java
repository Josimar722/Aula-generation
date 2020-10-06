package Polimorfismo;

public class Animal1 extends Animal {

	 public Animal1(String animal,int idade) {   
		 
		  super(animal, idade);
		  this.animal = animal;
		  this.idade = idade;
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
		return "Cachorro: " + super.getAnimal() + " tem idade:" +
	    this.getIdade();
		
		
	}
}
