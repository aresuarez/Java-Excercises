package cuentas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta acc1 = new Cuenta();
		Cuenta acc2 = new Cuenta(12.5);
		
		System.out.println("El saldo de la cuenta a es:"+acc1.getSaldo());
		System.out.println("El saldo de la cuenta b es:"+acc2.getSaldo());
		acc1.ingreso(2.3);
		acc2.reintegro(3.5);
		acc2.reintegro(3.5);
		System.out.println("El saldo de la cuenta a es:"+acc1.getSaldo());
		System.out.println("El saldo de la cuenta b es:"+acc2.getSaldo());
	}

}
