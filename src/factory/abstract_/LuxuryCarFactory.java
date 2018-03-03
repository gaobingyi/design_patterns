package factory.abstract_;

public class LuxuryCarFactory implements CarFactory {

	@Override
	public Engine creatEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}

}
