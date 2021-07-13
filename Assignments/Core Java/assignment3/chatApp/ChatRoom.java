package chatApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ChatRoom {

	private List<User> ulist= new ArrayList<>();
	private List<Message > chatRoom = new ArrayList<>();
	

	public void addUser(User u) {
		this.ulist.add(u);
	}
	
	public void getUsers() {
		for(User e : this.ulist){
			System.out.println(e);
		}
	}

	public boolean isUserValidated(User u) {
		if(this.ulist.contains(u)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public void addMessage(User u,String msg) {
		this.chatRoom.add(new Message(u,msg));	
	}
	
	public void getChat() {

		for(Message element : chatRoom){
			System.out.println(element);	
		}	
	}
	
	public void clearChat() {
		this.chatRoom.clear();
	}

}
