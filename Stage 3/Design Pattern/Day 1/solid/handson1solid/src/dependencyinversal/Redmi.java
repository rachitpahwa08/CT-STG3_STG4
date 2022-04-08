package dependencyinversal;

public class Redmi implements Iphone {

	@Override
	public String getPhonePart1() {
		return "Display";
	}

	@Override
	public double getPart1Cost() {
		return 500;
	}

}