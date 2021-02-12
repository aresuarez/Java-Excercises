package ej2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

//Este es el ejercicio 3.
public class Main {

	public static void main(String[] args) {
		
		ArrayList <Integer> array = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique cuantos numeros quiere introducir: ");
		int cant = sc.nextInt();
		int num;
		for (int i = 0; i<cant;i++) {
			System.out.printf("Introduce el numero %d",i+1);
			num = sc.nextInt();
			array.add(num);
		}
		int count = 0;
		int acc = 0;
		Iterator <Integer> it = array.iterator();
		while (it.hasNext()) {
			acc += array.get(count);
			System.out.printf("El numero %d", count+1 );
			if (count < cant-1) {
			System.out.print(" + ");count++;} else {
			System.out.printf(" = %d",acc);
			break;}
		} 
		sc.close();
		
	}

}
