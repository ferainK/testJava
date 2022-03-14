package simpleGame.Level;

public class Advanced extends Level{
  public Advanced(){
    setLevel("Advanced");
  }
  @Override
  void run() {
    System.out.println("빨리 달립니다.");
  }

  @Override
  void jump() {
    System.out.println("점프 합니다.");
  }

  @Override
  void turn() {
    System.out.println("턴 실패");
  }

}
