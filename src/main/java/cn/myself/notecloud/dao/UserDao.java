package cn.myself.notecloud.dao;

import cn.myself.notecloud.entity.User;

public interface UserDao {
	User findUserByName(String name);
	void addUser(User user);
	User findUserByUserId(String userId);
}
