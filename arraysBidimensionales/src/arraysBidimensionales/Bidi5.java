package arraysBidimensionales;
import java.lang.Math;
import java.util.Scanner;

public class Bidi5 {
	public static void read(int array[][]) {
		for (int i=0;i<array.length;i++) {
			//quiero usar j<array.length pero da out of bounds.
			for (int j=0;j<2;j++) {
				System.out.println(array[i][j]);
		}}}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Inserte el tamanyo de la matriz: ");
	System.out.println("Inserte el tamanyo de columnas: ");
	// Porque da error con array.length si solo uso 2 en la columna.
	int j = scan.nextInt();
	int i;
	int array [][]= new int [4][2];
	for (i=0;i<array.length;i++) {
		//quiero usar j<array.length pero da out of bounds.
		for (j=0;j<2;j++) {
			array[i][j]=(int)(Math.random()*9+0);
	}}
	read(array);
	}
}