
public class PhoneOrderRepair implements IOrderRepair {

	@Override
	public void processOrder(String modelName) {
		System.out.println(modelName +" order accepted!");
}

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(modelName +" repair accepted!");
	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType +" repair accepted!");
	}

}