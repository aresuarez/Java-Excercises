package arrayej1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		double salary;
		double mayor = 0;
		Operario[]array = new Operario[5];
		Operario operarioMayor = new Operario(); 
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i<array.length;i++) {
			System.out.println("Inserta el nombre del operario: ");
			name = scan.next();
			scan.nextLine();
			System.out.println("Inserta el sueldo del operario: ");
			salary = scan.nextDouble();
			Operario operario = new Operario(name,salary);
			array[i] = operario;
			if (array[i].getSueldo() > mayor) {
				mayor = array[i].getSueldo();
				operarioMayor = operario;
			} 
		}
		System.out.println("El nombre del operario que mas gana y su sueldo es: " + operarioMayor.toString());
	}
}
