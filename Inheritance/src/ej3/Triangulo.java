package ej3;

public class Triangulo extends Figura {
	private String color;
	private double base;
	private double altura;
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(String color, double base, double altura) {
		super();
		this.color=color;
		this.base=base;
		this.altura=altura;
		super.setPerimetro(perimetro());
		super.setArea(area());
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double perimetro(){
		return base*3;
	}
	
	public double area() {
		return base * altura / 2;
	}
	
	@Override
	public String toString() {
		return "Triangulo [color=" + color + ", base=" + base + ", altura=" + altura + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
