package abstractdesignpattern;

public class SimFactory extends SimAbstractFactory{

	@Override
	public Sim getSim(String provider) {
		// TODO Auto-generated method stub
		if(provider.equals("airtel")) {
			return new AirtelSim("Created Normal Airtel Sim");
		}
		
		else if(provider.equals("vi")) {
			return new ViSim("Created Normal Vi Sim");
		}
		return null;
	}

}
