package user.userinfo.dao;
import user.userinfo.User;

public interface UserDao {
  void insert(User user);
  void update(User user);
  void delete(User user);

  static void show(){
    System.out.println("호호호!");
  }
}
