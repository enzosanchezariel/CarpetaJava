package ejercicio1;

//Mostrar por consola los 10 primeros números enteros y los 10 primeros números impares

public class Principal {

	public static void main(String[] args) {
		System.out.println("Primeros 10 números enteros");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Primeros 10 números enteros impares");
		for (int i = 0; i < 10; i++) {
			System.out.print(((2*i)+1) + " ");
		}
	}
}