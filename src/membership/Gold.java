package membership;

public class Gold extends Silver {
  private String agent;
  private double saleRatio;

  public Gold(String name) {
    this.name = name;
    this.point = 100000;
    this.bonusRatio = 0.03;
    this.saleRatio = 0.05;
    this.grade = "Gold";
  }

  @Override
  public int priceUsedBonus(int price) {
    price *= (1 - this.saleRatio);
    return super.priceUsedBonus(price);
  }
}
