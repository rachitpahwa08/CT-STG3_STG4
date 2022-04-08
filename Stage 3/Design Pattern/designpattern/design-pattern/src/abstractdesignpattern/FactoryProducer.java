package abstractdesignpattern;

public class FactoryProducer {
	public static SimAbstractFactory getFactory(boolean isEsim){   
	      if(isEsim){
	         return new ESimFactory();         
	      }else{
	         return new SimFactory();
	      }
	   }
}
