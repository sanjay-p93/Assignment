package springCoreQ7;

public class SpelObj {
	private int id;
	private String name;

	public SpelObj() {
	}

	public SpelObj(int questionId, String question) {
		super();
		this.id = questionId;
		this.name = question;
	}

	public void dispaly() {

		System.out.println("ID : " + id + ", Name " + name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
