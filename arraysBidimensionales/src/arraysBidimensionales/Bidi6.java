package arraysBidimensionales;

import java.util.Scanner;

public class Bidi6 {
	public static void read(int array[][],int array2[][],int array3[][]) {
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length;j++) {
				System.out.println("Valor array 1{ "+ array[i][j] + " }valor array 2{ "+ array2[i][j] + " }es igual a: " + array3[i][j]+".");
		}}}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Inserte el tamanyo de la matriz: ");
	System.out.println("Inserte el numero de filas: ");
	int f = scan.nextInt();
	System.out.println("Inserte el tamanyo de columnas: ");
	int c = scan.nextInt();
	int i,j;
	int array [][]= new int [f][c];
	int array2 [][] = new int [f][c];
	int array3 [][] = new int [f][c];
	for (i=0;i<array.length;i++) {
		for (j=0;j<array.length;j++) {
			System.out.println("Inserta un numero para el primer array:");
			array[i][j]=scan.nextInt();
			System.out.println("Inserta un numero para el segundo array:");
			array2[i][j]=scan.nextInt();
			array3[i][j]= array[i][j] + array2[i][j];
	}}
	read(array,array2,array3);
	}
}
