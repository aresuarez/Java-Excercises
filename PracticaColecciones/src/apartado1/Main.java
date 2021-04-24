package apartado1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una estructura: 1-Pila, 2-Cola, 3-Salir.");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			Pila pila = new Pila();
		int i = 0;
		do {
			System.out.println("Selecciona una opción: \n1-Ver si la estructura está vacía.\n2-Extraer y eliminar el primer objeto.\n3-Mostrar el primer objeto.\n4-Anadir un objeto.\n5-Mostrar la estructura.\n6-Salir.");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				if (pila.isEmpty()) System.out.println("Estructura vacia.");
				else System.out.println("Estructura no vacía.");
				break;
			case 2:
				if (pila.isEmpty()) System.out.println("No puedes extraer de algo vacio.");
				else System.out.println(pila.extraer().toString());
				break;
			case 3: 
				if (pila.isEmpty()) System.out.println("No puedes ver nada de algo vacio.");
				else System.out.println(pila.primero().toString());
				break;
			case 4: 
				System.out.println("Anade un objeto de tipo String para probar.");
				pila.add(sc.next());
				break;
			case 5: 
				System.out.println(pila.toStringo());
				break;
			default: 
				i=1;
				break;
		}} while (i!=1);
		break;
		case 2:
			Cola cola = new Cola();
			int j = 0;
			do {
				System.out.println("Selecciona una opción: \n1-Ver si la estructura está vacía.\n2-Extraer y eliminar el primer objeto.\n3-Mostrar el primer objeto.\n4-Anadir un objeto.\n5-Mostrar la estructura.\n6-Salir.");
				int option = sc.nextInt();
				switch(option) {
				case 1:
					if (cola.isEmpty()) System.out.println("Estructura vacia.");
					else System.out.println("Estructura no vacía.");
					break;
				case 2:
					if (cola.isEmpty()) System.out.println("No puedes extraer de algo vacio.");
					else System.out.println(cola.extraer().toString());
					break;
				case 3: 
					if (cola.isEmpty()) System.out.println("No puedes ver nada de algo vacio.");
					else System.out.println(cola.primero().toString());
					break;
				case 4: 
					System.out.println("Anade un objeto de tipo String para probar.");
					cola.add(sc.next());
					break;
				case 5: 
					System.out.println(cola.toStringo());
					break;
				default: 
					j=1;
					break;
			}} while (j!=1);
			break;
	}
sc.close();
}
}