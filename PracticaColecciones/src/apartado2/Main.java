package apartado2;

public class Main {

	public static void main(String[] args) {
		Pila pila = new Pila();
		Cola cola = new Cola();
		System.out.println("Pila");
		System.out.println("---------");
		pila.rellenar(pila);
		pila.imprimirYVaciar(pila);
		System.out.println("Cola");
		System.out.println("---------");
		cola.rellenar(cola);
		cola.imprimirYVaciar(cola);
}
}