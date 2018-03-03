package factory.test;

import org.junit.Test;

import factory.AudiCar;
import factory.BenzCar;
import factory.Car;
import factory.abstract_.LowCarFactory;
import factory.abstract_.LuxuryCarFactory;
import factory.factory_method.AudiCarFactory;
import factory.factory_method.BenzCarFactory;
import factory.simple.CarFactory;

public class Client {
	@Test
	public void testNoFactory() {
		Car audi = new AudiCar();
		audi.run();
		Car benz = new BenzCar();
		benz.run();
	}
	
	@Test
	public void testSimpleFactory() {
		Car audi = CarFactory.createCar("Audi");
		audi.run();
		Car benz = CarFactory.createCar("Benz");
		benz.run();
	}
	
	@Test
	public void testFactoryMethod() {
		Car audi = new AudiCarFactory().createCar();
		audi.run();
		Car benz = new BenzCarFactory().createCar();
		benz.run();
	}
	
	@Test
	public void testAbstractFactory() {	
		factory.abstract_.CarFactory luxuryCarFactory = new LuxuryCarFactory();
		luxuryCarFactory.creatEngine();
		luxuryCarFactory.createSeat();
		factory.abstract_.CarFactory lowCarFactory = new LowCarFactory();
		lowCarFactory.creatEngine();
		lowCarFactory.createSeat();
	}
}
