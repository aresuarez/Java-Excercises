package stringBuffer;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i = 0;
do { 
	System.out.println("Selecciona un metodo de StringBuffer que quieras ver:\n 1- Metodo append() \n 2- Metodo capacity \n 3- Metodo charAt \n 4- Metodo reverse \n 5- Exit");
	int option = sc.nextInt();
	StringBuffer buffer = new StringBuffer("Hola que tal");

switch(option) {
case 1:
	System.out.println("Metodo append, anadimos 5 al String.");
	buffer.append(5);
	System.out.println(buffer.toString());
	break;
	case 2:
		System.out.println("Metodo capacity, vemos que capacidad tiene este String.");
		System.out.println(buffer.capacity());
		break;
		case 3:
			System.out.println("Metodo charAt, vemos el char que esta en la posicion 3, deberia ser a.");
			System.out.println(buffer.charAt(3));
			break;
			case 4:
				System.out.println("Metodo reverse, le damos la vuelta al String.");
				System.out.println(buffer.reverse());
				break;
				case 5:
					System.out.println("Hasta luego!");
					 i = 2;
					break;
} 
} while(i!=2);
	sc.close();
}}
