package questao5;


public class Lista {
	private No noInicial;
	private No noFinal;
	private int contador;
		
	public void imprimir() {
		No noAux = noInicial;
		for (int i = 0; i < contador; i++) {
			System.out.print(noAux.atributo.toString());
			noAux = noAux.proximoNo;
		}	
	}

	
	public void addInicio(No addNo) {
			if(contador == 0) {
				noInicial = addNo;
				noFinal = addNo;
			} else {
				addNo.proximoNo = noInicial;
				noInicial = addNo;
			}
			contador++;
	}
	
	public void addFim(No addNo) {
			if(contador == 0) {
				noInicial = addNo;
				noFinal = addNo;
			} else {
				noFinal.proximoNo = addNo;
				noFinal = addNo;
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
					for(int i = 0; i < posicao-1; i++) {
						noAux = noAux.proximoNo;
					}
					addNo.proximoNo = noAux.proximoNo;
					noAux.proximoNo = addNo;
					contador++;
			}
		}
	}

	public String removerInicio() {
		No noRemover = noInicial; 
		if(contador == 1) {
			noInicial = null;
			noFinal = null;
			contador--;
		} else {
			noInicial = noInicial.proximoNo;
			contador--;
		}
		
		return noRemover.atributo.toString();
	}

	public String removerFinal() {
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
		
		return noRemover.atributo.toString();
	}

	public String remover(int posicao) {
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
				return noRemover.atributo.toString();
			}
		} else {
			return "indisponivel";
		}
	}

	public int getContador() {
		return contador;
	}
	
	private No buscarNo(int posicao) {
		No noAux = noInicial;
		int buscador = 0;
		while (buscador != posicao) {
			noAux = noAux.proximoNo;
			buscador++;
		}
		
		return noAux;		
	}

	
	public Lista buscar(int valor) {
		Lista buscar = new Lista();
		if(contador > 0) {
			No noAux = noInicial;
			for(int i = 0; i< contador; i++) {
				if(noAux.atributo.valor == valor) {
					buscar.addFim(noAux);
				}
				noAux = noAux.proximoNo;
			} 
			return buscar;
		} else {
			return null;
		}
	}
	
	public void removerNegativos() {
		No noAux = noInicial;
		for(int i = 0; i < contador; i++) {
			if(noAux.atributo.valor < 0) {
				this.remover(i);
				i--;
			}
			noAux = noAux.proximoNo;
		}
	}
}
