package ejercicio5b4;

import java.util.ArrayList;
import java.util.Scanner;

//Leer un entero y luego una lista de 20 enteros. Guardar los mayores al número inicial y mostrarlos al final.

public class Principal {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println("Ingrese el número de referencia");
		int numToCompare = readAndCheck();
		for (int i = 0; i < 20; i++) {
			System.out.println("Ingrese el numero a comparar");
			int num = readAndCheck();
			if (num > numToCompare) numbers.add(num);
		}
		System.out.println("Los numeros ingresados mayores al inicial fueron");
		for (Integer num : numbers) {
			System.out.println(num);
		}
		reader.close();
	}
	
	static Integer readAndCheck() {
		Scanner reader = new Scanner(System.in);
		int num;
		while (true) {
			try {
				num = Integer.parseInt(reader.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Debe ingresar un numero entero");
			}
		}
		return num;
	}
	
}