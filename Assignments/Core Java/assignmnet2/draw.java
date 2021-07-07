import java.io.*;
import java.util.Scanner;

abstract class shape{
	public abstract void draw();
}

class line extends shape{
	public void draw(){
		System.out.println("\nDrawing line - line is 1d");
	}

}
class rectangle extends shape{
	public void draw(){
		System.out.println("\nDrawing rectangle - rectangle is 2d");
	}

}
class cube extends shape{
	public void draw(){
		System.out.println("\nDrauing cube - cube is 3d");
	}

}

public class draw {
	public static void main(String[] args){
		line l1 = new line();
		rectangle r1 = new rectangle();
		cube c1 = new cube();
		l1.draw();
		r1.draw();
		c1.draw();
	}
}