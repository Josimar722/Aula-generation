package POO;

import java.util.Scanner;

public class ProjetoCliente {
	Scanner leia = new Scanner(System.in);
	private String nome, sobrenome, email,endereco;
    private int RG, CPF, telefone;
	public ProjetoCliente(String nome,String sobrenome ,String email, int telefone,String endereco, int RG, int CPF) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.RG = RG;
		this.CPF = CPF;
	}
	
	

	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}





	public int getCPF() {
		return CPF;
	}



	public void setCPF(int cPF) {
		CPF = cPF;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getTelefone() {
		return telefone;
	}

	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	


	public void setRG(int rG) {
		RG = rG;
	}
	
	public int getRG() {
		return RG;
	}

	
	
	
	public void setCadastro()
	{
		System.out.println("\n\n");
		System.out.println("Bem vinto � nossa loja!");
		System.out.println("Primeiramente, vamos te cadastrar.");
		System.out.println("");
		System.out.println("");
		System.out.println("=======================");
		System.out.println("   CADASTRO CLIENTE");
		System.out.println("=======================");
		System.out.println("\n\n");
		 System.out.println("Digite o seu primeiro nome: ");
		 setNome(leia.next()); 
		 System.out.println("Digite o seu �ltimo nome: ");
		 setSobrenome(leia.next());
		 System.out.println("Digite o seu email: ");
		 setEmail(leia.next());
		 System.out.println("Digite o telefone: ");
		 setTelefone(leia.nextInt());
		 System.out.println("Digite o endere�o: ");
		 System.out.print("Rua ");
		 setEndereco(leia.next());
		 System.out.println("Digite o RG: ");
		 setRG(leia.nextInt());
		 System.out.println("Digite o CPF: ");
		 setCPF(leia.nextInt());
	}
	public void setAtualiza��o()
	{
		 System.out.println("Digite o seu email: ");
		 setEmail(leia.next());
		 System.out.println("Digite o telefone: ");
		 setTelefone(leia.nextInt());
		 System.out.println("Digite o endere�o: ");
		 setEndereco(leia.next());
		 System.out.println("*Dados atualizados.");
	}

	public String getCadastro()
	{
		return ("\nINFORMA��ES DO CLIENTE!"+"\n========================"+"\nNome: "+ getNome()+" "+getSobrenome()+"\nEndere�o "+getEndereco()+"\nEmail: "+getEmail()+"\nTelefone: "+getTelefone()+"\nRG: "+getRG()+"\nCPF: "+getCPF());
	}
}
