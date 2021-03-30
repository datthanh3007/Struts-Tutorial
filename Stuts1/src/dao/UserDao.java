package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.JDBCConnection;
import model.User;



public class UserDao {
	public User getUserbyID(int id ) {
		String sql="SELECT * FROM INFOR WHERE ID = ? ";
		Connection connection = JDBCConnection.getJDBCConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAddress(rs.getString("address"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	public List<User> getlistUser() {
		ArrayList<User> listUser = new ArrayList<User>();
		String sql = "SELECT * FROM INFOR ";
		Connection connection = JDBCConnection.getJDBCConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAddress(rs.getString("address"));
				listUser.add(user);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listUser;
	}
	public void addUser(User user ) {
		Connection connection = JDBCConnection.getJDBCConnection();
		String sql ="INSERT INTO INFOR(NAME,ADDRESS) VALUE (?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,user.getName());
			preparedStatement.setString(2,user.getAddress());
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateUser(User user ) {
		Connection connection = JDBCConnection.getJDBCConnection();
		String sql = "UPDATE INFOR SET NAME=?, ADDRESS=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getAddress());
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteUser(int id ) {
		System.out.println("ID:");
		
		Connection connection = JDBCConnection.getJDBCConnection();
		String sql ="DELETE FROM INFOR WHERE ID =?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			
			int rs = preparedStatement.executeUpdate();
			//System.out.println(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
