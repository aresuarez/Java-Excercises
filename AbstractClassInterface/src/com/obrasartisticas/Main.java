package com.obrasartisticas;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ex = 0;
		ArrayList<Obra> obras = new ArrayList<Obra>();
		do {
			int opt = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opcion: 1- Para introducir una pelicula. 2- Para introducir una cancion., 3- Para introducir un libro."));
			switch(opt) {
			case 1:
				System.out.println("Introduce el titulo: ");
				String title = sc.next();
				System.out.println("Introduce el anyo: ");
				int year= sc.nextInt();
				System.out.println("Introduce una productora");
				String productora = sc.next();
				OCine peli = new OCine(title,year,productora);
				peli.mostrarObras();
				obras.add(peli);
				break;
			case 2:
				System.out.println("Introduce el titulo: ");
				String title2 = sc.next();
				System.out.println("Introduce el anyo: ");
				int year2 = sc.nextInt();
				System.out.println("Introduce la discografica: ");
				String disco = sc.next();
				System.out.println("Introduce el nombre de la cancion: ");
				int song = sc.nextInt();
				OMusical musica = new OMusical(title2,year2,disco,song);
				obras.add(musica);
				break;
			case 3:
				System.out.println("Introduce el titulo: ");
				String title3 = sc.next();
				System.out.println("Introduce el anyo: ");
				int year3 = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce la editorial");
				String editorial = sc.next();
				System.out.println("Introduce el numero de paginas");
				int numPag = sc.nextInt();
				OLiteraria libro = new OLiteraria(title3,year3,editorial,numPag);
				obras.add(libro);
				
				break;
			case 4:
				break;
			default: 
				System.out.println("Valor no valido.");
				ex=1;
			}
			
			
		}while (ex==0);
		sc.close();
	} 

}
