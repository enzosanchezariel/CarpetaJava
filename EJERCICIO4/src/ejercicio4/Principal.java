package ejercicio4;

import java.util.Scanner;

//Leer un entero y luego una lista de 20 enteros. Guardar los mayores al número inicial y mostrarlos al final. Usar arrays, no otras colecciones.

public class Principal {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] numbers = new int[20];
		int numToCompare;
		while (true) {
			try {
				System.out.println("Ingrese número a comparar");
				numToCompare = Integer.parseInt(reader.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Debe ingresar un numero entero");
			}
		}
		int j = 0;
		for (int i = 0; i < numbers.length; i++) {
			int num;
			while (true) {
				try {
					System.out.println("Ingrese número " + (i + 1));
					num = Integer.parseInt(reader.nextLine());
					break;
				} catch (Exception e) {
					System.out.println("Debe ingresar un numero entero");
				}
			}
			if (num > numToCompare) {
				numbers[j] = num;
				j++;
			}
		}
		System.out.println("Los numeros ingresados mayores al inicial fueron");
		for (int i = 0; i < j; i++) {
			System.out.print(numbers[i] + " ");
		}
		reader.close();
	}
}