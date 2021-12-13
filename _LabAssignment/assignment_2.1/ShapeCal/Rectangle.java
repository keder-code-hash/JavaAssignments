class Rectangle extends Shape{
	int height;
	int breadth;
	static int result;
	Rectangle(int height,int breadth){
		this.height=height;
		this.breadth=breadth;
	}
	void calculateArea(){
		result=height*breadth;
	}
	void display(){
		System.out.println(result);
	}
}

