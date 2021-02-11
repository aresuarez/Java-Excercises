package trianguloobjeto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1 = new Triangulo(22,44,55);
		Triangulo t2 = new Triangulo(23,65,432);
		int perimetro1 = t1.perimetro(t1.lado1, t1.lado2, t1.lado3);
		int perimetro2 = t2.perimetro(t2.lado1, t2.lado2, t2.lado3);
		System.out.printf("El perimetro del triangulo 1 es %d, y el perimetro del triangulo 2 es %d.", perimetro1, perimetro2);
		System.out.println("\nEl area del triangulo 1 es "+ ((t1.getLado1()*t1.getLado2())/2)+ ", y el area del triangulo 2 es "
		+ ((t2.getLado1()*t2.getLado2())/2) + ".");	
	}

}
