package facade;

public class Writer {
  private String fileame;

  public Writer(String filename){
    this.fileame = filename;
  }

  public void fileConnect(){
    String msg = String.format("Writer %s로 연결합니다.", fileame);
    System.out.println(msg);
  }

  public void write(){
    String msg = String.format("Writer %s로 파일쓰기합니다.", fileame);
    System.out.println(msg);
  }

  public void fileDisconnect(){
    String msg = String.format("Writer %s로 연결 종료합니다.", fileame);
    System.out.println(msg);
  }
}
