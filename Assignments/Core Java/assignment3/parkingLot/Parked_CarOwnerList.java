package parkingLot;

import java.util.HashMap;
import java.util.Map;

import chatApp.User;

public class Parked_CarOwnerList {

	private Map<ParkingToken ,Parked_CarOwner_Details> parkingList = new HashMap<>();
	

	public void add_new_car(ParkingToken pT,Parked_CarOwner_Details owner) {
		this.parkingList.putIfAbsent(pT,owner);	
	}

	public ParkingToken get_parked_car_location(int carNo) {

		for(Map.Entry<ParkingToken ,Parked_CarOwner_Details> e : this.parkingList.entrySet()){
			if(e.getValue().getCarNo()==carNo) {
				System.out.println(e.getKey()+" : "+e.getValue());
				return e.getKey();
			}
		}
		System.out.println("Car not found.");
		return null;
	}

	public ParkingToken getNewToken() {
		for(int f=1;f<4;f++) {
			for(int sec=1;sec<5;sec++) {
				for(int slt=1;slt<20;slt++) {
					
					ParkingToken pT = new ParkingToken(f,sec,slt);
					if(!this.parkingList.containsKey(pT)) {
						return pT;
					}
				}
			}
		}
		return null;
	}

	public void remove_car(ParkingToken pT) {
		this.parkingList.remove(pT);
	}
}
