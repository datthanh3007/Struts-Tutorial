package service;

import dao.Userdao;
import model.User;


public class Service_user {
	private Userdao userdao;
	
	public Service_user() {
		userdao = new Userdao();
	}
	
	public void addUserService(User user) {
		userdao.addUser(user);
	}
	

}
