package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entities.Product;

public class ProductDB {
	
	public Product getById(Product p) {
		
		String sqlSelect = "select * from Product where id = ?";
		Connect connect = new Connect();
		Connection con = connect.getConnection();
		Product product = null;
		
		try {
			PreparedStatement stm = con.prepareStatement(sqlSelect);
            stm.setInt(1, p.getId());
			ResultSet rs = stm.executeQuery();
			if (rs != null) {
				rs.next();
				String name = rs.getString("name");
				String description = rs.getString("description");
				double price = Double.parseDouble(rs.getString("price"));
				int stock = Integer.parseInt(rs.getString("stock"));
				boolean shippingIncluded = Boolean.parseBoolean(rs.getString("shippingIncluded"));
				product = new Product(p.getId(), name, description, price, stock, shippingIncluded);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
}