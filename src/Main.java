import java.util.ArrayList;

import com.sun.org.glassfish.external.statistics.Statistic;
import com.sun.swing.internal.plaf.synth.resources.synth_sv;

import dao.UsersDAO;
import dao.daoImpl.UsersDAOImpl;
import entity.Users;

public class Main {

	//����
	
		public static void main(String[] args) {
			
			//���Ը����û�����ѯ����
			Users users2 = new Users();
			users2.setUsername("���");
			
			UsersDAO usersDAO = new UsersDAOImpl();
			ArrayList<Users> arrayList = new ArrayList<Users>();
			arrayList=usersDAO.getUserByUsername(users2.getUsername());		
			for (Users users : arrayList) {
				
				System.out.println(users.getSchool());
			}
			
			//���Բ�������
//			Users users2 = new Users();
//			users2.setUsername("���");
//			users2.setPassword("22222");
//			users2.setSchool("������ͨ��ѧ");
//			users2.setPhone("110");
//			users2.setEmail("143010");
//			UsersDAO usersDAO = new UsersDAOImpl();
//			usersDAO.addUser(users2);			
			//���Ի�ȡ����
//			ArrayList<Users> nArrayList = new ArrayList<Users>();
//		    UsersDAO usersDAO = new UsersDAOImpl();
//			nArrayList = usersDAO.getAllUsers();
//			for (Users users : nArrayList) {
//			
//				 String a = users.getUsername();
//				 String b = users.getSchool();
//				 
//				 System.out.println("username��"+a+"   ѧУ��"+b);
//			}
			
		}
}
