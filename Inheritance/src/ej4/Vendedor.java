package ej4;

public class Vendedor extends Empleado {
	int codigoVendedor;
	int numVentas;
	
	public Vendedor() {
		super();
	}

	public Vendedor(String nombre, String nacimiento, String puesto, int categoria, double sueldo, int codigoVendedor, int numVentas) {
		super(nombre, nacimiento, puesto, categoria, sueldo);
		this.codigoVendedor = codigoVendedor;
		this.numVentas = numVentas;
		if (numVentas > 50 ) {
			super.setSueldo(super.getSueldo()+100);
		}
				
	}

	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}

	@Override
	public String toString() {
		return "Vendedor [codigoVendedor=" + codigoVendedor + ", numVentas=" + numVentas + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
