package questao5;

public class Atributo {
	int 	valor;
	boolean status;
	
	
	public Atributo(int valor, boolean status) {
		super();
		this.valor = valor;
		this.status = status;
	}


	@Override
	public String toString() {
		return "[" + valor + "," + status + "]";
	}
	
	
}
