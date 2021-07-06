  
import java.io.*;
import java.util.Scanner;

class student{
	int m1,m2,m3;
	student(){
		m1=0;
		m2=0;
		m3=0;
	}
	public void setMarks(int n1,int n2,int n3){
		m1=n1;
		m2=n2;
		m3=n3;
	}
	public void getAvg(int i){
		int avg =0;
		avg=(m1+m2+m3)/3;
		System.out.println("Avarage mark for sudent "+i+" is : "+avg);
	}
	public void getTotal(int i){
		int tot =0;
		tot=m1+m2+m3;
		System.out.println("Total mark for sudent "+i+" is : "+tot);
	}
}

public class studentMarks {

	public static void main(String[] args){
		int total=0;
		Scanner s = new Scanner(System.in);
		student[] stud = new student[3];
		stud[0] = new student();
		stud[1] = new student();
		stud[2] = new student();
		for(int i=0;i<3;i++){
			int n1=0,n2=0,n3=0;
			System.out.print("Enter mark of 3 subjects for sudent ");
			System.out.println(i+1);
			n1= s.nextInt();
			n2= s.nextInt();
			n3= s.nextInt();
			stud[i].setMarks(n1,n2,n3);
		}

		System.out.println("\nAvrage marks of sudents \n");
		for(int i=0;i<3;i++){
			stud[i].getAvg(i+1);
		}
		System.out.println("\nTotal marks of sudents \n");
		for(int i=0;i<3;i++){
			stud[i].getTotal(i+1);
		}

		System.out.print("\nTotal marks for subject 1   :");
		total=stud[0].m1+stud[1].m1+stud[2].m1;
		System.out.print(total);
		System.out.print("\nAvarage marks for subject 1 :");
		System.out.print(total/3);

		System.out.print("\nTotal marks for subject 2   :");
		total=stud[0].m2+stud[1].m2+stud[2].m2;
		System.out.print(total);
		System.out.print("\nAvarage marks for subject 2 :");
		System.out.print(total/3);

		System.out.print("\nTotal marks for subject 3   :");
		total=stud[0].m3+stud[1].m3+stud[2].m3;
		System.out.print(total);
		System.out.print("\nAvarage marks for subject 3 :");
		System.out.print(total/3);
		System.out.println();
	}
}












