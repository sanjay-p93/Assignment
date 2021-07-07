import java.io.*;
import java.util.Scanner;
import java.lang.Math;

abstract class Persistance{
	public abstract void persist();
}

class DatabasePersistance extends Persistance{
	public void persist(){
		System.out.println("\nYour data have DatabasePersistance.\n");
	}

}
class FilePersistance extends Persistance{
	public void persist(){
		System.out.println("\nYour data have FilePersistance.\n");
	}

}

public class DataPersistance {
	public static void main(String[] args){
		int randomNum = (int)(Math.random() * 9);
		if((randomNum%2)==0){
			Persistance client = new DatabasePersistance();
			client.persist();
		}
		else{
			Persistance client = new FilePersistance();
			client.persist();
		}
	}
}