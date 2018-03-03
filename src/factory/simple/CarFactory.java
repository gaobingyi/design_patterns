package factory.simple;

import factory.AudiCar;
import factory.BenzCar;
import factory.Car;

public class CarFactory {
	public static Car createCar(String car) {
		if (car.equals("Audi")) {
			return new AudiCar();
		} else if (car.equals("Benz")) {
			return new BenzCar();
		} else {
			return null;
		}
	}
}
