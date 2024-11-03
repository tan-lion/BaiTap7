package car;

import java.util.ArrayList;
import java.util.List;

public class Car {
	String manufacturer;
	String color;
	int manufacturerYear;
	List<Car> listCar = new ArrayList<>();

	public Car() {

	}

	public Car(String manufacturer, String color, int manufacturerYear) {
		super();
		this.manufacturer = manufacturer;
		this.color = color;
		this.manufacturerYear = manufacturerYear;
	}

	// Function list car
	public void listCar() {
		// Declare
		Car car_1 = new Car("Mec", "White", 2000);
		Car car_2 = new Car("BMW", "Black", 2001);
		Car car_3 = new Car("Honda", "Purple", 2002);

		// Add car to the list
		listCar.add(car_1);
		listCar.add(car_2);
		listCar.add(car_3);

		for (Car car : listCar) {
			System.out.println(car);
		}
	}

	@Override
	public String toString() {
		return "manufacturer: " + manufacturer + ", color: " + color + ", manufacturerYear: " + manufacturerYear;
	}

}
