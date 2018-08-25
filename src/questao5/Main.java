package questao5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atributo atributo1 = new Atributo(-1, false);
		Atributo atributo2 = new Atributo(15, true);
		Atributo atributo3 = new Atributo(99, true);
		Atributo atributo4 = new Atributo(-1, false);
		
		No no1 = new No	(atributo1);
		No no2 = new No	(atributo2);
		No no3 = new No	(atributo3);
		No no4 = new No	(atributo4);
		

		
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
		
		System.out.print("procurando: ");
		lista.buscar(-1).imprimir();
		System.out.println(" ");
		
		System.out.print("removendo negativos: ");
		lista.removerNegativos();
		lista.imprimir();
	}

}
