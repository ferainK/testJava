package simpleGame.Level;

import simpleGame.Player;

public abstract class Level {
  protected String level;
  abstract void run();
  abstract void jump();
  abstract void turn();

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  //실행 메서드
  public void go(int count){
    showLevelMsg();
    run();
    for (int i = 1; i <= count; i++){
      jump();
    }
    turn();
  };

  //확인 메서드
  public void showLevelMsg(){
    System.out.println("******"+ level + "레벨입니다. ******");
  }

}
