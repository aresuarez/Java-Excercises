package sumaobjetos;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Cuantas veces quieres sumar:");
		int nVeces = scan.nextInt();
		int sum;
		
		for (int i = 0; i<nVeces; i++) {
			System.out.println("Introduce el numero 1:");
			int n1 = scan.nextInt();
			System.out.println("Introduce el numero 2:");
			int n2 = scan.nextInt();
			sum = n1 + n2;
			@SuppressWarnings("deprecation")
			Integer num1 = new Integer(n1);
			Integer num2 = new Integer(n2);
			System.out.printf("Suma de numeros: %d", sum);
			Integer num3 = new Integer(num1+num2);
			System.out.println("\nValor del objeto:" + num3.intValue());
		}
		scan.close();
	}

}
