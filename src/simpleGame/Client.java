package simpleGame;

public class Client {
  public static void main(String[] args) {
    Player player = new Player();

    System.out.println("게임을 준비합니다!");
    player.getLevel();
    System.out.println("게임 시작! \n\n\n\n");


    player.play(1);

    player.levelUp();
    player.play(2);

    player.levelUp();
    player.play(3);

    player.levelUp();
    player.play(4);
  }
}
