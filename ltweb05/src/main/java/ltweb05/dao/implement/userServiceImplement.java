package ltweb05.dao.implement;

import java.sql.Date;

import ltweb05.models.UserModel;
import ltweb05.services.IUserService;

public class userServiceImplement implements IUserService {

	userDAOimplement userDAO = new userDAOimplement();

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.findByUserName(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}
		return null;
	}

	public UserModel findByUserName(String username) {
		return userDAO.findByUserName(username);
	}

	@Override
	public UserModel get(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(UserModel user) {
		userDAO.insert(user);
	}

	@Override
	public boolean register(int id, String email, String username, String fullname, String phone, 
			String image, int roleid, String password) {
		if (userDAO.checkExistUsername(username)) {
			return false;
		}
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		userDAO.insert(new UserModel(id, email, username, fullname, phone, null, 5, password));
		return true;
	}

	@Override
	public boolean checkExistEmail(String email) {
		// TODO Auto-generated method stub
		return userDAO.checkExistEmail(email);
	}

	@Override
	public boolean checkExistUsername(String username) {
		// TODO Auto-generated method stub
		return userDAO.checkExistUsername(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		// TODO Auto-generated method stub
		return userDAO.checkExistPhone(phone);
	}

}
