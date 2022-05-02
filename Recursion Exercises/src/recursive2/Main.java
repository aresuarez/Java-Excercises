package recursive2;
import java.util.Scanner;

public class Main {

	public static int potencia (int numero,int exp) {
		int result;
		if(exp == 1) {
			return numero;
		} else
			result = numero * potencia(numero, exp-1) ;
			return result;
			
			
		
	}
	public static void main(String[] args) {

		int numero;
		int exp;
		Scanner teclado = new Scanner(System.in);

	        System.out.print("Introduzca un número: ");
	        numero = teclado.nextInt();
	        System.out.print("Introduzca un exponente: ");
	        exp = teclado.nextInt();

	        if(numero > 0)
	        {
	        System.out.printf("La potencia de tu numero es: %d ", potencia(numero,exp));
	        }
	        else
	        {
	            System.out.println("ERROR: El número debe ser mayor que cero.");
	        }
	        teclado.close();
	}

}
