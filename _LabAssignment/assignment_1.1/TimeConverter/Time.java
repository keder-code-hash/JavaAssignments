
public class Time {
	int hour;
	int minute;
	int second;


	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	} 
	
	String convert() {
		int convertedHour=0;
		String check="";
		if(hour>=12) {
			convertedHour=hour-12;
			check="PM";
		}
		else if(hour==0) {
			convertedHour=12;
			check="AM";
		}
		else {
			convertedHour=hour;
			check="AM";
		}
		String actualTime=convertedHour+":"+minute+":"+second+" "+check;
		return actualTime;
	}
}
