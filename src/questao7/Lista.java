package questao7;

public class Lista {
	private No noInicial;
	private No noFinal;
	private int contador;
		
	public void imprimir() {
		No noAux = noInicial;
		for (int i = 0; i < contador; i++) {
			System.out.print(noAux.conta.toString());
			noAux = noAux.proximoNo;
		}	
	}
	
	public void addInicio(No addNo) {
		if(contador == 0) {
			noInicial = addNo;
			noFinal = addNo;
		} else {
			addNo.proximoNo = noInicial;
			noInicial.anteriorNo = addNo;
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
			addNo.anteriorNo = noFinal;
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
				for(int i = 0; i < posicao; i++) {
					noAux = noAux.proximoNo;
				}
								
				addNo.proximoNo = noAux.proximoNo;
				noAux.proximoNo.anteriorNo = addNo;
				addNo.anteriorNo = noAux;
				noAux.proximoNo = addNo;
				
				contador++;
			}
		}
	}
	
	public String buscar(int posicao) {
		No noAux = noInicial;
		int buscador = 0;
		while (buscador != posicao) {
			noAux = noAux.proximoNo;
			buscador++;
		}
		
		return noAux.conta.toString();		
	}

	public String removerInicio() {
		No noRemover = noInicial; 
		if(contador == 1) {
			noInicial = null;
			noFinal = null;
			contador--;
		} else {
			noInicial.proximoNo.anteriorNo = null;
			noInicial = noInicial.proximoNo;
			contador--;
		}
		
		return noRemover.conta.toString();
	}

	public String removerFinal() {
		No noRemover = noFinal; 
		if(contador == 1) {
			noInicial = null;
			noFinal = null;
			contador--;
		} else {
			noFinal = noFinal.anteriorNo;
			noFinal.proximoNo = null;
			contador--;
		}
		
		return noRemover.conta.toString();
	}

	public String remover(int posicao) {
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
				return noAux.conta.toString();
			}
		} else {
			return "indisponivel";
		}
	}

	
	public String alterar(int posicao, ContaBancaria alterarPessoa) {
		No noAux = noInicial;
		if(posicao >= 0 && posicao <= contador) {
			for (int i = 0; i < posicao; i++) {
				noAux = noAux.proximoNo;
			}
			
			ContaBancaria pessoaAlterada = noAux.conta;
			noAux.conta = alterarPessoa;
			return pessoaAlterada.toString();
		} else {
			return "indisponivel";
		}

	}
}
