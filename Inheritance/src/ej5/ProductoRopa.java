package ej5;

public class ProductoRopa extends Producto{
private String material;


	public ProductoRopa(String material) {
	super();
	this.material = material;
}

	public ProductoRopa(double precio, String nombre, int codigoBarra, String material) {
	super(precio, nombre, codigoBarra);
	this.material = material;
}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "ProductoRopa [material=" + material + " " + super.toString() + "]";
	}


}
