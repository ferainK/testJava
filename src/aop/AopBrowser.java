package aop;

import proxy.Html;
import proxy.IBrowser;

public class AopBrowser implements IBrowser {
  private String url;
  private Html html;
  Private Runnable before;

  @Override
  public Html show() {
    if(html = null){
      this.html = new Html(html);
      System.out.println("");
    }
  }

}