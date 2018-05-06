package me.test.scripbox.model.drone.parking;

import java.io.Serializable;

public class DroneParking implements Serializable {
	private static final long serialVersionUID = -930831983015098482L;

	private String parkingNumber;
	private boolean isAssigned;
	private int droneId;

	public DroneParking() {
		super();
	}

	public DroneParking(String number, boolean isAssigned) {
		super();
		this.parkingNumber = number;
		this.isAssigned = isAssigned;
	}

	public DroneParking(String number, boolean isAssigned, int droneId) {
		super();
		this.parkingNumber = number;
		this.isAssigned = isAssigned;
		this.droneId = droneId;
	}

	public String getParkingNumber() {
		return parkingNumber;
	}

	public void setParkingNumber(String number) {
		this.parkingNumber = number;
	}

	public boolean isAssigned() {
		return isAssigned;
	}

	public void setAssigned(boolean isAssigned) {
		this.isAssigned = isAssigned;
	}

	public int getDroneId() {
		return droneId;
	}

	public void setDroneId(int droneId) {
		this.droneId = droneId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + droneId;
		result = prime * result + (isAssigned ? 1231 : 1237);
		result = prime * result + ((parkingNumber == null) ? 0 : parkingNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DroneParking other = (DroneParking) obj;
		if (droneId != other.droneId)
			return false;
		if (isAssigned != other.isAssigned)
			return false;
		if (parkingNumber == null) {
			if (other.parkingNumber != null)
				return false;
		} else if (!parkingNumber.equals(other.parkingNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DroneParking [number=" + parkingNumber + ", isAssigned=" + isAssigned + ", droneId=" + droneId + "]";
	}

}
