class Triangle extends Shape{
	int height;
	int breadth;
	static float result;
	Triangle(int height,int breadth){
		this.height=height;
		this.breadth=breadth;
	}
	void calculateArea(){
		result=(height*breadth)/2;
	}
	void display(){
		System.out.println(result);
	}
}