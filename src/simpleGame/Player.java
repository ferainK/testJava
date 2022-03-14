package simpleGame;

import simpleGame.Level.Advanced;
import simpleGame.Level.Beginner;
import simpleGame.Level.Level;
import simpleGame.Level.Super;

public class Player {
  private Level level;

  public Player() {
    this.level = new Beginner();
  }
  public void getLevel(){
    level.showLevelMsg();
  }

  public void levelUp(){
    if (this.level instanceof Beginner){
      this.level = new Advanced();
    } else if (this.level instanceof Advanced){
      this.level = new Super();
    } else{
      System.out.println("이미 만렙입니다.");
    }
    System.out.println("\n ★ 레벨업! (" + level.getLevel() + ")\n");
  }

  public void play(int count){
    level.go(count);
  }
}
