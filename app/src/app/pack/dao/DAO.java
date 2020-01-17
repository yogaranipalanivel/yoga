package app.pack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.pack.model.Product;
import app.pack.model.User;

public class DAO {

	public static Product pro = new Product();

	public static Connection getConnection(){
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app","root","root");
		}catch(SQLException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e1) {
			System.out.println(e1);
		}
		return con;
	}
	
	public static int checkLogin(User user) {
		int status = 0;
		String sql = "SELECT * FROM `user` where `username` = ? AND `password` = ? AND `role` = ?";
		try {
			Connection con = DAO.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, "admin");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				status = 1;
			}
		}catch(Exception e) {}
		return status;
	}

	public static int saveProduct(Product product) {
		int status = 0;
		String sql = "INSERT INTO product VALUES(?,?,?,?)";
		try {
			Connection con = DAO.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product.getId());
			ps.setString(2, product.getName());
			ps.setInt(3, product.getMinQua());
			ps.setInt(4, product.getPrice());
			status = ps.executeUpdate(); 
		}catch(Exception e) {}
		return status;
	}
	
	public static List<Product> getAllProduct(){
		List<Product> list = new ArrayList<Product>();
		String sql = "SELECT * FROM `product` WHERE 1";
		try {
			Connection con = DAO.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("product_id"));
				p.setName(rs.getString("product_name"));
				p.setMinQua(rs.getInt("minQuantity"));
				p.setPrice(rs.getInt("price"));
				list.add(p);
			}
		}catch(Exception e) {}
		return list;
	}

	public static int checkLoginAgent(User u) {
		int status = 0;
		String sql = "SELECT * FROM `user` where `username` = ? AND `password` = ? AND `role` = ?";
		try {
			Connection con = DAO.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, "agent");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				status = 1;
			}
		}catch(Exception e) {}
		return status;
	}

	public static Product selectProductById(int id) {
		String sql = "SELECT * FROM `product` WHERE product_id=?";
		try {
			Connection con = DAO.getConnection();
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				pro.setId(rs.getInt("product_id"));
				pro.setName(rs.getString("product_name"));
				pro.setMinQua(rs.getInt("minQuantity"));
				pro.setPrice(rs.getInt("price"));
			}
		}catch(Exception e) {System.out.println(e);}
		return pro;
	}

	public static int subById(int id, int qua) {
		int status = 0;
		String sql = "UPDATE product set minQuantity = ? where product_id = ?";
		try {
			Connection con = DAO.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, qua);
			ps.setInt(2, id);
			status = ps.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		return status;
	}

	public static int addById(int id, int qua,int pre) {
		int status = 0;
		int tot = pre + qua;
		String sql = "UPDATE product set minQuantity = ? where product_id = ?";
		try {
			Connection con = DAO.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tot);
			ps.setInt(2, id);
			status = ps.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		return status;
	}
	
}
