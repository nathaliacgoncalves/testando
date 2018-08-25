package questao8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		ContaBancaria pessoa5 = new ContaBancaria	("Madalena", 3, "eeee");
		ContaBancaria pessoa6 = new ContaBancaria	("Eva", 2, "ffff");
	
		Lista lista = new Lista();
		
		lista.cadastrarConta("Maria", 5, "aaaa");
		lista.cadastrarConta("Isabel", 4, "bbbb");
		lista.cadastrarConta("Rute", 6, "cccc");
		lista.cadastrarConta("Dalila",1, "dddd");
		
		lista.visualizarContas();
		
		lista.remover(4);
		
		lista.visualizarContas();
	
		lista.depositar(1, "dddd", 34);
		lista.sacar(1, "dddd", 11);
		lista.visualizarContas();
		
		lista.saldo(1, "dddd");
		
/*		System.out.println("removendo: " + lista.remover(1));	
		
		System.out.print("imprimindo: ");
		lista.imprimir();
		System.out.println(" ");
		
		System.out.println("buscando: " + lista.buscar(1));
		
		
		System.out.println("removendo: " + lista.remover(0));
		
		
		System.out.print("imprimindo: ");
		lista.imprimir();
		System.out.println(" ");
			
	    
	    System.out.print("adicionando: ");
	    lista.add(0, no5);	    
	    lista.imprimir(); 
	    System.out.println(" ");
		
		
		System.out.println("alterando: " + lista.alterar(1, pessoa5));
		
		
		System.out.print("imprimindo: ");
		lista.imprimir();
		System.out.println(" ");
*/	
	}

}
