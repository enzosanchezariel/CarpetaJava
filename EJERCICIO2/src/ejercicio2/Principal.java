package ejercicio2;

import java.util.Scanner;

//Leer 10 palabras y mostrarlas en orden inverso al que fueron ingresadas.

public class Principal {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] words = new String[10];
		for (int i = 0; i < words.length; i++) {
			System.out.println("Ingrese palabra " + (i + 1));
			words[i] = reader.nextLine();
		}
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println((i + 1) + ". " + words[i]);
		}
		reader.close();
	}
}