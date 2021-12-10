package in.design_pattern.AbsFactoryPat_10_3;

public class RectangularBrick implements Product{
	public float height;
	public float width; 
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float computeArea() {
		return this.height*this.width;
	}

	public void enlarge() {
		this.height+=1f;
		this.width+=1f;
	}

	public void shrink() {
		if(this.height>0f) {
			this.height-=1f;
		}
		if(this.width>0f) {
			this.width-=1f;
		}
	}
	
}
