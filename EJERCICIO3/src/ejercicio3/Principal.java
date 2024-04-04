package ejercicio3;

import java.util.Scanner;

//Leer 10 palabras, luego leer una nueva palabra e indicar si la misma ya había sido ingresada en las 10 primeras.

public class Principal {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] words = new String[10];
		for (int i = 0; i < words.length; i++) {
			System.out.println("Ingrese palabra " + (i + 1));
			words[i] = reader.nextLine();
		}
		System.out.println("Ingrese palabra a comparar");
		String toCompare = reader.nextLine();
		boolean flag = false;
		for (String word : words) {
			if (word.compareToIgnoreCase(toCompare) == 0) flag = true;
		}
		if (flag) {
			System.out.println("La palabra se encuentra dentro de las primeras 10 ingresadas");
		} else {
			System.out.println("La palabra no se encuentra dentro de las primeras 10 ingresadas");
		}
		reader.close();
	}

}
