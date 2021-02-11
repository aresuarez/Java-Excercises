package arraysBidimensionales;
import java.lang.Math;
import java.util.Scanner;

public class Bidi4 {
	public static void read(int array[][]) {
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length;j++) {
				System.out.println(array[i][j]);
		}}}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Inserte el tamanyo de la matriz: ");
	System.out.println("Inserte el numero de filas: ");
	int i = scan.nextInt();
	System.out.println("Inserte el tamanyo de columnas: ");
	int j = scan.nextInt();
	int array [][]= new int [i][j];
	for (i=0;i<array.length;i++) {
		for (j=0;j<array.length;j++) {
			System.out.println("Inserta un numero:");
			array[i][j]=(int)(Math.random()*9+0);
	}}
	read(array);
	}
}
