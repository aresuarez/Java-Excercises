package com.excepciones4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una letra: ");
		String a = sc.next();
		try {
			isVocal(Character.toLowerCase(a.charAt(0)));
		} catch (Consonante e) {
			e.printStackTrace();
		} catch (Vocal e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static void isVocal(Character a) throws Consonante,Vocal{
	//Metemos las vocales en un array de Character.
	Character[] array = {'a','i','u','e','o'};
	boolean vocalCheck = false;
	//Si a es igual a una de las vocales dentro del array lanzamos Vocal exception, sino, Consonante.
	for(Character pos:array) {
		if (a.equals(pos)) vocalCheck=true;
	}
	if (vocalCheck) { 
		throw new Vocal("Letra vocal.");
	}else {
		throw new Consonante("Letra consonante.");
	}
}
}
