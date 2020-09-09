package com.fameena.model;

public class ApartmentDetailModel {
	
	int Aptno;
	int personid;
	int noOfResidents;
	int washer;
	int carport;
	@Override
	public String toString() {
		return "ApartmentDetailModel [Aptno=" + Aptno + ", personid=" + personid + ", noOfResidents=" + noOfResidents
				+ ", washer=" + washer + ", carport=" + carport + ", Energy=" + Energy + "]";
	}
	public int getAptno() {
		return Aptno;
	}
	public void setAptno(int aptno) {
		Aptno = aptno;
	}
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public int getNoOfResidents() {
		return noOfResidents;
	}
	public void setNoOfResidents(int noOfResidents) {
		this.noOfResidents = noOfResidents;
	}
	public int getWasher() {
		return washer;
	}
	public void setWasher(int washer) {
		this.washer = washer;
	}
	public int getCarport() {
		return carport;
	}
	public void setCarport(int carport) {
		this.carport = carport;
	}
	public int getEnergy() {
		return Energy;
	}
	public void setEnergy(int energy) {
		Energy = energy;
	}
	int Energy;

}
