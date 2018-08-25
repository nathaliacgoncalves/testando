package questao2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		No no1 = new No	(7);
		No no2 = new No	(5);
		No no3 = new No	(99);
		No no4 = new No	(-1);
		No no5 = new No	(3);
		
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
		lista.add(1, no3);
		lista.imprimir();
		System.out.println(" ");
		
		System.out.print("adicionando: ");
		lista.add(0, no4);
		lista.imprimir();
		System.out.println(" ");
	
		System.out.print(lista.getContador());
		System.out.println("removendo: " + lista.removerFinal());
		
	
		System.out.print("imprimindo: ");
		lista.imprimir();
		System.out.println(" ");
			
	    
	    System.out.print("adicionando: ");
	    lista.add(0, no5);	    
	    lista.imprimir(); 
	    System.out.println(" ");	
		
		System.out.print("imprimindo: ");
		lista.imprimir();
		System.out.println(" ");
	
	}

}
