package trianguloobjeto;

public class Triangulo {
	int lado1;
	int lado2;
	int lado3;

	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangulo(int lado1, int lado2, int lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	public int perimetro(int lado1, int lado2, int lado3) {
		int perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
	
	
}
