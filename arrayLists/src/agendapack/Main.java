package agendapack;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String nm;
		int tel;
		Agenda book = new Agenda();
		Scanner sc = new Scanner(System.in);
		int quit = 0;
		Persona ps = new Persona();
		do {
		System.out.println("Elige una opcion: 1-Insertar libro, 2-Borrar un libro,3-Buscar,4- Mostrar los libros.,?- Cualquier otro boton salir.");
		int option = sc.nextInt();
		switch(option) {
		case 1: System.out.println("Dime el nombre de la persona a introducir ");
				nm = sc.next();
				System.out.println("Dime un numero de tlf.");
				tel = sc.nextInt();
				Persona p = new Persona(nm,tel);
				book.add(p);
				break;
		case 2: System.out.println("Dime un nombre a borrar."); 
					nm = sc.next();
					ps.setName(nm);
					book.remove(ps);
					break;
			case 3:System.out.println("Dime un nombre a buscar."); 
						nm = sc.next();
						ps.setName(nm);
						book.search(ps);
						break;
				case 4: book.mostrar();
						break;
					default: 
						System.out.println("Adios.");
					quit = 1;
		}} while (quit==0);
		sc.close();
	}

}
