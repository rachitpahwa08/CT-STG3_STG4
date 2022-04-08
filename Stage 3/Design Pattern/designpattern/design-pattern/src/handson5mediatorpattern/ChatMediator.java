package handson5mediatorpattern;

import java.util.List;

public class ChatMediator implements IChatMediator {
	
	private List<IUser> users;
	public ChatMediator() {}

	@Override
	public void addUser(IUser user) {
			users.add(user);
	}

	public List<IUser> getUsers() {
		return users;
	}

	public void setUsers(List<IUser> users) {
		this.users = users;
	}


	
	@Override
	public void sendMessage(String msg) {
		for(IUser user:users)
		{
			user.recieveMessage(msg);
		}
		
	}

}