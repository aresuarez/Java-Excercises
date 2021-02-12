package agendapack;
import java.util.ArrayList;
import java.util.Iterator;
public class Agenda {
private ArrayList<Persona> agenda;

public Agenda() {
	super();
	// TODO Auto-generated constructor stub
	this.agenda = new ArrayList<Persona>();
}

public Agenda(ArrayList<Persona> agenda) {
	super();
	this.agenda = new ArrayList<Persona>();
}

public ArrayList<Persona> getAgenda() {
	return agenda;
}

public void setAgenda(ArrayList<Persona> agenda) {
	this.agenda = agenda;
}

public void add(Persona person) {
	agenda.add(person);
	System.out.println("La persona ha sido added.");
}

public void remove(Object Persona) {
	int cont=0;
	Iterator<Persona> it = agenda.iterator();
	while (it.hasNext()) {
		if (Persona.equals(agenda.get(cont))){
			agenda.remove(cont);
			System.out.println("La persona ha sido eliminada.");
			break;
	}
	
	it.next();cont++;}}
public void search(Persona persona) {
	int cont=0;
	Iterator<Persona> it = agenda.iterator();
	while (it.hasNext()) {
		if (persona.equals(agenda.get(cont))){
			System.out.println(agenda.get(cont).toString());
	}
		cont++;
		it.next();
		} 
}
public void mostrar() {
	for(Persona pos: agenda) {
		System.out.println(pos.toString());
	}
	if (agenda.size() == 0) {
		System.out.println("La agenda esta vacia.");
	}
}
}
