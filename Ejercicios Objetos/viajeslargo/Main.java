package viajeslargo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime el numero de horas del viaje1");
		double horas = scan.nextDouble();
		scan.nextLine();
		System.out.println("Dime la distancia del viaje1");
		double distancia = scan.nextDouble();
		Viaje viaje1 = new Viaje(distancia, horas);
		double v1 = viaje1.distancia / viaje1.horas;
		System.out.println("Dime el numero de horas del viaje2");
		horas = scan.nextDouble();
		scan.nextLine();
		System.out.println("Dime la distancia del viaje2");
		distancia = scan.nextDouble();
		Viaje viaje2 = new Viaje(distancia, horas);
		double v2 = viaje2.distancia / viaje2.horas;
		if(v1 > v2) {
			System.out.println("v1 es mas rapido.");
		} else System.out.println("v2 es mas rapido.");
		v1 = viaje1.calcularVelocidad(viaje1.distancia,viaje1.horas);
		v2 = viaje2.calcularVelocidad(viaje2.distancia,viaje2.horas);
		if(v1 > v2) {
			System.out.println("v1 es mas rapido.");
		} else System.out.println("v2 es mas rapido.");
	}
		
}
