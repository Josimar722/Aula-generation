package ProgramasPOO;

public class Aviao {
	
	private String nomeAviao;
	private int  NumAviao;
	private String CompAviao;
	

	public Aviao(String nome, String aviao) {
		nomeAviao = nome;
		CompAviao = aviao;
	}

	public void Aviao (String nome, String aviao)
	{
		nomeAviao = nome;
		CompAviao = aviao;
	}
	
	public String getNomeCompleto()
	{
		String NomeCompleto = nomeAviao + " "+CompAviao;
		return NomeCompleto;
	}
	
	int nAviao()
	{
		if(this.NumAviao<11)
		{
			
		}
		return NumAviao;
	}
	
	void nAviao(int nAviao)
	{
		int NumAviao = this.NumAviao;
	}
	
	
	

}
