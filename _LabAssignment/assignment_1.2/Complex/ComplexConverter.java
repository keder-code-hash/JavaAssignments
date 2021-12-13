
public class ComplexConverter extends ComplexNum{
	ComplexNum comp1=new ComplexNum();
	ComplexNum comp2=new ComplexNum();
	ComplexNum res=new ComplexNum();
	
	
	public ComplexConverter(ComplexNum comp1, ComplexNum comp2) {
		this.comp1 = comp1;
		this.comp2 = comp2;
	}

	void addition() {
		//ComplexNum res=new ComplexNum();
		this.res.complexPart=comp1.complexPart+comp2.complexPart;
		this.res.realPart=comp2.realPart+comp1.realPart;
		
		//return res;
	}
	
	void substraction() {
		//ComplexNum res=new ComplexNum();
		this.res.complexPart=comp1.complexPart-comp2.complexPart;
		this.res.realPart=comp1.realPart-comp2.realPart;
		
		//return res;
	}
	
	void multiplication() {
		//ComplexNum res=new ComplexNum();
		
		this.res.realPart=(comp1.realPart*comp2.realPart) - (comp1.complexPart*comp2.complexPart);
		this.res.complexPart=(comp1.complexPart*comp2.realPart) + (comp1.realPart*comp2.complexPart);
		
		//return res;
	}
}
