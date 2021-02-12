package ej7;

import java.util.ArrayList;

public class Main {
	//Metodo que printea el array.
public static void printer(ArrayList<String> array) {
	
	for (String pos: array) {
				System.out.println(pos);
			}
}
	public static void main(String[] args) {
		
			ArrayList <String> array = new ArrayList<String>();
			array.add("Xiang");
			array.add("Sarto");
			array.add("Fercho");
			array.add("Juan");
			array.add("Jorge");
			
			array.add(2,"Paco");
			
			printer(array);
			
			array.remove(0);
			for (int i = 0; i < array.size(); i++) {
				if (array.get(i).toString().equalsIgnoreCase("Jorge")) {
					array.remove(i);
				}
			}
			System.out.println(" ");
			
			printer(array);
			
			}

	}


