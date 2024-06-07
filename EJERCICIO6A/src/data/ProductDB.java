package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entities.Product;

public class ProductDB {
	
	public static Product getById(int id) {
		
		String sqlSelect = "select * from Product where id = " + id;
		Connect connect = new Connect();
		Connection con = connect.getConnection();
		Product product = null;
		
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sqlSelect);
			if (rs != null) {
				rs.next();
				String name = rs.getString("name");
				String description = rs.getString("description");
				double price = Double.parseDouble(rs.getString("price"));
				int stock = Integer.parseInt(rs.getString("stock"));
				boolean shippingIncluded = Boolean.parseBoolean(rs.getString("shippingIncluded"));
				product = new Product(id, name, description, price, stock, shippingIncluded);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
}