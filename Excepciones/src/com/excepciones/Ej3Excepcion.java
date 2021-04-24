package com.excepciones;

public class Ej3Excepcion extends Exception {

	String algo;
	
	public Ej3Excepcion(String algo) {
		this.algo = algo;
	}
		
	public void message() {
		System.out.println(algo);
	}

	}


