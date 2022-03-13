package publicTranportaionManager;

public class PriceStructure {
  private int bus = 1050;
  private int subway = 1100;

  private StringBuffer buffer = new StringBuffer();
  private String line = "===============\n";
  private String header = "종류 \t 요금\n";

  public int getBus(){
    return this.bus;
  }
  public void setBus() {
    this.bus = bus;
  }
  public int getSubway() {
    return this.subway;
  }
  public void setSubway() {
    this.subway = subway;
  }

  public void show() {
    this.buffer.append("[information]\n대중교통 요금 체계\n");
    this.buffer.append(this.line);
    this.buffer.append(this.header);
    this.buffer.append(this.line);
    this.buffer.append("버스 \t" + this.bus + "\n");
    this.buffer.append("지하철 \t" + this.subway + "\n");
    this.buffer.append(this.line);

    System.out.println(this.buffer.toString());
  }
}
