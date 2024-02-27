package view;
import controller.MultiplyController;
public class Principal {

	public static void main(String[] args) {
		
		MultiplyController mc = new MultiplyController();
		
		int a = 70;
		int b = 322;
		
		System.out.println("Resultado igual a: " + mc.fnMult(a, b));
		
	}
	
}
