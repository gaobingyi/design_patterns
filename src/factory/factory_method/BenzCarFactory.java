package factory.factory_method;

import factory.BenzCar;
import factory.Car;

public class BenzCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new BenzCar();
	}

}
