package in.design_pattern.AbsFactoryPat_10_3;

public class BrickFactory extends AbstractFactory{

	public Product factory(String type) {
		if(type=="Rectangle") {
			return new RectangularBrick();
		}
		else if(type=="Triangle") {
			return new TriangularBrick();
		}
		else if(type=="Circle") {
			return new CircularBrick();
		}
		else {
			return null;
		} 
	}

}
