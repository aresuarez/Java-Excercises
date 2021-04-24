package ej1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList <Anotador> list = new LinkedList<Anotador>();
		int n = 0;
		do {
			System.out.println("Hola.Presiona el boton para la opcion que desees:"
					+ "\n1.Introducir datos. "
					+ "\n2.Consulta de los datos de todos los jugadores a partir del nombre."
					+ "\n3.Consulta de jugador por provincia."
					+ "\n4.Modificación de las canastas introducidas por un jugador."
					+ "\n5.Borrado del jugador con determinado rango de canastas introducidas."
					+ "\n6.Borrado toda la colección. "
					+ "\n**Usa cualquier otro numero para salir**");
			int option = sc.nextInt();
			sc.nextLine();
			switch (option)	{
			case 1: 
				System.out.println("Introduce nombre:");
				String name = sc.next();
				System.out.println("Introduce edad:");
				int age = sc.nextInt();
				System.out.println("Introduce nombreEquipo:");
				String nameTeam = sc.next();
				System.out.println("Introduce numCanastasIntroducidas:");
				int numCan = sc.nextInt();
				System.out.println("Introduce ciudad:");
				String city = sc.next();
				list.add(new Anotador(name,age,nameTeam,numCan,city));
				
				break;
			case 2:
				System.out.println("Introduce nombre:");
				name = sc.next();
				for(int i = 0; i<list.size(); i++) {
					if(list.get(i).getNombre().equalsIgnoreCase(name)) {
						System.out.println(list.get(i).toString());
					}}
				break;
			case 3:
				System.out.println("Introduce provincia:");
				String provin = sc.next();
				for(int i = 0; i<list.size(); i++) {
					if(list.get(i).getCiudad().equalsIgnoreCase(provin)) {
						System.out.println(list.get(i).toString());
					}}
				break;
			case 4:
				System.out.println("Introduce nombre de quien cambiar el num de canastas:");
				name = sc.next();
				System.out.println("Introduce el numero de canastas");
				int numCanas = sc.nextInt();
				sc.nextLine();
				for(int i = 0; i<list.size(); i++) {
					if(list.get(i).getNombre().equalsIgnoreCase(name)) {
						list.get(i).setNumCanastasIntroducidas(numCanas);
					}}
				break;
			case 5:
				System.out.println("Introduce rango por lo bajo:");
				int rangLow = sc.nextInt();
				System.out.println("Introduce rango por lo alto:");
				int rangTop = sc.nextInt();
				for(int i = 0; i<list.size(); i++) {
					if(list.get(i).getNumCanastasIntroducidas() < rangTop && list.get(i).getNumCanastasIntroducidas() > rangLow) {
						list.remove(i);
					}}
				
				break;
			case 6:
				System.out.println("Borrando la coleccion.");
				list.removeAll(list);
				break;
			default:
				n=1;
				break;
			}
		} while (n!=1);
		sc.close();
	}

}
