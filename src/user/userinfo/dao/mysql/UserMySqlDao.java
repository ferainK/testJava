package user.userinfo.dao.mysql;
import user.userinfo.User;
import user.userinfo.dao.UserDao;

public class UserMySqlDao implements UserDao {

  @Override
  public void insert(User user) {
    System.out.println("insert into MySQL DB userId = " + user.getId());
  }

  @Override
  public void update(User user) {
    System.out.println("update into MySQL DB userId = " + user.getId());

  }

  @Override
  public void delete(User user) {
    System.out.println("delete into MySQL DB userId = " + user.getId());

  }
}
