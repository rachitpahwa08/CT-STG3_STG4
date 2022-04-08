package abstractdesignpattern;
public class App {

	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		//Here Esim is false
		SimAbstractFactory simAbstractFactory=FactoryProducer.getFactory(false);
		Sim sim=simAbstractFactory.getSim("airtel");
		sim.setDataSpeed(5.2);
		mobile.setSim(sim);
		mobile.browse();
		sim=simAbstractFactory.getSim("vi");
		mobile.setSim(sim);
		mobile.browse();
		//Here Esim is true
		simAbstractFactory=FactoryProducer.getFactory(true);
		sim=simAbstractFactory.getSim("airtel");
		sim.setDataSpeed(5.2);
		mobile.setSim(sim);
		mobile.browse();
		sim=simAbstractFactory.getSim("vi");
		mobile.setSim(sim);
		mobile.browse();
	}

}