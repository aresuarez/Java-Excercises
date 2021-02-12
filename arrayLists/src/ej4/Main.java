package ej4;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList <String> array = new ArrayList<String>();
		array.add("Escribiendo");
		array.add("en una");
		array.add("misma linea");
		array.add("cadenas");
		array.add("usando ArrayList.");
		
		for (int i=0; i<array.size();i++) {
			Object grab = array.get(i);
			String chain = grab.toString();
			System.out.print(chain.toUpperCase() + " ");
		}

	}

}
