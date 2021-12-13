class Teacher extends Person {
	String sub;
	Teacher(String name, String phNo,String sub) {
		super(phNo, name,"teacher");
		this.sub=sub;
	}

	public String toString() {
        return "\nName-> "+name+"\nphNo->"+phNo+"\nSubject->"+this.sub+"\ntype->"+type;
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

	public void setphNo(String phNo) {
		this.phNo = phNo;
	}
}