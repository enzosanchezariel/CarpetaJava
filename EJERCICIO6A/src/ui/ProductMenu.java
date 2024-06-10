package ui;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Product;
import logic.ProductCrud;

public class ProductMenu {
	
    private ProductCrud ctrlProd = new ProductCrud();

	public void startMenu() {
		Scanner reader = new Scanner(System.in);
		String opt;
		do{
			mainMenu();
			opt = reader.nextLine();
			if (opt.compareTo("list") == 0){
				list(ctrlProd.retrieveAll());
			}
			else if (opt.compareTo("search") == 0) {
				Product p = new Product();
				p.setId(Integer.parseInt(reader.nextLine()));
				showProduct(ctrlProd.retrieveById(p));
			}

			else if (opt.compareTo("create") == 0) System.out.println("Usted eligió create");
			else if (opt.compareTo("delete") == 0) System.out.println("Usted eligió delete");
			else if (opt.compareTo("update") == 0) System.out.println("Usted eligió update");
			else if (opt.compareTo("exit") == 0) System.out.println("Usted eligió exit");
			}while(opt.compareTo("exit") != 0);
		reader.close();
	}
	
	void mainMenu() {
		System.out.println("Productos");
		System.out.println("");
		System.out.println("list\t\tListar todos los productos");
		System.out.println("search\t\tMostrar los datos completos de un producto por id");
		System.out.println("create\t\tCrear un nuevo producto");
		System.out.println("delete\t\tEliminar un producto");
		System.out.println("update\t\tModificar un producto");
		System.out.println("exit\t\tSalir del programa");
		System.out.println("Ingrese una opción:");
	}
	
	void list(ArrayList<Product> products) {
		//TODO
	}
	
	void showProduct(Product product) {
		System.out.println("id: " + product.getId() + "name: " + product.getName() + "description: " + product.getDescription() + "price: " + product.getPrice() + "stock: " + product.getStock() + "shipping included: " + product.isShippingIncluded());
	}
}