package questao3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		No no1 = new No	(7);
		No no2 = new No	(15);
		No no3 = new No	(99);
		No no4 = new No	(-1);

		
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
		
		System.out.print("imprimindo invertido: ");
		lista.imprimirInvertido();
		System.out.println(" ");
		
		System.out.println("removendo: " + lista.removerFinal());
		
		
		System.out.print("imprimindo: ");
		lista.imprimir();
		System.out.println(" ");
		
	
		System.out.println("removendo: " + lista.removerInicio());
		
		
		System.out.print("imprimindo: ");
		lista.imprimir();
		System.out.println(" ");
	}

}
