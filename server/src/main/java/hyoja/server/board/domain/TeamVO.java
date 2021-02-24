package hyoja.server.board.domain;

public class TeamVO {

	private int id;
	private String name;
	private int image_id;
	private ImageVO image;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getImage_id() {
		return this.image_id;
	}

	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}

	public ImageVO getImage() {
		return this.image;
	}

	public void setImage(ImageVO image) {
		this.image = image;
	}

}