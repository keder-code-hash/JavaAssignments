package in.design_pattern.AbsFactoryPat_10_3;

public class CircularBrick implements Product{
	public float radius;
 
 
	public float computeArea() { 
		return (float)(3.14*Math.pow(2, this.radius));
	}
 
	public void enlarge() { 
		this.radius+=1f;
	}
 
	public void shrink() { 
		this.radius-=1f;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
}
