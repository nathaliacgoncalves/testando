package questao8;

public class Lista {
	private No noInicial;
	private No noFinal;
	private int contador;
		
	public void visualizarContas() {
		No noAux = noInicial;
		for (int i = 0; i < contador; i++) {
			System.out.print(noAux.conta.toString());
			noAux = noAux.proximoNo;
		}	
		System.out.println(" ");
	}
	
	public void cadastrarConta(String nome, int numero, String senha) {
		ContaBancaria novaConta = new ContaBancaria(nome, numero, senha);
		No addNo = new No(novaConta);
		this.add(addNo);
	}
	
	private void addInicio(No addNo) {
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
	
	private void addFim(No addNo) {
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
	
	
	private void add(No addNo) {
		if(contador == 0) {
			noInicial = addNo;
			noFinal = addNo;
			contador++;
		} else {
			if(addNo.conta.numero < noInicial.conta.numero) {
				this.addInicio(addNo);
			} else if (addNo.conta.numero > noFinal.conta.numero) {
				this.addFim(addNo);
			} else {
				No noAux = noInicial;
				while(noAux.proximoNo.conta.numero < addNo.conta.numero) {
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

	
	private String removerInicio() {
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

	private String removerFinal() {
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

	private String removerPosicao(int posicao) {
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
	
	public void remover(int numero) {
		if(contador > 0) {
			No noAux = noInicial;
			for(int i = 0; i < contador; i ++) {
				if(noAux.conta.numero == numero) {
					this.removerPosicao(i);
				}
				noAux = noAux.proximoNo;
			}
		}
	}
	

	public void depositar(int numero, String senha, double valor) {
		No noAux = noInicial;
		while(noAux.conta.numero != numero) {
			noAux = noAux.proximoNo;
		}
		
		if(noAux.conta.senha == senha) {
			noAux.conta.saldo = noAux.conta.saldo + valor;
		}
	}
	
	public void sacar(int numero, String senha, double valor) {
		No noAux = noInicial;
		while(noAux.conta.numero != numero) {
			noAux = noAux.proximoNo;
		}
		
		if(noAux.conta.senha == senha) {
			noAux.conta.saldo = noAux.conta.saldo - valor;
		}
	}
	
	public void saldo(int numero, String senha) {
		No noAux = noInicial;
		while(noAux.conta.numero != numero) {
			noAux = noAux.proximoNo;
		}
		
		if(noAux.conta.senha == senha) {
			System.out.println(noAux.conta.saldo); 
		}
	}
}
