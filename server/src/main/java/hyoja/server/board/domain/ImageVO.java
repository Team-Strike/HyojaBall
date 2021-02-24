package hyoja.server.board.domain;

public class ImageVO {
  private int id;
  private byte[] data;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public byte[] getData() {
    return this.data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

}
