package arraysParalelos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array1 = new String[6];
		int[][] array2 = new int[2][6];
		double [] array3 = new double[6];
		
		for (int i = 0;i<array1.length;i++) {
			System.out.printf("Introduce el nombre del alumno %d",i);
			array1[i] = sc.next();
			System.out.println("Introduce la nota de programacion");
			array2[0][i] = sc.nextInt();
			System.out.println("Introduce la nota de bases de datos");
			array2[1][i] = sc.nextInt();	
			array3[i] = (array2[0][i] + array2[1][i])/2;
		   
		}sc.close();
		 for (int i = 0;i<array3.length;i++) {
		    	System.out.println(array3[i]);
		    }
	}
	

}
