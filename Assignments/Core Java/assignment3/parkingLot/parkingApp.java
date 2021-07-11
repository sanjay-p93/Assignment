package parkingLot;

import java.util.Scanner;

public class parkingApp {

	public static void main(String[] args) {
		int e=0;
		Parked_CarOwnerList pList= new Parked_CarOwnerList();
		do {
			System.out.println("Please select your option \n 1.Park car \n 2. Get car \n 0. Exit");
			Scanner scNum= new Scanner(System.in);
			Scanner scLn= new Scanner(System.in);
			try {
				e = scNum.nextInt();
			}
			catch (Exception ex){
				e=9; 
			}
			switch(e) {
			  case 1:
				  Parked_CarOwner_Details newCar = new Parked_CarOwner_Details();
				  String s;
				  try {
					  int n;
					  System.out.print("Enter name : ");
					  s = scLn.nextLine();
					  newCar.setOwnerName(s);
					  System.out.print("Enter car model : ");
					  s = scLn.nextLine();
					  newCar.setCarModel(s);
					  System.out.print("Enter car number : ");
					  n = scNum.nextInt();
					  newCar.setCarNo(n);
					  System.out.print("Enter mobile number : ");
					  n = scNum.nextInt();
					  newCar.setOwnerMobileNumber(n);
					  System.out.print("Enter adress : ");
					  s = scLn.nextLine();
					  newCar.setOwnerAddress(s);
					  ParkingToken pT =pList.getNewToken();
					  if(pT != null) {
						  	pList.add_new_car(pT,newCar);
					  		System.out.print("\nCar parked successfully.\n");
					  }
					  else
						  System.out.print("No slots available.");
				  }
				  catch (Exception ex){
					  System.out.print("\nInvalid entry.\n");
					  e=1; 
				  }
				  break;
			  case 2:
				  try {  
					  System.out.print("Enter car number : ");
					  int n;
					  n = scNum.nextInt();
					  ParkingToken pTr=pList.get_parked_car_location(n);
					  if(pTr!=null) {
						  pList.remove_car(pTr);
						  System.out.print("\nCar checked out.\n");
					  }
				  }
				  catch (Exception ex){
					  System.out.print("\n Invalid entry \n ");
					  e=1; 
				  }
				  break;
			  case 0:
				  break;
			  default:
				  System.out.println("\n Invalid choice!\n");
				  break;
			}
		}while(e!=0);
		Parked_CarOwner_Details o1= new Parked_CarOwner_Details();
		

	}

}
