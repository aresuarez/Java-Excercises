package ej3;

public class Rectangulo extends Figura{
	private String color;
	private double lado1;
	private double lado2;
	
	public Rectangulo() {
		super();
		
	}
	public Rectangulo(String color, double lado1, double lado2) {
		super();
		this.color = color;
		this.lado1=lado1;
		this.lado2=lado2;
		super.setPerimetro(perimetro());
		super.setArea(area());	
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public double perimetro() {
		return lado1*2 + lado2*2;
	}
	
	public double area() {
		return lado1*lado2;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [color=" + color + ", lado1=" + lado1 + ", lado2=" + lado2 + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
