
public class Ej1{
	public static void main (String args[]){
		try {
		int i = 0;String cadenas[] = {"Cadena 1","Cadena 2","Cadena 3","Cadena 4"};
	for (i=0; i<=4; i++) System.out.println(cadenas[i]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array fuera de rango.");
	}	
	
	}}
