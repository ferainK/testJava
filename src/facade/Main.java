package facade;

public class Main {
  public static void main(String[] args) {
    FTP ftpClient = new FTP("www.foo.co.kr", 22, "/home/etc");
    Reader reader = new Reader("text.tmp");
    Writer writer = new Writer("text.tmp");

    ftpClient.connect();
    ftpClient.moveDirectory();

    writer.fileConnect();
    writer.write();

    reader.fileConnect();
    reader.fileRead();

    reader.fileDisconnect();
    writer.fileDisconnect();
    ftpClient.disconnect();

    //facade 적용
    SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
    sftpClient.connect();
    sftpClient.read();
    sftpClient.write();
    sftpClient.disConnect();
  }
}
