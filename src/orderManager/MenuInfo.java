package orderManager;

public class MenuInfo {
  public int menuNumber;
  public String menuName;
  public int menuPrice;

  //생성자
  public MenuInfo() {}
  public MenuInfo(int menuNumber, String menuName, int menuPrice) {
    this.menuNumber = menuNumber;
    this.menuName = menuName;
    this.menuPrice = menuPrice;
  }
}
