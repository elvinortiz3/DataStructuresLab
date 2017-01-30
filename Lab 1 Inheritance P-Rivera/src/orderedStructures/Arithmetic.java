package orderedStructures;

import java.security.InvalidParameterException;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if(!super.isFirstlyExecuted){ throw new IllegalStateException("nextValue: IllegalState - firstValue hasn't been executed."); }
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString(){ return "Arith("+(int)super.firstValue()+", "+(int)this.commonDifference+")"; }

	@Override
	public double getTerm(int n){
		if (n <= 0) throw new IndexOutOfBoundsException("getTerm: Invalid argument value = " + n); 
		return super.firstValue() + this.commonDifference*(n-1);
	}
}
