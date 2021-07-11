package parkingLot;

public class Parked_CarOwner_Details {
	private String ownerName;
	private String carModel;
	private int carNo;
	private int ownerMobileNumber;
	private String ownerAddress;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public int getOwnerMobileNumber() {
		return ownerMobileNumber;
	}
	public void setOwnerMobileNumber(int ownerMobileNumber) {
		this.ownerMobileNumber = ownerMobileNumber;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	
	@Override
	public String toString() {
		return "\nCar Details : [ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo
				+ ", ownerMobileNumber=" + ownerMobileNumber + ", ownerAddress=" + ownerAddress + "]\n";
	}
	
	
	

}
