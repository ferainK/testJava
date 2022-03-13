package publicTranportaionManager;

public class Bus {
  private int busNumber;
  private int numberOfUser;
  private int busIncome;

  private public PriceStructure prices = new PriceStructure();
  private int price = prices.getBus();

  //생성자
  public Bus(int busNumber) {
    this.busNumber = busNumber;
    this.numberOfUser = 0;
    this.busIncome = 0;
  }

  //Get
  public int getBusNumber() {
    return this.busNumber;
  }
  public int getNumberOfUser() {
    return this.numberOfUser;
  }
  public int getIncome() {
    return this.busIncome;
  }
  public int getPrice() {
    return this.price;
  }


  //메서드
  public void reset() {
    this.numberOfUser = 0;
    this.busIncome = 0;
  }
  public void boarding() {
    this.numberOfUser += 1;
    this.busIncome += this.price;
    System.out.println("★" + this.getBusNumber() + "을 탑승하셨습니다. \n");
  }
}
