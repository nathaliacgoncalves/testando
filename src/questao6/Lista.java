package questao6;

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
	
	public void addInicio(No addNo) {
		if(contador == 0) {
			noInicial = addNo;
			noFinal = addNo;
			contador++;
		} else {
			No noAux = noInicial;
			int aux = 0;
			for(int i = 0; i < contador; i++) {
				if(noAux.valor == addNo.valor) {
					aux = aux + 1;
				}
				noAux = noAux.proximoNo;
			}
			
			if(aux == 0) {			
				addNo.proximoNo = noInicial;
				noInicial = addNo;
				contador++;
			} else 
				System.out.println("indisponivel");
		}
		
	}
	
	public void addFim(No addNo) {
		if(contador == 0) {
			noInicial = addNo;
			noFinal = addNo;
			contador++;
		} else {
			No noAux = noInicial;
			int aux = 0;
			for(int i = 0; i < contador; i++) {
				if(noAux.valor == addNo.valor) {
					aux = aux + 1;
				}
				noAux = noAux.proximoNo;
			}
			
			if(aux == 0) {			
				noFinal.proximoNo = addNo;
				noFinal = addNo;
				contador++;
			} else 
				System.out.println("indisponivel");
		}
		
	
	}
	
	public void add(int posicao, No addNo) {
		if(posicao >= 0 && posicao <= contador) {
			if(posicao == 0) {
				this.addInicio(addNo);
			} else if (posicao == contador) {
				this.addFim(addNo);
			} else {		
				No noAux = noInicial;
				int aux = 0;
				for(int i = 0; i < contador; i++) {
					if(noAux.valor == addNo.valor) {
						aux = aux + 1;
					}
					noAux = noAux.proximoNo;
				}
				
				if(aux == 0) {			
					addNo.proximoNo = noAux.proximoNo;
					noAux.proximoNo = addNo;
					contador++;
				} else 
					System.out.println("indisponivel");
				
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
