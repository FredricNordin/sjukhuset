package edu.lernia.labb3;

public class Patient {

	private String name;
	private String sickness;
	
	public Patient(String string, String sickness) {
		this.name = string;
		this.sickness = sickness;
		if(sickness == null) {
			this.sickness = "healthy";
		}
	}
	
	public Patient(String string) {
		this.name = string;
		if(this.sickness == null) {
			this.sickness = "healthy";
		}
	}
	
	public Boolean isSick() {
		if(this.sickness != "healthy") {
			return true;
		} else {
			return false;
		}
	}

	public String getSickness() {
		return this.sickness;
	}

	public String getName() {
		return this.name;
	}

	public void takeMedication(Medicine medicine) {
		if(medicine.getTreatmentName().equalsIgnoreCase(this.sickness)) {
			this.sickness = "healthy";
		}
	}
}
