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
	public int hashCode() {
		return Objects.hash(createdTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return createdTime == other.createdTime;
	}

	@Override
	public String toString() {
		return  user + " : " + message;
	}
	

}
