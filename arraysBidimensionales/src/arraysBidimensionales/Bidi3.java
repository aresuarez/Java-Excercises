package arraysBidimensionales;

import java.util.Scanner;

public class Bidi3 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	System.out.println("Inserte el tamanyo de la matriz: ");
	System.out.println("Inserte el numero de filas: ");
	int i = scan.nextInt();
	System.out.println("Inserte el tamanyo de columnas: ");
	int j = scan.nextInt();
	int array [][]= new int [i][j];
	for (i=0;i<array.length;i++) {
		for (j=0;j<array.length;j++) {
			System.out.println("Inserta un numero:");
			array[i][j]=scan.nextInt();
			if (j==0){
				sum += array [i][j];
			}
	}}
	System.out.printf("La suma de los numeros de la primera columna es: %d",sum);
	}
}
