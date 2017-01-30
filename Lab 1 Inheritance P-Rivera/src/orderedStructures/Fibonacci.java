package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
		if(!super.isFirstlyExecuted){ throw new IllegalStateException("nextValue: IllegalState - firstValue hasn't been executed."); }
        // add the necessary code here...
		current += this.prev;
		prev = current - prev;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}
	
	@Override
	public double getTerm(int n){
		if (n <= 0) throw new IndexOutOfBoundsException("getTerm: Invalid argument value = " + n); 
		return Math.floor((1/Math.sqrt(5))*(Math.pow((1+Math.sqrt(5))/2, n) - Math.pow((1-Math.sqrt(5))/2, n)));
	}

}
