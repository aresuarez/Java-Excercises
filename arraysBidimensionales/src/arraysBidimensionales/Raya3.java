package arraysBidimensionales;
import java.lang.Math;
import java.util.Scanner;

public class Raya3 {
	public static void read(int array[][]) {
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(array[i][j]);
		}}}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String array [][]= new String [3][3];
	int i,j;
	for (i=0;i<array.length;i++) {
		for (j=0;j<2;j++) {
			array[i][j]=(int)(Math.random()*9+0);
	}}
	read(array);
	}
}