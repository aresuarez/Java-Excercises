package recursive1;
import java.util.Scanner;

public class Main {

	public static int digitalizer (int numero) {
		int result;
		if(numero<10) {
			return numero;
		}
			result = numero%10 + digitalizer(numero/10) ; 
			return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int n;
			Scanner teclado = new Scanner(System.in);

	        System.out.print("Introduzca un número: ");
	        n = teclado.nextInt();

	        if(n > 0)
	        {
	        System.out.printf("La suma de los digitos de tu numero es: %d", digitalizer(n));
	        }
	        else
	        {
	            System.out.println("ERROR: El número debe ser mayor que cero.");
	        }teclado.close();
	} 

}
