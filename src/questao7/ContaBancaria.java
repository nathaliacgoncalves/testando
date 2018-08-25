package questao7;

public class ContaBancaria {
	String	nome;
	int		numero;
	String	senha;
	double	saldo;
	
	public ContaBancaria(String nome, int numero, double saldo) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	



}
