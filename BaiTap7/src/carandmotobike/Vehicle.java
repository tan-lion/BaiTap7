package carandmotobike;

public class Vehicle {
	String manufacturer;
	String color;
	int manufactorerYear;

	public Vehicle() {
	}
	
	

	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getManufactorerYear() {
		return manufactorerYear;
	}



	public void setManufactorerYear(int manufactorerYear) {
		this.manufactorerYear = manufactorerYear;
	}



	public void vehicleInformation() {
		System.out.println("This is parent class.");
	}

}
