package ProgramasPOO;

public class Conta{
	
	private String TipoConta;
	private int  NumConta;
	private String Ag;
	

	public Conta(String nome, String tipo) {
		TipoConta= nome;
		Ag = tipo;
	}

	public void Conta(String nome, String tipo)
	{
		TipoConta = nome;
		Ag = tipo;
	}
	
	public String getNomeCompleto()
	{
		String NomeCompleto = TipoConta + " "+Ag;
		return NomeCompleto;
	}
	
	int nCont()
	{
		if(this.NumConta<6)
		{
			
		}
		return NumConta;
	}
	
	void nCont(int nCont)
	{
		int NumConta = this.NumConta;
	}
	
	
	

}
