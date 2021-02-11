package arrayej2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][]array= new int [3][5];
		
		for (int i = 0;i<array.length;i++ ) {
			for(int j =0; j<5;j++) {
				System.out.println("Inserta componente entero en la posicion "+i+" "+j);
				array[i][j]= scan.nextInt();
				
			}
		}
		for (int i = 0;i<array.length;i++ ) {
			for(int j =0; j<5;j++) {
				System.out.println(array[i][j]);
			}
		}
	}

}
