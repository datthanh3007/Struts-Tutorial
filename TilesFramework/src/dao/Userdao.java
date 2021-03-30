package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.connectDB;
import model.User;

public class Userdao {
	
	public void addUser(User user ) {
		Connection connection = connectDB.getJDBCConnection();
		String sql ="INSERT INTO INFOR_USER(NAME,AGE,ADDRESS,SEX,JOB) VALUE (?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,user.getName());
			preparedStatement.setInt(2,user.getAge());
			preparedStatement.setString(3,user.getAddress());
			preparedStatement.setString(4,user.getSex());
			preparedStatement.setString(5,user.getJob());
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
