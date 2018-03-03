package factory.factory_method;

import factory.AudiCar;
import factory.Car;

public class AudiCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new AudiCar();
	}

}
