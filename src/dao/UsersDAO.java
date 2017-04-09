package dao;

import java.util.ArrayList;

import org.apache.catalina.User;

import entity.Users;

/**
 * 用户数据库dao接口
 * @author Gavin
 *
 */
public interface UsersDAO {

	public ArrayList<Users> getUserByUsername(String username);//更具用户名获取用户信息
	public boolean addUser(Users user);//新增用户
	public ArrayList<Users> getAllUsers();//获取所有用户的用户信息
	public boolean deleteUserByUsername();//根据用户名删除用户
}
