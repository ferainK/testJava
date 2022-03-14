package user.web;

import user.userinfo.User;
import user.userinfo.dao.UserDao;
import user.userinfo.dao.mysql.UserMySqlDao;
import user.userinfo.dao.oracle.UserOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Client {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("db.properties");
    Properties prop = new Properties();
    prop.load(fis);

    String dbType = prop.getProperty("DBTYPE");

    User user1 = new User();
    user1.setId("ferain");
    user1.setPw("1234");
    user1.setName("이철우");


    UserDao user1Dao = null;
    if (dbType.equals("ORACLE")) {
      user1Dao = new UserOracleDao();
    } else if (dbType.equals("MYSQL")) {
      user1Dao = new UserMySqlDao();
    } else {
      System.out.println(("not Supported DB"));
      return;
    }

    user1Dao.insert(user1);
  }
}
