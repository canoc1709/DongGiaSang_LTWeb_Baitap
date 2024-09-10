package ltweb05.services;

import java.sql.Date;

import ltweb05.models.UserModel;

public interface IUserService {

	UserModel login(String username, String password);

	UserModel get(String username);

	void insert(UserModel user);

	boolean register(int id, String email, String username, String fullname, String phone, 
			String image, int roleid, String password);

	boolean checkExistEmail(String email);

	boolean checkExistUsername(String username);

	boolean checkExistPhone(String phone);
}
