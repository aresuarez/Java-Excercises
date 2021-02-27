package ej4;
public class Main {

	public static void main(String[] args) {
		Object[] test = new Object[4];
		test[0]= new Vendedor("Xiang","08-2000","Vendedor",2,2000,1,200);
		
		String[] labors = new String[3];
		labors[0] = "Limpiar";
		labors[1]= "Cuidar";
		labors[2]= "Hacer cosas";
		
		test[1]= new PersonalMantenimiento("Paco","06-2000","Personal de Mantenimiento",4,2000,labors);
		test[2] = new PersonalAlmacen("Pepe","06-1990","Personal de Almacen",3,1000,2);
		String[] aCargo = new String[3];
		aCargo[0] = "Pepe";
		aCargo[1] = "Paco";
		aCargo[2] = "Xiang";
		test[3] = new JefeTienda("Juan","06-1995","Jefe de Tienda",1,4000,45,aCargo);
		
		for (Object pos : test) {
			System.out.println(pos);
		}
		
	}

}
