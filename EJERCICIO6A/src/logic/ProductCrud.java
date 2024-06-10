package logic;

import java.util.ArrayList;

import data.ProductDB;
import entities.Product;

public class ProductCrud {

    private ProductDB db = new ProductDB();

	public ArrayList<Product> retrieveAll() {
		// TODO
		return null;
	}
	
	public Product retrieveById(Product p) {
		return db.getById(p);
	}
}