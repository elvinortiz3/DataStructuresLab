package orderedStructures;

import java.security.InvalidParameterException;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if(!super.isFirstlyExecuted){ throw new IllegalStateException("nextValue: IllegalState - firstValue hasn't been executed."); }
		current = current * commonFactor; 
		return current;
	}
	
	@Override
	public String toString(){ return "Geom("+(int)super.firstValue()+", "+(int)this.commonFactor+")"; }
	
	@Override
	public double getTerm(int n){
		if (n <= 0) throw new IndexOutOfBoundsException("getTerm: Invalid argument value = " + n); 
		return super.firstValue()*Math.pow(this.commonFactor, n-1);
	}

}
