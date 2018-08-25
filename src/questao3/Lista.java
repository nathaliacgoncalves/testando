package questao3;

public class Lista {
	private No noInicial;
	private No noFinal;
	private int contador;
		
	public void imprimir() {
		No noAux = noInicial;
		for (int i = 0; i < contador; i++) {
			System.out.print(noAux.valor + " ");
			noAux = noAux.proximoNo;
		}	
	}
	
	private void imprimirInvertido(No aux) {
		if(aux != null) {
			imprimirInvertido(aux.proximoNo);
			System.out.print(aux.valor + " ");
		}
	}
	
	public void imprimirInvertido() {
		this.imprimirInvertido(noInicial);
	}
	
	public void addInicio(No addNo) {
		if(addNo.valor >= 0) {
			if(contador == 0) {
				noInicial = addNo;
				noFinal = addNo;
			} else {
				addNo.proximoNo = noInicial;
				noInicial = addNo;
			}
			contador++;
		}
	}
	
	public void addFim(No addNo) {
		if(addNo.valor >= 0) {
			if(contador == 0) {
				noInicial = addNo;
				noFinal = addNo;
			} else {
				noFinal.proximoNo = addNo;
				noFinal = addNo;
			}
			contador++;
		}
	}
	
	public void add(int posicao, No addNo) {
		if(posicao >= 0 && posicao <= contador) {
			if(posicao == 0) {
				this.addInicio(addNo);
			} else if (posicao == contador) {
				this.addFim(addNo);
			} else {
				if(addNo.valor >= 0) {				
					No noAux = noInicial;
					for(int i = 0; i < posicao-1; i++) {
						noAux = noAux.proximoNo;
					}
					addNo.proximoNo = noAux.proximoNo;
					noAux.proximoNo = addNo;
					contador++;
				}
			}
		}
	}

	public int removerInicio() {
		No noRemover = noInicial; 
		if(contador == 1) {
			noInicial = null;
			noFinal = null;
			contador--;
		} else {
			noInicial = noInicial.proximoNo;
			contador--;
		}
		
		return noRemover.valor;
	}

	public int removerFinal() {
		No noRemover = noFinal; 
		No noAux = noInicial;
		if(contador == 1) {
			noInicial = null;
			noFinal = null;
			contador--;
		} else {
			for(int i = 0; i < contador - 1; i++) {
				noAux = noAux.proximoNo;
			}
			noFinal = noAux;
			contador--;
		}
		
		return noRemover.valor;
	}

	public int remover(int posicao) {
		if(posicao >= 0 && posicao <= contador) {
			if(posicao == 0) {
				return this.removerInicio();				
			} else if (posicao == contador) {
				return this.removerFinal();
			} else {
				No noAux = noInicial;
					for(int i = 0; i < posicao - 1; i++) {
						noAux = noAux.proximoNo;
					}
					No noRemover = noAux.proximoNo;
					noAux.proximoNo = noRemover.proximoNo;
					contador--;
				return noRemover.valor;
			}
		} else {
			return -1;
		}
	}

	public int getContador() {
		return contador;
	}

}
