package service;

import entity.Users;

/**
 * �û�service 
 * ����ҵ���߼�����ӿ�
 * 
 * @author Gavin
 *
 */
public interface UsersService {

	public boolean register();//����ע���ҵ���߼�
	public boolean login();//�����½��ҵ���߼�
    public boolean payment();//�û�֧��
    public boolean collectBooks();//�鼮�ղ�
    public boolean carOfItems();//���ﳵ
    public boolean comment();//����
    public boolean searchingBooks(String keyWord);//�ؼ�������
}
