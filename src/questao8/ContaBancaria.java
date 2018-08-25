package questao8;

public class ContaBancaria {
	String	nome;
	int		numero;
	String	senha;
	double	saldo;
	
	public ContaBancaria(String nome, int numero, String senha) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.senha = senha;
		this.saldo = 0;
	}

	@Override
	public String toString() {
		return "[numero=" + numero + ", saldo=" + saldo + "]";
	}


	



}
