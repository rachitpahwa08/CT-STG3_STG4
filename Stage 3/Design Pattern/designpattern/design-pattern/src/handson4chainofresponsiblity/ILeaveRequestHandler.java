package handson4chainofresponsiblity;
public interface ILeaveRequestHandler {

	ILeaveRequestHandler iLeaveRequestHandler=null;
	
	void HandleRequest(LeaveRequest leaveRequest);
	
}