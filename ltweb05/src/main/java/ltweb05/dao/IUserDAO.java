package ltweb05.dao;

import java.util.List;

import ltweb05.models.UserModel;

public interface IUserDAO {

	// Chứa các hàm và thủ tục
	List<UserModel> findAll();

	UserModel findByID(int id);

	void insert(UserModel user);

	UserModel get(String username);


	boolean checkExistEmail(String email);

	boolean checkExistUsername(String username);

	boolean checkExistPhone(String phone);

}
