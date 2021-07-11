package parkingLot;

import java.util.Objects;

public class ParkingToken {
	private int floor;
	private int section;
	private int slotNo;
	
	public ParkingToken(int floor, int section, int slotNo) {
		super();
		this.floor = floor;
		this.section = section;
		this.slotNo = slotNo;
	}

	@Override
	public String toString() {
		return "Parking location : [floor=" + floor + ", section=" + section + ", slotNo=" + slotNo + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(floor, section, slotNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParkingToken other = (ParkingToken) obj;
		return floor == other.floor && section == other.section && slotNo == other.slotNo;
	}

}
