package com.excepciones3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int a = sc.nextInt();
		try {
			isPar(a);
		} catch (ImparException e) {
			e.printStackTrace();
		} catch (ParException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
public static void isPar(int a) throws ImparException,ParException{
	if (a%2==0) {
		throw new ParException("Numero par.");
	}else {
		throw new ImparException("Numero impar.");
	}
}
}
