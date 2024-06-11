package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entities.Product;

public class ProductDB {
	
	public ArrayList<Product> getAll(){
		
		String sqlSelect = "select * from Product";
		Connect connect = new Connect();
		Connection con = connect.getConnection();
		ArrayList<Product> products = new ArrayList<Product>();
		
		try {
			PreparedStatement stm = con.prepareStatement(sqlSelect);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				int id = Integer.parseInt(rs.getString("id"));
				String name = rs.getString("name");
				String description = rs.getString("description");
				double price = Double.parseDouble(rs.getString("price"));
				int stock = Integer.parseInt(rs.getString("stock"));
				boolean shippingIncluded = Boolean.parseBoolean(rs.getString("shippingIncluded"));
				products.add(new Product(id, name, description, price, stock, shippingIncluded));
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}
	
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
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}

	public void save(Product p) {
		String sqlSelect = "insert into Product(name, description, price, stock, shippingIncluded) values(?, ?, ?, ?, ?)";
		Connect connect = new Connect();
		Connection con = connect.getConnection();
		try {
			PreparedStatement stm = con.prepareStatement(sqlSelect);
			stm.setString(1, p.getName());
			stm.setString(2, p.getDescription());
			stm.setString(3, String.valueOf(p.getPrice()));
			stm.setString(4, String.valueOf(p.getStock()));
			stm.setBoolean(5, p.isShippingIncluded());
			stm.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(Product p) {
		String sqlSelect = "delete from Product where id = ?";
		Connect connect = new Connect();
		Connection con = connect.getConnection();
		
		try {
			PreparedStatement stm = con.prepareStatement(sqlSelect);
            stm.setInt(1, p.getId());
			stm.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(Product p) {
		// TODO Auto-generated method stub
		String sqlSelect = "update Product set name = ?, description = ?, price = ?, stock = ?, shippingIncluded = ? where id = ?";
		Connect connect = new Connect();
		Connection con = connect.getConnection();
		try {
			PreparedStatement stm = con.prepareStatement(sqlSelect);
			stm.setString(1, p.getName());
			stm.setString(2, p.getDescription());
			stm.setString(3, String.valueOf(p.getPrice()));
			stm.setString(4, String.valueOf(p.getStock()));
			stm.setBoolean(5, p.isShippingIncluded());
			stm.setInt(6, p.getId());
			stm.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}