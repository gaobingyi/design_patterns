package factory.abstract_;

public class LowCarFactory implements CarFactory {

	@Override
	public Engine creatEngine() {
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}

}
