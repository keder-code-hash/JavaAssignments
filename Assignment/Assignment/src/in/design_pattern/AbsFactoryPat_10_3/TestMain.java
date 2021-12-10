package in.design_pattern.AbsFactoryPat_10_3;

public class TestMain {

	public static void main(String[] args) {
		AbstractFactory getFactoryProducer=FactoryProducer.getFactory("Product");
		
		Product brickProduct=getFactoryProducer.factory("Rectangle");
		
		RectangularBrick rectangularBrick=(RectangularBrick)brickProduct;
		rectangularBrick.setHeight(23.4f);
		rectangularBrick.setWidth(12.34f);
		System.out.println(rectangularBrick.computeArea());
		rectangularBrick.enlarge();
		System.out.println(rectangularBrick.computeArea());
	}

}
