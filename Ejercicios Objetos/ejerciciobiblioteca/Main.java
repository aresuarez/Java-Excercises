package ejerciciobiblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		long isbn;
		String titulo, nombre, apellidos, nacionalidad;
		int pags, dni, edad;
		do{
		System.out.println("1. Insertar un libro");
		System.out.println("2. Eliminar un libro");
		System.out.println("3. Buscar un libro");
		System.out.println("4. Mostrar todos los libros");
		System.out.println("0. Salir de la aplicación");
		System.out.print("Elige opción: ");
		opcion = sc.nextInt();
		sc.nextLine(); //limpiamos el buffer
		switch(opcion){
		case 1:
		
		System.out.println("Inserta el ISBN:");
		isbn = sc.nextLong();
		System.out.println("Inserta el titulo:");
		titulo = sc.next();
		System.out.println("Inserta el dni: ");
		dni = sc.nextInt();
		sc.nextLine();
		System.out.println("Inserta el autor:");
		System.out.println("Inserta el nombre: ");
		nombre = sc.nextLine();
		System.out.println("Inserta los apellidos: ");
		apellidos = sc.nextLine();
		System.out.println("Inserta la edad");
		edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Inserta la nacionalidad: ");
		nacionalidad = sc.nextLine();
		System.out.println("Inserta las paginas:");
		pags = sc.nextInt();
		Persona p = new Persona(dni,nombre,apellidos,edad,nacionalidad);
		Libro libro = new Libro(isbn,titulo,p,pags);
		biblioteca.insertar(libro);
		//* Insertar los datos anteriormente
		/*tecleados en el libro de modo que habrá que
		decir SI EL LIBRO SE HA INSERTADO
		CORRECTAMENTE o no en cuyo caso lo
		normal es que este la biblioteca LLENA y
		no se haya podido meter mas libros.*/
		break;
		case 2:
			System.out.println("Inserta el ISBN del libro que quieras eliminar.");
			isbn = sc.nextLong();
			biblioteca.eliminar(isbn);
		break;
		/* Dado un ISBN (que habrá que leer por
		teclado), buscar dicho libro de la biblioteca.
		Puede suceder de que ese libro no esté con
		lo cual habría que decir que dicho libro NO
		ESTA EN LA BIBLIOTECA.*/
		case 3:
		System.out.println("Inserta un ISBN:");
		isbn = sc.nextLong();
		biblioteca.buscar(isbn);
		break;
		case 4:
		//* Mostrar todos los libros de la biblioteca
			biblioteca.toString();
		break;
		case 0:
		System.out.println("Gracias por usar mi biblioteca");
		 break;
		default:
		System.out.println("Opción incorrecta");
		}
		}while(opcion != 0);
		sc.close();
	}
	
}
