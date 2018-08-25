package questao1;

public class Lista {
	private int aux;
	private int vetor[] = new int [100];
	
	public void imprimir() {
		for(int i = 0; i < aux; i++) {
			System.out.print(vetor[i] + " ");
		} 
		System.out.println(" ");
	}
	
	public int getAux() {
		return aux;
	}

	
	public void addFim(int valor) {
		if(aux < vetor.length && valor >= 0) {
			vetor[aux] = valor;
			aux ++;
		} else {
			System.out.println("indisponivel");
		}
	}
	
	public void addInicio(int valor) {
		if(aux < vetor.length && valor >= 0) {
			for(int i = aux; i > 0; i--) {
				vetor[i] = vetor[i-1];
			}
			vetor[0] = valor;
			aux++;
			}
		else {
			System.out.println("cheio");
		}
	}
	
	public void addPosicao(int valor, int posicao) {
		if(posicao >= 0 && posicao < aux && valor >= 0) {
			for(int i = aux; i > posicao; i--) {
				vetor[i] = vetor[i-1];
			}
			vetor[posicao] = valor;
			aux++;
			}
		else {
			System.out.println("cheio");
		}
	}

	public int removeFim() {
		int retorno = vetor[aux - 1];
		aux--;
		return retorno;
	}
	
	public int removeInicio() {
		int retorno = vetor[0];
		for(int i = 0; i < aux; i++) {
			vetor[i] = vetor[i+1];
		}
		aux--;
		return retorno;
	}
	
	public int removePosicao(int posicao) {
		if(posicao >=0 && posicao <= aux) {
			int retorno = vetor[posicao];
			for(int i = posicao; i < aux; i++) {
				vetor[i] = vetor[i+1];
			}
			aux--;
			return retorno;
		}
		return -1;
	}
	
	public int buscar(int valor) {
		for(int i = 0; i < aux; i++) {
			if(vetor[i] == valor) {
				return valor;
			}
		}
		return -1;
	}
	
	public void alterar(int valor, int posicao) {
		if(posicao >=0 && posicao <= aux && valor >= 0) {
			vetor[posicao] = valor;
		}
	}
}
