package ej3;

public class Figura {

	private double area;
	private double perimetro;
	
	public Figura() {
		area = 0;
		perimetro = 0;
	}

	public Figura(double area, double perimetro) {
		this.area = area;
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double calcularArea(Object Figura){
		return 0.0;
	}
	public double calcularPerimetro(Object Figura){
		return 0.0;
	}
	@Override
	public String toString() {
		return "Figura [area=" + area + ", perimetro=" + perimetro + "]";
	}
	
	
	
}
