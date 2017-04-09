package dao;

import java.util.ArrayList;

import org.apache.catalina.User;

import entity.Users;

/**
 * �û����ݿ�dao�ӿ�
 * @author Gavin
 *
 */
public interface UsersDAO {

	public ArrayList<Users> getUserByUsername(String username);//�����û�����ȡ�û���Ϣ
	public boolean addUser(Users user);//�����û�
	public ArrayList<Users> getAllUsers();//��ȡ�����û����û���Ϣ
	public boolean deleteUserByUsername();//�����û���ɾ���û�
}
