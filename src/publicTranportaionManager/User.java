package publicTranportaionManager;

public class User {
  private String userName;
  private int userCash;
  private boolean invalid = true;

  private StringBuffer buffer = new StringBuffer();
  private String line = "==========================\n";

  //생성자
  public User() {
    this("정보 없음", 0);
    this.invalid = false;
  }

  public User(String userName) {
    this(userName, 0);
    this.invalid = true;
  }

  public User(String userName, int userCash) {
    this.userName = userName;
    this.userCash = userCash;
    this.invalid = true;
  }

  //Get
  public String getUserName() {
    return this.userName;
  }
  public int getUserCash() {
    return this.userCash;
  }

  //Set
  public void setUserCash(int userCash) {
    this.userCash = userCash;
  }



  //탑승 메서드
  public void boarding(Bus bus){
    //잔돈
    this.userCash -= bus.getPrice();
    //탑승자수
    bus.boarding();
  }


  //출력 메서드
  public boolean show(){
    buffer.append("[information]\n승객 정보\n");
    buffer.append(line);
    if (this.invalid) {
      buffer.append("이름 : " + this.userName + ", 잔액 : " + this.userCash + "원\n");
    } else{
      buffer.append("승객정보 없음 \n");
    }
    buffer.append(line);

    System.out.println(this.buffer.toString());
    this.buffer.setLength(0);
    return this.invalid;
  }

}
