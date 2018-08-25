package questao1;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.addFim(5);
		lista.addFim(-10);
		lista.addPosicao(20, 0);
		lista.addInicio(99);
		
		lista.imprimir();
		
		System.out.println(lista.buscar(99));
		
		lista.alterar(54, 0);
		lista.imprimir();
		
		System.out.println(lista.getAux());
	}

}
