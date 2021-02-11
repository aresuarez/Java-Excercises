package ejerciciohoras;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce horas");
		int horas = scan.nextInt();
		System.out.println("Introduce minutos");
		int minutos = scan.nextInt();
		System.out.println("Introduce segundos");
		int segundos = scan.nextInt();
		Hora hora = new Hora();
		hora.setHoras(horas);
		hora.setMinutos(minutos);
		hora.setSegundos(segundos);
		System.out.println(hora.toString());
	
	}
}
