package chatApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ChatRoom {

	private List<User> ulist= new ArrayList<>();
	private Map<User,String > chatRoom = new LinkedHashMap<>();
	

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
		this.chatRoom.put(u,msg);	
	}
	
	public void getChat() {
		for(Map.Entry<User,String> e : this.chatRoom.entrySet()){
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}
	
	public void clearChat() {
		this.chatRoom.clear();
	}

}
