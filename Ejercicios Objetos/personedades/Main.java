package personedades;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca nombre, direccion y edad de la persona 1: ");
		Scanner scan = new Scanner(System.in);
		String nom1 = scan.nextLine();
		String dir1 = scan.nextLine();
		//parseo o uso de scan.nextLine despues de leer un int.
		int ed1 = Integer.parseInt(scan.nextLine());
		System.out.println("Introduzca nombre, direccion y edad de la persona 2: ");
		String nom2 = scan.nextLine();
		String dire2 = scan.nextLine();
		int ed2 = Integer.parseInt(scan.nextLine());
		Persona p1 = new Persona(nom1,dir1,ed1);
		Persona p2 = new Persona(nom2,dire2,ed2);
		p1.getEdad();
		p2.getEdad();
		System.out.println(p1.esMayorEdad());
		p1.mayordeEdad();
		System.out.println(p2.esMayorEdad());
		p2.mayordeEdad();
		p1.cualMayor(p2);
		scan.close();
	}

}
