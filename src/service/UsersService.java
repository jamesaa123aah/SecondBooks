package service;

import entity.Users;

/**
 * 用户service 
 * 负责业务逻辑处理接口
 * 
 * @author Gavin
 *
 */
public interface UsersService {

	public boolean register();//处理注册的业务逻辑
	public boolean login();//处理登陆的业务逻辑
    public boolean payment();//用户支付
    public boolean collectBooks();//书籍收藏
    public boolean carOfItems();//购物车
    public boolean comment();//评论
    public boolean searchingBooks(String keyWord);//关键搜索书
}
