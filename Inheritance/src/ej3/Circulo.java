package ej3;

public class Circulo extends Figura {
	private String color;
	private double radio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(String color, double radio) {
		this.color=color;
		this.radio = radio;
		super.setPerimetro(perimetro());
		super.setArea(area());
		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double perimetro(){
		return radio*3.14*2;
	}
	
	public double area() {
		return radio*radio*3.14;
	}
	@Override
	public String toString() {
		return "Circulo [color=" + color + ", radio=" + radio + ", toString()=" + super.toString() + "]";
	}
	

	

}
