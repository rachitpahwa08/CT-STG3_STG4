package handson4chainofresponsiblity;
public class Program {

	public static void main(String[] args) {
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setEmployeeName("Test");
		leaveRequest.setLeaveDays(6);
		ILeaveRequestHandler supervisor=new Supervisor();
		supervisor.HandleRequest(leaveRequest);
	}

}