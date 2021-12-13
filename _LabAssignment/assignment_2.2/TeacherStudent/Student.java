public class Student extends Person {
	String stream;
	String course;
	Student(String name, String phNo,String stream,String course) {
		super( phNo,name,"student");
		this.stream=stream;
		this.course=course;
	}

	public String toString() {
        return "\nName-> "+name+"\nphNo->"+phNo+"\nStream->"+this.stream+"\ncourse->"+this.course+"\ntype->"+type;
    } 
	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public String getPhNo() {
		return this.phNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	
}