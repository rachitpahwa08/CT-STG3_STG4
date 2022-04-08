package handson2abstractfactorypattern;
public class Client {

	public static void main(String args[]){
		Factory factory=new MercedesFactory();
		System.out.println(factory.makeHeadLight());
		System.out.println(factory.makeTire());
		Factory factory2=new AudiFactory();
		System.out.println(factory2.makeHeadLight());
		System.out.println(factory2.makeTire());
		
	}
}