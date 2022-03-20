package singleton;

public class SocketClient {
  // 본인을 선언해야됨
  private static SocketClient socketClient = null;
  // 외부에서 생성자를 만들 수 없음
  private SocketClient(){};
  //
  public static SocketClient getInstance(){
    if (socketClient == null){
      socketClient = new SocketClient();
    }
    return socketClient;
  }
  public void connect(){
    if (socketClient != null){
      System.out.println("Connected!");
    } else {
      System.out.println("Disconnected;;");

    }
  }

}
