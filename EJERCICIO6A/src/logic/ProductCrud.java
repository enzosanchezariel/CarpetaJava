package logic;

import java.util.ArrayList;

import data.ProductDB;
import entities.Product;

public class ProductCrud {

    private ProductDB db = new ProductDB();
    
    public void save(Product p) {
    	db.save(p);
    }

	public ArrayList<Product> retrieveAll() {
		return db.getAll();
	}
	
	public Product retrieveById(Product p) {
		return db.getById(p);
	}

	public void delete(Product p) {
		// TODO Auto-generated method stub
		db.delete(p);
	}

	public void update(Product p) {
		// TODO Auto-generated method stub
		db.update(p);
	}
}