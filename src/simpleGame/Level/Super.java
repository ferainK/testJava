package simpleGame.Level;

public class Super extends Level {
  public Super(){
    setLevel("Super");
  }
  @Override
  void run() {
    System.out.println("미친듯이 달립니다.");
  }

  @Override
  void jump() {
    System.out.println("높이 점프합니다.");
  }

  @Override
  void turn() {
    System.out.println("공중제비 합니다.");
  }
}
