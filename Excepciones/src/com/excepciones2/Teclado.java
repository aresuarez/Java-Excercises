package com.excepciones2;

import java.util.Scanner;

public class Teclado {
	
	public void leeEntero() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
		try {
			System.out.println("Introduce un numero entero: ");
			int entero = Integer.parseInt(sc.next());
			System.out.println(entero);
			i = 1;
		}catch(NumberFormatException e) {
			System.out.println(0);
			System.out.println("Debes introducir un numero entero.");
		}catch(Exception e) {
			System.out.println(0);
			System.out.println("He cazado otra excepcion.");
		}
		}while (i == 0);
		sc.close();
	}
}
