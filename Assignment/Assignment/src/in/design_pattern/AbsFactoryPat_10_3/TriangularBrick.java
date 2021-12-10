package in.design_pattern.AbsFactoryPat_10_3;

public class TriangularBrick implements Product{
	public float breadth;
	public float height; 
	public float computeArea() {
		return (height*breadth)/2;
	} 
	public void enlarge() {
		this.height+=1f;
		this.breadth+=1f;
	} 
	public void shrink() { 
		this.height-=1f;
		this.breadth-=1f;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
}
