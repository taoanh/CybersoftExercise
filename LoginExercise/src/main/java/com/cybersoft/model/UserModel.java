package com.cybersoft.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybersoft.connection.MySQLConnection;
import com.cybersoft.pojo.User;

public class UserModel {
	public static boolean insertUser(User user) throws SQLException {
		boolean isSuccess = false;
		Connection conn = MySQLConnection.getConnection();
		String sql = "INSERT INTO users(email,password,fullname,avatar,role_id) values(?,?,?,?,?)";

		int col = 0;
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(++col, user.getEmail());
			stm.setString(++col, user.getPassword());
			stm.setString(++col, user.getFullname());
			stm.setString(++col, user.getAvatar());
			stm.setInt(++col, user.getRole_id());
			int result = stm.executeUpdate();
			if (result > 0) {
				isSuccess = true;
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public static User getUser(String email, String password) {
		User user = null;

		Connection conn = MySQLConnection.getConnection();
		String sql = "SELECT * FROM users WHERE EMAIL = ? AND PASSWORD = ?";
		try {
			PreparedStatement stm = conn.prepareStatement(sql);

			int col = 0;
			stm.setString(++col, email);
			stm.setString(++col, password);

			ResultSet result = stm.executeQuery();
			while (result.next()) {
				user = new User();
				user.setId(result.getLong("id"));
				user.setEmail(result.getString("email"));
				user.setFullname(result.getString("fullname"));
				user.setAvatar(result.getString("avatar"));
				user.setRole_id(result.getInt("role_id"));
				
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public List<User> getListUsers(String email, String password) throws SQLException {
		List<User> list = new ArrayList<User>();
		String sql = "SELECT * FROM users";

		Connection conn = MySQLConnection.getConnection();
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			int col = 0;
			stm.setString(++col, email);
			stm.setString(++col, password);
			ResultSet result = stm.executeQuery();
			while (result.next()) {
				User user = new User();
				user.setId(result.getLong("id"));
				user.setEmail(result.getString("email"));
				user.setFullname(result.getString("fullname"));
				user.setAvatar(result.getString("avatar"));
				user.setRole_id(result.getInt("role_id"));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
