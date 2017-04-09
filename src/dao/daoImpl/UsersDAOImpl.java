package dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.eclipse.jdt.internal.compiler.ast.TrueLiteral;

import dao.UsersDAO;
import entity.Items;
import entity.Users;
import util.DBHelper;
/**
 * �û����ݿ�daoʵ����
 * @author Gavin
 *
 */
public class UsersDAOImpl implements UsersDAO{

	
	
	
	@Override
	public ArrayList<Users> getUserByUsername(String username) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;		
		ArrayList<Users> arrayList = new ArrayList<Users>();
		
		
		try {
			connection=DBHelper.getConnection();
			
			String sql = "select username,password,school,phone,email from users where username = ?;"; // SQL���
			
			stmt =connection.prepareStatement(sql);
			stmt.setString(1,username);
		
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				Users users = new Users();
				users.setUsername(rs.getString("username"));
				users.setPassword(rs.getString("password"));
				users.setSchool(rs.getString("school"));
				users.setPhone(rs.getString("phone"));
				users.setEmail(rs.getString("email"));
				
				arrayList.add(users);
			}
			
			return arrayList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			// �ͷ����ݼ�����
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// �ͷ�������
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	
		
	}

	@Override
	public boolean addUser(Users user) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection=DBHelper.getConnection();
			String sql = "insert into users(username,password,school,phone,email) values(?,?,?,?,?)"; // SQL���
		    stmt=connection.prepareStatement(sql);
		    
		    stmt.setString(1,user.getUsername());
		    stmt.setString(2,user.getPassword());
		    stmt.setString(3,user.getSchool());
		    stmt.setString(4,user.getPhone());
		    stmt.setString(5,user.getEmail());
		    
		    stmt.executeUpdate();
		    
		    return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			
			// �ͷ�������
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		
		
		
		
	}

	@Override
	public ArrayList<Users> getAllUsers() {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		ArrayList<Users> arrayList = new ArrayList<Users>();
		try{
		connection=DBHelper.getConnection();
		String sql = "select * from users;"; // SQL���
		stmt =connection.prepareStatement(sql);
		rs = stmt.executeQuery();
		while (rs.next()) {
			
			Users users = new Users();
			users.setUsername(rs.getString("username"));
			users.setPassword(rs.getString("password"));
			users.setSchool(rs.getString("school"));
			users.setPhone(rs.getString("phone"));
			users.setEmail(rs.getString("email"));
			
			arrayList.add(users);
		}
		return arrayList; // ��������ѧ������Ϣ��
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}finally {
			// �ͷ����ݼ�����
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// �ͷ�������
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		
		
	}

	@Override
	public boolean deleteUserByUsername() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
