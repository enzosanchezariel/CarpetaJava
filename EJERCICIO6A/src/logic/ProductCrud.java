package logic;

import java.util.ArrayList;

import entities.Product;
import ui.ProductMenu;

public class ProductCrud {

	public static void main(String[] args) {
		// MENU
		ProductMenu productMenu = new ProductMenu();
		productMenu.startMenu();
		System.out.println("Bye");
	}
	public static ArrayList<Product> retrieveAll() {
		// TODO
		return null;
	}
	
	public static Product retrieveById(String id) {
		// TODO
		return null;
	}
}