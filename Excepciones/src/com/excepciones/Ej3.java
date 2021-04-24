package com.excepciones;

public class Ej3 {

	public static void main(String[] args) {
		
		try{
			throw new Ej3Excepcion("Mensaje de excepcion.");
		}
		catch(Ej3Excepcion e) {
			e.message();
		}finally {
			System.out.println("Adios!");
		}

	}

}
