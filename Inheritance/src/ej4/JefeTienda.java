package ej4;

import java.util.Arrays;

public class JefeTienda extends Empleado {
private int codigoTienda;
private String[] vendedorCargo;

public JefeTienda() {
	super();
}
public JefeTienda(String nombre, String nacimiento, String puesto, int categoria, double sueldo, int codigoTienda, String[]vendedorCargo) {
	super(nombre, nacimiento, puesto, categoria, sueldo);
	this.codigoTienda = codigoTienda;
	this.vendedorCargo = vendedorCargo;
	
}
public int getCodigoTienda() {
	return codigoTienda;
}
public void setCodigoTienda(int codigoTienda) {
	this.codigoTienda = codigoTienda;
}
public String[] getVendedorCargo() {
	return vendedorCargo;
}
public void setVendedorCargo(String[] vendedorCargo) {
	this.vendedorCargo = vendedorCargo;
}
@Override
public String toString() {
	return "JefeTienda [codigoTienda=" + codigoTienda + ", vendedorCargo=" + Arrays.toString(vendedorCargo)
			+ ", toString()=" + super.toString() + "]";
}




}
