package com.ste.emer.dao;

import com.ste.emer.model.User;

/**
 * Created by st on 2015/1/5.
 */
@Deprecated
public interface UserDao {
	public User selectUser(User user);

	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUser(int userId);
}
