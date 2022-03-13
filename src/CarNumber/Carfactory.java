package CarNumber;

public class Carfactory {
  private int number = 7001;

  private static Carfactory instance = new Carfactory();
  public static Carfactory getInstance() {
    if (instance == null){
      instance = new Carfactory();
    }
    return instance;
  }
  public int createCode(){
    instance.number++;
    System.out.println("[inform] 차대번호 생성 (차대번호 : " + instance.number + ")");
    return instance.number;
  }

}
