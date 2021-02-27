package ej3;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
			Circulo redondo = new Circulo("blue",2);
			Rectangulo cuadrado = new Rectangulo("green",4,6);
			Triangulo triple = new Triangulo("red",5,8);
			
			ArrayList <Figura> array = new ArrayList <Figura>();
			
			array.add(redondo);
			array.add(cuadrado);
			array.add(triple);
			
			for (Figura pos: array) {
				System.out.println(pos.toString());
			}
	}

}
