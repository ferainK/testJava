package membership;

public class Silver {
  protected String id;
  protected String name;
  protected int point;
  protected String grade;
  protected double bonusRatio;

  protected Silver(){}
  public Silver(String name) {
    this.name = name;
    grade = "silver";
    point = 1000;
    bonusRatio = 0.01;
  }

  public int priceSavedBonus(int price) {
    point += price * bonusRatio;
    return price;
  }

  public int priceUsedBonus(int price) {
    if (point > price) {
      point -= price;
      price = 0;
    } else {
      price -= point;
      point = 0;
    }
    showInfo();
    return price;
  }

  public void showInfo() {
    System.out.println(name + "님의 등급은" + grade + "이며, 잔여 포인트는 " + point + "점 입니다.");
  }



}
