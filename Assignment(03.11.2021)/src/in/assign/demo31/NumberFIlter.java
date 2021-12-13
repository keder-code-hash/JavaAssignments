package in.assign.demo31;

/**
 * string =Hello world1245
 * char[] filterOut=1,2,3,4,5,6,7,8,9,0
 * 
 * 
 * */
public class NumberFIlter implements FilterInterface{
	public String filter(String str,char[] filterOut) {
//		for(char ch:filterOut) {
//			str=str.replaceAll(ch+"","");
//		}
		int flag=0;
		String resultString="";
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<filterOut.length;j++) {
				if(str.charAt(i)==filterOut[j]) {
					flag=1;
				}
			}
			if(flag==0) {
				resultString+=str.charAt(i);
			}
		}
		return resultString;
		/**
		 * c1==c2
		 * flga=1;
		 * flag=0
		 * 
		 * */
//		return str;
	}

}
