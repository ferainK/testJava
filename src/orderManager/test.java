package orderManager;

public class test {
  public static void main (String [] args) {

    UserInfo user1 = new UserInfo("ferain", "이철우",
        30, 170, 65, "0149095979", "서울시 강서구 염창동");
    MenuInfo menu1 = new MenuInfo(1, "스태커4 버거", 10000);
    OrderInfo order1 = new OrderInfo(user1, menu1, 1, 20220312, 132230);

    order1.OrderPrint();
  }
}
