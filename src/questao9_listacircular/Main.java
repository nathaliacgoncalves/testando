package questao9_listacircular;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		No no1 = new No(1);
		No no2 = new No(2);
		No no3 = new No(3);
		No no4 = new No(4);
		No no5 = new No(5);
		No no6 = new No(6);
		No no7 = new No(7);
		
		
		Lista lista = new Lista();
		lista.addFim(no1);
		lista.addFim(no2);
		lista.addFim(no3);
		lista.addFim(no4);
		
		lista.imprimir();
		
		lista.addInicio(no5);
		lista.addInicio(no6);
		
		lista.imprimir();
		
		lista.add(3, no7);
		lista.imprimir();
		
		System.out.println(lista.removerFinal());
		lista.imprimir();
		
		System.out.println(lista.removerInicio());
		lista.imprimir();
		
		System.out.println(lista.remover(2));
		lista.imprimir();
		

	}

}
