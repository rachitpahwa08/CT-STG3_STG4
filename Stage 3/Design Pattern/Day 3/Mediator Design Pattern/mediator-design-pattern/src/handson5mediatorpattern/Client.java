package handson5mediatorpattern;
import java.util.*;
public class Client {
	public static void main(String args[]) {
		ChatMediator chatMediator = new ChatMediator();
		chatMediator.setUsers(new ArrayList());
		BasicUser bUser = new BasicUser(chatMediator, "Basic User 1");
		PremiumUser pUser = new PremiumUser(chatMediator, "Premium User 1");
		BasicUser test=new BasicUser(chatMediator,"Test");
		chatMediator.addUser(bUser);
		chatMediator.addUser(pUser);
		//chatMediator.addUser(test);
		test.sendMessage("Hi All,from Test");
	}
}