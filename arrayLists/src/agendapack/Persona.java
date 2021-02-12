package agendapack;

public class Persona {
private String name;
private int telf;
public Persona() {
	super();
	// TODO Auto-generated constructor stub
}

public Persona(String name, int telf) {
	super();
	this.name = name;
	this.telf = telf;
}

public Persona(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTelf() {
	return telf;
}
public void setTelf(int telf) {
	this.telf = telf;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Persona other = (Persona) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public String toString() {
	return "Persona [name=" + name + ", telf=" + telf + "]";
}

}
