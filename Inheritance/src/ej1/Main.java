package ej1;

public class Main {

	public static void main(String[] args) {
		Empleado rafa = new Empleado("Rafa");
		Directivo Mario = new Directivo("Mario");
		Operario Alfonso = new Operario("Alfonso");
		Oficial Luis = new Oficial("Luis");
		Tecnico Pablo = new Tecnico("Pablo");
		
		System.out.println(rafa.toString());
		System.out.println(Mario.toString());
		System.out.println(Alfonso.toString());
		System.out.println(Luis.toString());
		System.out.println(Pablo.toString());

	}

}
