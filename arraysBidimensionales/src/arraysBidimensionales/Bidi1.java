package arraysBidimensionales;
import java.util.Scanner;

public class Bidi1 {
	public static void read(int array[][]) {
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length;j++) {
				System.out.println(array[i][j]);
		}}}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int j;
	int i;
	int array [][]= new int [2][2];
	for (i=0;i<array.length;i++) {
		for (j=0;j<array.length;j++) {
			System.out.println("Inserta un numero:");
			array[i][j]=scan.nextInt();
	}}
	read(array);
	}
}
