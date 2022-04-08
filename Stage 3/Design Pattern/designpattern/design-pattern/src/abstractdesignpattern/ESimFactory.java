package abstractdesignpattern;

public class ESimFactory extends SimAbstractFactory{

	@Override
	public Sim getSim(String provider) {
		// TODO Auto-generated method stub
		if(provider.equals("airtel")) {
			return new AirtelSim("Created Airtel eSim");
		}
		
		else if(provider.equals("vi")) {
			return new ViSim("Created Vi eSim");
		}
		return null;
	}

}
