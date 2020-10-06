package Pessoa;

public class Vendedor extends Pessoa {
	private String nome;
	private float Valorprod;
	private float comissao;
	private float baseVend; 
	
	
	public Vendedor(String nome, float Valorprod, float comissao, float baseVend) {
		super(nome, Valorprod, comissao, baseVend);
		this.nome = nome;
		this.Valorprod = Valorprod;
		this.comissao = comissao;
		this.baseVend = baseVend;
		
	}
	
	public void imprimirInfo (){
	    System.out.println("\nO vendedor: "+getNome()+"\n"+ "vendeu: " + Valorprod +"\nSua comissao é: "+ comissao+ "\ne sua base é: " + getBaseVend());
	}
	
	public void calcularValor() {
		double valor_total = Valorprod + (Valorprod*(comissao/100));
		System.out.println("O valor total a ser recebido pelo vendedor "+getNome()+" é igual a: "+valor_total);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValorprod() {
		return Valorprod;
	}

	public void setValorprod(float valorprod) {
		Valorprod = valorprod;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public float getBaseVend() {
		return baseVend;
	}

	public void setBaseVend(float baseVend) {
		this.baseVend = baseVend;
	}
	
	
}
