package questao7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ContaBancaria pessoa1 = new ContaBancaria	("Maria", 1, 0);
		ContaBancaria pessoa2 = new ContaBancaria	("Isabel", 2,0);
		ContaBancaria pessoa3 = new ContaBancaria	("Rute", 3,0);
		ContaBancaria pessoa4 = new ContaBancaria	("Dalila",4,0 );
		ContaBancaria pessoa5 = new ContaBancaria	("Madalena", 5,0);
		ContaBancaria pessoa6 = new ContaBancaria	("Eva", 6,0);
		
		No no1 = new No	(pessoa1);
		No no2 = new No	(pessoa2);
		No no3 = new No	(pessoa3);
		No no4 = new No	(pessoa4);
		No no5 = new No	(pessoa6);
		
		Lista lista = new Lista();
		
		System.out.print("adicionando: ");
		lista.addInicio(no1);
		lista.imprimir();
		System.out.println(" ");
		
		System.out.print("adicionando: ");
		lista.addFim(no2);
		lista.imprimir();
		System.out.println(" ");
		
		System.out.print("adicionando: ");
		lista.add(2, no3);
		lista.imprimir();
		System.out.println(" ");
		
		System.out.print("adicionando: ");
		lista.add(0, no4);
		lista.imprimir();
		System.out.println(" ");
		
		System.out.println("removendo: " + lista.remover(1));	
		
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
	
	}

}
