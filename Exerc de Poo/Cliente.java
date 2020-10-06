package ProgramasPOO;

public class Cliente {
	
	private String nomeCliente;
	private int  cpfCliente;
	private String SobreNome;
	

	public Cliente(String nome, String sobre) {
		nomeCliente = nome;
		SobreNome = sobre;
	}

	public void Cliente (String nome, String sobre)
	{
		nomeCliente = nome;
		SobreNome = sobre;
	}
	
	public String getNomeCompleto()
	{
		String NomeCompleto = nomeCliente + " "+SobreNome;
		return NomeCompleto;
	}
	
	int Cpf()
	{
		if(this.cpfCliente<11)
		{
			
		}
		return cpfCliente;
	}
	
	void Cpf(int Cpf)
	{
		int cpfCliente = this.cpfCliente;
	}
	
	
	

}
