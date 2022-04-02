package strategy;

public class Encoder {
  private EncodingStrategy encodingStrategy;

  public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
    this.encodingStrategy = encodingStrategy;
  }
  public String getMsg(String msg){
    return this.encodingStrategy.encode(msg);
  }
}
