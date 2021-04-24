package com.obrasartisticas;

public class OMusical extends Obra{
private String discografica;
private int songs;

public OMusical(String titulo, int year, String discografica, int songs) {
	super(titulo, year);
	super.addArray();
	this.discografica = discografica;
	this.songs = songs;
}

public String getDiscografica() {
	return discografica;
}

public void setDiscografica(String discografica) {
	this.discografica = discografica;
}

public int getSongs() {
	return songs;
}

public void setSongs(int songs) {
	this.songs = songs;
}



@Override
public String toString() {
	return "OMusical [discografica=" + discografica + ", songs=" + songs + "]";
}

@Override
public void mostrarObras() {
	System.out.println(super.toString()+this.toString());
	
}


}
