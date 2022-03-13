package publicTranportaionManager;

public class Test {
  public static void main(String[] args){
    PriceStructure price = new PriceStructure();
    User user1 = new User("이철우", 100000);
    Bus bus602 = new Bus(602);

    //출력물
    price.show();

    //버스 탑승
    user1.show();
    user1.boarding(bus602);
    user1.show();
  }
}
