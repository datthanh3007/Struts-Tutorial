package userservice;

import java.util.List;

import dao.UserDao;
import model.User;

public class UserService {
	private UserDao userdao;

	public UserService() {
	userdao = new UserDao();
	}
	public List<User> getUser(){
		return userdao.getlistUser();
	}
	public User getUserbyID(int id) {
		return userdao.getUserbyID(id);
	}
	public void addUser(User user) {
		userdao.addUser(user);
	}
	public void deleteUser(int id) {
		userdao.deleteUser(id);
	}
	public void editUser(User user) {
		userdao.updateUser(user);
	}
	

}
