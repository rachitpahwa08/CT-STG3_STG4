package handson5mediatorpattern;
public interface IChatMediator {
	void addUser(IUser user);
	void sendMessage(String msg);
}