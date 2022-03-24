package aop;

import proxy.Html;
import proxy.IBrowser;

public class AopBrowser implements IBrowser {
  private String url;
  private Html html;
  private Runnable after;
  private Runnable before;

  public AopBrowser(String url, Runnable before, Runnable after){
    this.url = url;
    this.before = before;
    this.after = after;
  }

  @Override
  public Html show() {
    if (html == null) {
      before.run();
      this.html = new Html(url);
      System.out.println("AopBrowser html loading from : " + url);
      try {
        Thread.sleep(1500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    after.run();
    System.out.println("AopBrowser html cache : " + url);
    return html;
  }
}
