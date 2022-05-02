package pruebas;

public class Calculadora {
    private int num1;
    private int num2;

   public Calculadora(int a, int b) {
       num1 = a;
       num2 = b;
   }
   public static int suma(int num1, int num2) {
       int resul = num1 + num2;
       return resul;
   }
   public static int resta(int num1, int num2) {
       int resul = num1 - num2;
       return resul;
   }
   public static int multiplica(int num1, int num2) {
       int resul = num1 * num2;
       return resul;
   }
   public static int divide(int num1, int num2) {
       int resul = num1 / num2;
       return resul;
   }
	}


