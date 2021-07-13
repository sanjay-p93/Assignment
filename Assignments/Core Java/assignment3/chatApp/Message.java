package chatApp;

import java.util.Objects;

public class Message {
	private long createdTime;
	private User user;
	private String message;
	public Message(User user, String message) {
		super();
		this.createdTime= System.currentTimeMillis();
		this.user = user;
		this.message = message;
	}
	@Override
	public String toString() {
		return  user + " : " + message;
	}
	

}
