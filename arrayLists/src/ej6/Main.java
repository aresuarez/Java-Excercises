package ej6;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
public static ArrayList<Integer> leerNumeros(){
	int n = 0;
	int j;
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> arrayo = new ArrayList<Integer>(); 
	while(n != -99) {
	System.out.println("Introduce un numero entero. Para parar introduce el valor -99.");
	j = sc.nextInt();
	if (j == -99) {
		n = -99;
	}else
	arrayo.add(j);
	
	} sc.close();
	System.out.printf("Valores introducidos:"); 
	for (Integer pos: arrayo) {
	System.out.printf(" %d ",pos);}
	return arrayo;
	
	}
	
	
public static double calcularSuma(ArrayList<Integer> x) {
	Iterator<Integer> it = x.iterator();
	double acc = 0;
	while (it.hasNext()) {
		//INTVALUE IMPORTANTE.
		acc += it.next().intValue();
	}
	return acc;
	
} 
public static void results(ArrayList<Integer> array, double suma, double media) {
	//2 decimal places.
	System.out.printf("[Suma: %.2f]",suma);
	System.out.printf("[Media: %.2f]",media);
	int acc = 0;
	for (int i = 0; i<array.size();i++) {
		if (array.get(i) > media ) {
			acc++;
		}
	}
	System.out.printf(" %d valores superiores a la media.",acc);
}
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		//ArrayList<Integer> array = leerNumeros();??????????
		array = leerNumeros();
		double suma = calcularSuma(array);
		double media = suma / array.size();
		results(array,suma,media);
		
	}

}
