package com.excepciones;


public class Ej2 {

	public static void main(String[] args) {
		
		
		int[] array = {2,4,6};
		try {
		for(int i = 0;i<10;i++) {
			System.out.print(array[i]);
		}}catch (IndexOutOfBoundsException e) {
			System.out.println("Array fuera de rango.");
		}
	}

}
