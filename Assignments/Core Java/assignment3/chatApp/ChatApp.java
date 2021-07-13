package chatApp;
import java.io.*;
import java.util.*;

import assignment3.Date;

public class ChatApp {

	public static void main(String[] args) {
		
		User u1=new User("john","john123");
		User u2=new User("james","j123");
		User u3=new User("jane","j345s");
		ChatRoom c1=new ChatRoom();
		int i=0;
		c1.addUser(u1);
		c1.addUser(u2);
		c1.addUser(u3);
		
		do {
			System.out.println("Please select your option \n 1. log in \n 0. Exit");
			Scanner sin= new Scanner(System.in);
			Scanner sln= new Scanner(System.in);
			i = sin.nextInt();
			
			if(i==1) {
				String name;
				String pass;
				System.out.print("Username :");
				name = sln.nextLine();
				System.out.print("Password :");
				pass = sln.nextLine();
				User userLogged=new User(name,pass);
				if(c1.isUserValidated(userLogged)) {
					int n=0;
					do {
						System.out.println("\n\nPlease select your option \n 1. Join chat \n 0. Logout");
						n = sin.nextInt();
						if(n==1) {
							  	int m=0;
							  	do {
									System.out.println("\n\nPlease select your option \n 1. Send message \n 2. View messages\n 3. List users \n 4. Clear chat \n 0. Exit \n");
									m = sin.nextInt();
									switch(m) {
									  case 1:
										  String msg;
										  System.out.print("Enter message : ");
										  msg = sln.nextLine();
										  c1.addMessage(userLogged,msg);
										  break;
									  case 2:
										  c1.getChat();
										  break;
									  case 3:
										  c1.getUsers();
										  break;
									  case 4:
										  c1.clearChat();
										  break;
									  case 0:
										  break;
									  default:
										  System.out.println("\n Invalid choice!\n");
										  break;
									}
							  	}while(m!=0);
						}
						else {
							System.out.println("\n Invalid choice!\n");
						}
					}while(n!=0);
					
				}
				else {
					System.out.println("\nInvalid Credentials!\n");
				}
			}
		}while(i!=0);		

	}

}
