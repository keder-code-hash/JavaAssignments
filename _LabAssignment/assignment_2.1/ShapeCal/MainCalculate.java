class MainCalculate{
	public static void main(String[] args){
		Rectangle rec=new Rectangle(12,23);
		rec.calculateArea();
		rec.display();
		
		Triangle tri=new Triangle(12,23);
		tri.calculateArea();
		tri.display();
	}
}