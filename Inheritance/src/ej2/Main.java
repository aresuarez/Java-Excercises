package ej2;

public class Main {

	public static void main(String[] args) {
		
		Programador xiang = new Programador("Xiang","213213", 23, false, 123.42, 999, "Java");
		Empleado pepe = new Empleado("Pepe","213213", 38, true, 1223.42);
		Programador yhael = new Programador("Yhael","2554213", 21, false, 23123.42, 999, "MySQL");
		System.out.println(xiang.toString());
		System.out.println(pepe.toString());
		System.out.println(yhael.toString());

	}

}
