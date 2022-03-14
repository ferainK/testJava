package simpleGame.Level;

public class Beginner extends Level {
  public Beginner(){
    setLevel("Beginner");
  }
  @Override
  void run() {
    System.out.println("천천히 달립니다.");
  }

  @Override
  void jump() {
    System.out.println("점프 실패");
  }

  @Override
  void turn() {
    System.out.println("턴 실패");
  }
}
