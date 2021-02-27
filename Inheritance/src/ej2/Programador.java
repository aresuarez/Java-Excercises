package ej2;

public class Programador extends Empleado{
private int lineasCod;
private String lenguajeDom;

	public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasCod, String lenguajeDom) {
		super(nombre, dni, edad, casado, salario);
		this.lineasCod = lineasCod;
		this.lenguajeDom = lenguajeDom;
	}

	public Programador() {
		super();
	}

	public int getLineasCod() {
		return lineasCod;
	}

	public void setLineasCod(int lineasCod) {
		this.lineasCod = lineasCod;
	}

	public String getLenguajeDom() {
		return lenguajeDom;
	}

	public void setLenguajeDom(String lenguajeDom) {
		this.lenguajeDom = lenguajeDom;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo: Programador \nlineasCod=" + lineasCod + "\n lenguajeDom=" + lenguajeDom + ".";
	}

	
}
