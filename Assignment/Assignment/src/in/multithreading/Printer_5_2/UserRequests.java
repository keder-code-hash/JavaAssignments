package in.multithreading.Printer_5_2;

public class UserRequests{
	private static int genId=0;
	private int id;
	public int pageNo;
	public UserRequests(int pageNo) {
		this.id=++genId;
		this.pageNo=pageNo;
	}
	public int getReqId() {
		return id;
	}  
}
