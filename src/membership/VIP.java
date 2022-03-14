package membership;

public class VIP extends Silver {
  private String agent;
  private double saleRatio;

  public VIP(String name) {
    this.name = name;
    this.point = 1000000;
    this.bonusRatio = 0.05;
    this.saleRatio = 0.1;
    this.grade = "VIP";
  }

  @Override
  public int priceUsedBonus(int price) {
    price *= (1 - this.saleRatio);
    return super.priceUsedBonus(price);
  }
}
