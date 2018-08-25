package questao9_listacircular;

public class Lista {
	private No noInicial;
	private int contador;
		
	public void imprimir() {
		No noAux = noInicial;
		for (int i = 0; i < contador; i++) {
			System.out.print(noAux.valor + " ");
			noAux = noAux.proximoNo; 
		}	
		System.out.println(" ");
	}
	
	public void addFim(No addNo) {
		if(contador == 0) {
			noInicial = addNo;
		} else if (contador == 1) {
			noInicial.proximoNo = addNo;
			noInicial.anteriorNo = addNo;
			addNo.proximoNo = noInicial;
			addNo.anteriorNo = noInicial;
		} else {
			addNo.proximoNo = noInicial;
			addNo.anteriorNo = noInicial.anteriorNo;
			noInicial.anteriorNo.proximoNo = addNo;
			noInicial.anteriorNo = addNo;
		}
		contador++;		
	}
	public void addInicio(No addNo) {
		if(contador == 0) {
			noInicial = addNo;
		} else if (contador == 1) {
			noInicial.proximoNo = addNo;
			noInicial.anteriorNo = addNo;
			addNo.proximoNo = noInicial;
			addNo.anteriorNo = noInicial;
		} else {
			addNo.proximoNo = noInicial;
			addNo.anteriorNo = noInicial.anteriorNo;
			noInicial.anteriorNo.proximoNo = addNo;
			noInicial.anteriorNo = addNo;
			noInicial = addNo;
		}
		contador++;
	}
	
	
	
	public void add(int posicao, No addNo) {
		if(posicao >= 0 && posicao <= contador) {
			if(posicao == 0) {
				this.addInicio(addNo);
			} else if (posicao == contador) {
				this.addFim(addNo);
			} else {
				No noAux = noInicial;
				for(int i = 0; i < posicao; i++) {
					noAux = noAux.proximoNo;
				}
												
				addNo.proximoNo = noAux;
				addNo.anteriorNo = noAux.anteriorNo;
				noAux.anteriorNo.proximoNo = addNo;
				noAux.anteriorNo = addNo;
				
				contador++;
			}
		}
	}
	
	public int removerFinal() {
		if(contador == 1) {
			No noRemover = noInicial;
			noInicial = null;
			contador--;
			return noRemover.valor;
		} else {
			No noRemover = noInicial.anteriorNo; 
			noInicial.anteriorNo.anteriorNo.proximoNo = noInicial;
			noInicial.anteriorNo = noInicial.anteriorNo.anteriorNo;
			contador--;
			return noRemover.valor;
		}
	}
	
	public int removerInicio() {
		No noRemover = noInicial; 
		if(contador == 1) {
			noInicial = null;
		} else {
			noInicial.anteriorNo.proximoNo = noInicial.proximoNo;
			noInicial.proximoNo.anteriorNo = noInicial.anteriorNo;
			noInicial = noInicial.proximoNo;
		}
		contador--;
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
					for(int i = 0; i < posicao; i++) {
						noAux = noAux.proximoNo;
					}			
					noAux.proximoNo.anteriorNo = noAux.anteriorNo;
					noAux.anteriorNo.proximoNo = noAux.proximoNo;
					contador--;
				return noAux.valor;
			}
		} 
		else 
			return 666;
	}

}
