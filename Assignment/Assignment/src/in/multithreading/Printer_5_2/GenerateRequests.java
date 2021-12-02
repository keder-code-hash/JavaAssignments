package in.multithreading.Printer_5_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateRequests extends Thread{
	public UserRequests request=null;
	public int totalUserReq;
	
	public GenerateRequests(int numberReq) {
		this.totalUserReq=numberReq;
	}
	
	public void generatePrintReq() {
		int pageNo = 4;
//		System.out.println("Enter the page Numnber : ");
//		try {
//			BufferedReader bfReader=new BufferedReader(new InputStreamReader(System.in));
//			pageNo=Integer.parseInt(bfReader.readLine());
//			bfReader.close();
//		} catch (NumberFormatException | IOException e) { 
//			e.printStackTrace();
//		} 
		UserRequests requests=new UserRequests(pageNo);
		request=requests;
	}
	public void run() { 
		for(int i=0;i<this.totalUserReq;i++) {
			this.generatePrintReq(); 
			if(this.request.pageNo>5) {
				System.out.println("page limit exeeds.");
			}
			else {
				Printer p1=new Printer(this.request.getReqId(),this.request.pageNo);
				p1.start();
				System.out.println(p1.getState());
				try {
					p1.join();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println(p1.getState());
			} 
		}	
	}
}
