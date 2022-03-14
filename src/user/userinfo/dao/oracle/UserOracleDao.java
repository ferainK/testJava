package user.userinfo.dao.oracle;

import user.userinfo.User;
import user.userinfo.dao.UserDao;

public class UserOracleDao implements UserDao {
  @Override
  public void insert(User user) {
    System.out.println("insert into Oracle DB userId = " + user.getId());
  }

  @Override
  public void update(User user) {
    System.out.println("update into Oracle DB userId = " + user.getId());
  }

  @Override
  public void delete(User user) {
    System.out.println("delete into Oracle DB userId = " + user.getId());
  }
}

