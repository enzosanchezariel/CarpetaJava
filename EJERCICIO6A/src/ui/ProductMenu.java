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
				System.out.println("Id:");
				p.setId(Integer.parseInt(reader.nextLine()));
				showProduct(ctrlProd.retrieveById(p));
			}

			else if (opt.compareTo("create") == 0) {
				System.out.println("Nombre:");
				String name = reader.nextLine();
				System.out.println("Descripción:");
				String description = reader.nextLine();
				System.out.println("Precio:");
				double price = Double.parseDouble(reader.nextLine());
				System.out.println("Stock:");
				int stock = Integer.parseInt(reader.nextLine());
				System.out.println("¿Envío incluido? (s/N):");
				boolean shippingIncluded = reader.nextLine().toLowerCase().compareTo("s") == 0 ? true : false;
				Product p = new Product(name, description, price, stock, shippingIncluded);
				System.out.println("Resumen del producto creado");
				ctrlProd.save(p);
			}
			else if (opt.compareTo("delete") == 0) {
				Product p = new Product();
				list(ctrlProd.retrieveAll());
				System.out.println("Id:");
				p.setId(Integer.parseInt(reader.nextLine()));
				ctrlProd.delete(p);
			}
			else if (opt.compareTo("update") == 0) {
				Product p = new Product();
				list(ctrlProd.retrieveAll());
				System.out.println("Id:");
				p.setId(Integer.parseInt(reader.nextLine()));
				p = ctrlProd.retrieveById(p);
				//---
				System.out.println("Nombre (En blanco para saltear):");
				String name = reader.nextLine();
				if(name.compareTo("") != 0) p.setName(name);
				System.out.println("Descripción (En blanco para saltear):");
				String description = reader.nextLine();
				if(description.compareTo("") != 0) p.setDescription(description);
				System.out.println("Precio (En blanco para saltear):");
				String price = reader.nextLine();
				if(price.compareTo("") != 0) p.setPrice(Double.parseDouble(price));
				System.out.println("Stock (En blanco para saltear):");
				String stock = reader.nextLine();
				if(stock.compareTo("") != 0) p.setStock(Integer.parseInt(stock));
				System.out.println("¿Envío incluido? (s/N):");
				boolean shippingIncluded = reader.nextLine().toLowerCase().compareTo("s") == 0 ? true : false;
				p.setShippingIncluded(shippingIncluded);
				//---
				ctrlProd.update(p);
			}
			else if (opt.compareTo("exit") == 0) System.out.println("Bye");
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
		for (Product product : products) {
			showProduct(product);
		}
	}
	
	void showProduct(Product product) {
		System.out.println("id: " + product.getId() + "\tname: " + product.getName() + "\tdescription: " + product.getDescription() + "\tprice: " + product.getPrice() + "\tstock: " + product.getStock() + "\tshipping included: " + product.isShippingIncluded());
	}
	
	
}