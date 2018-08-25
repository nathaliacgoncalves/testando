package questao4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		No no1 = new No	(15);
		No no2 = new No	(7);
		No no3 = new No	(99);
		No no4 = new No	(10);

		No no5 = new No	(100);
		No no6 = new No	(41);
		No no7 = new No	(77);
		No no8 = new No	(1);
		
		Lista lista = new Lista();
		
		lista.add(no1);
		lista.add(no2);
		lista.add(no3);
		lista.add(no4);
		
		lista.imprimir();
		//System.out.println(lista.remover(2));
		//lista.imprimir();
		Lista coisa = new Lista();
		
		coisa.add(no1);
		coisa.add(no6);
		coisa.add(no7);
		coisa.add(no8);
		
		coisa.imprimir();
		
		lista.verificaListas(lista, coisa);
		
	/*	Lista outra = new Lista();
		
		outra.add(no5);
		outra.add(no6);
		outra.add(no7);
		outra.add(no1);
		
		outra.imprimir();
		
		System.out.println(Lista.verificarListas(lista, outra));
*/
		
	}

}
