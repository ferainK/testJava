package proxy;

public class main {
  public static void main(String[] args) {
    //Browser browser = new Browser("www.naver.com");
    //Browser browser = new Browser("www.naver.com");
    IBrowser browser = new BrowserProxy("www.naver.com");
    browser.show();
    browser.show();
    browser.show();
    browser.show();
    browser.show();

  }
}
