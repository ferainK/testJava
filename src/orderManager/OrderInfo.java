package orderManager;

public class OrderInfo {
  public int orderNumber;
  public int orderDate;
  public int orderTime;
  public UserInfo user;
  public MenuInfo menu;



  public OrderInfo() {}
  public OrderInfo(UserInfo user, MenuInfo menu, int orderNumber, int orderDate, int orderTime) {
    this.orderNumber = orderNumber;
    this.orderDate = orderDate;
    this.orderTime = orderTime;
    this.user = user;
    this.menu = menu;
  }

  public void OrderPrint(){
    System.out.println("주문 접수 번호 : " + this.orderNumber);
    System.out.println("주문 핸드폰 번호 : " + this.user.userPhoneNumber);
    System.out.println("주문 집 주소 : " + this.user.userAddress);
    System.out.println("주문 날짜 : " + this.orderDate);
    System.out.println("주문 시간 : " + this.orderTime);
    System.out.println("주문 이름 : " + this.menu.menuName);
    System.out.println("주문 가격 : " + this.menu.menuPrice);
  }

}
