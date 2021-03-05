package inmobiliaria;
import java.util.Iterator;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Agencia {
private ArrayList <Inmueble> agencia;

public Agencia() {
	super();
	this.agencia = new ArrayList <Inmueble>();
}

public void inmueblesVenta(double price) {
	for(Inmueble pos: agencia) {
		if (price < )
	}
}

public void addVentaInmueble(Inmueble algo){
	Iterator<Inmueble> it = agencia.iterator();
	int cont = 0;
	while(it.hasNext()) {
		if (algo.equals(agencia.get(cont))) {
			System.out.println("Este inmueble ya existe.");
			break;
		} 
		it.next();
		cont++;
	}
	agencia.add(algo);
	System.out.println("Anadido un inmueble satisfactoriamente.");
	
}

public void addRentInmueble(Inmueble algo){
	Iterator<Inmueble> it = agencia.iterator();
	int cont = 0;
	while(it.hasNext()) {
		if (algo.equals(agencia.get(cont))) {
			System.out.println("Este inmueble ya existe.");
			break;
		} 
		it.next();
		cont++;
	}
	agencia.add(algo);
	System.out.println("Anadido un inmueble satisfactoriamente.");	
}
//Downcasting Inmueble to Solar.
public void solaresRusticos() {
	Iterator<Inmueble> it = agencia.iterator();
	int cont = 0;
	int contno = 0;
	
	while(it.hasNext()) {
		if (agencia.get(cont) instanceof Solar) {
		//Downcasting to Solar to apply getter.
		Solar solar = (Solar) agencia.get(cont);
		if (solar.getZona() == "rustica") {
		contno++;
		}
		} 
		it.next();
		cont++;
	}
	System.out.printf("El numero de solares rusticos es: %d.", contno);
}
public void localesSegundaMano(double m) {
	Iterator<Inmueble> it = agencia.iterator();
	int cont = 0;
	int contno = 0;
	
	while(it.hasNext()) {
		if (agencia.get(cont) instanceof Local) {
		Local local = (Local) agencia.get(cont);
		if (local.getMetrosCuadrado() < m && local.getEstado() == "2Hand") {
			System.out.println(local.toString());
		}
		} 
		it.next();
		cont++;
	}
	System.out.printf("El numero de solares rusticos es: %d.", contno);
}
public void fusion(ArrayList<Inmueble> ag2) {
	agencia.addAll(ag2);
	JOptionPane.showMessageDialog(null, agencia);
}

}
