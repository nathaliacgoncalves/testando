package questao2;

public class Lista {
	private No noInicial;
	private int contador;
		

	public int getContador() {
		return contador;
	}

	public void imprimir() {
		No noAux = noInicial;
		for (int i = 0; i < contador; i++) {
			System.out.print(noAux.valor + " ");
			noAux = noAux.proximoNo;
		}	
	}
	
	public void addInicio(No addNo) {
		if(addNo.valor >= 0) {
			if(contador == 0) {
				noInicial = addNo;
			} else {
				addNo.proximoNo = noInicial;
				noInicial = addNo;
			}
			contador++;
		} else {
			System.out.println("indisponivel");
		}
	}
	
	public void addFim(No addNo) {
		if(addNo.valor >= 0) {
			if(contador == 0) {
				noInicial = addNo;
			} else {
				No noAux = noInicial;
				for(int i = 0; i < contador - 1; i++) {
					noAux = noAux.proximoNo;
				}
				noAux.proximoNo = addNo;
			}
			contador++;
		} else {
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
				if(addNo.valor >= 0) {
					No noAux = noInicial;
					for(int i = 0; i < posicao-1; i++) {
						noAux = noAux.proximoNo;
					}
					addNo.proximoNo = noAux.proximoNo;
					noAux.proximoNo = addNo;
					contador++;
				} else {
					System.out.println("indisponivel");
				}
			}
		} else {
			System.out.println("indisponivel");
		}
	}
	
	public int removerInicio() {
		No noRemover = noInicial; 
		if(contador == 1) {
			noInicial = null;
			contador--;
		} else {
			noInicial = noInicial.proximoNo;
			contador--;
		}
		
		return noRemover.valor;
	}

	public int removerFinal() {
		No noAux = noInicial;
		if(contador == 1) {
			noInicial = null;
			contador--;
		} else {
			for(int i = 0; i < contador - 2; i++) {
				noAux = noAux.proximoNo;
			}
			No noRemover = noAux.proximoNo; 
			noAux.proximoNo = null;
			contador--;
			return noRemover.valor;
		}
		return -1;

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


}
