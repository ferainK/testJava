package strategy;

public class Main {
  public static void main(String[] args) {
    Encoder encoder = new Encoder();


    String msg = "Hello JAVA?";
    encoder.setEncodingStrategy(new Base64Strategy());
    String base64Result = encoder.getMsg(msg);
    System.out.println(base64Result);

    encoder.setEncodingStrategy(new NormalStrategy());
    String normalResult = encoder.getMsg(msg);
    System.out.println(normalResult);
  }
}
