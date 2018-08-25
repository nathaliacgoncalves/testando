package questao4;


public class Lista {
	private No noInicial;
	private No noFinal;
	private int contador = 0;
		
	public void imprimir() {
		No noAux = noInicial;
		for (int i = 0; i < contador; i++) {
			System.out.print(noAux.valor + " ");
			noAux = noAux.proximoNo;
		}	
		
		System.out.println(" ");
	}

	
	private void addInicio(No addNo) {
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
	
	private void addFim(No addNo) {
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
	
	private void add(int posicao, No addNo) {
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
	
	public void add(No addNo) {
		if(contador == 0) {
			noInicial = addNo;
			noFinal = addNo;
			contador++;
		} else {
			if(addNo.valor <= noInicial.valor) {
				this.addInicio(addNo);
			} else if (addNo.valor >= noFinal.valor) {
				this.addFim(addNo);
			} else {
				No noAux = noInicial;
				while(noAux.proximoNo.valor < addNo.valor) {
					noAux = noAux.proximoNo;
				}
				addNo.proximoNo = noAux.proximoNo;
				noAux.proximoNo = addNo;
				contador++;
			}
		}
	}

	private int removerInicio() {
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

	private int removerFinal() {
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
	
	
	public void verificaListas(Lista lista1, Lista lista2) {
		if(lista1.contador == lista2.contador) {
			No noAux1 = lista1.noInicial;
			No noAux2 = lista2.noInicial;
			int aux = 0;
			for(int i = 0; i < lista1.contador; i++) {
				System.out.println(noAux1.valor + " e " + noAux2.valor) ;
				if(noAux1.valor == noAux2.valor) {
					aux = aux + 1;
				}
				noAux1 = noAux1.proximoNo;
				noAux2 = noAux2.proximoNo;
			} 
			if(aux == contador) {
				System.out.println("igual");
			} else {
				System.out.println("diferente");
			}
		} else {
			System.out.println("diferente");
		}
	}
}
