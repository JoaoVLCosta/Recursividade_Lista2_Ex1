package controller;

public class MultiplyController {

	public MultiplyController() {
		
		super();
	
	}
	
	public int fnMult(int a, int b) {
		
		if(b == 1) {
			
			return a;
			
		} else {
			
			return a + fnMult(a, b - 1);
			
		}
		
	}
	
}