package handson4chainofresponsiblity;
public class HR implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler=null;
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		int ld=leaveRequest.getLeaveDays();
		if(ld>5)
		System.out.println("Leave Approved By HR for :: "+leaveRequest.getEmployeeName());
	}

}