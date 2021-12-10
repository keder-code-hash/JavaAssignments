package in.design_pattern.AbsFactoryPat_10_3;

public class FactoryProducer {

	public static AbstractFactory getFactory(String prd) {
		if(prd=="Product") {
			return new BrickFactory();
		}
		else {
			return null;
		}
	}

}
