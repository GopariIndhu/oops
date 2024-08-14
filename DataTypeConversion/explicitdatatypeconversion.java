package Java;

public class explicitdatatypeconversion {

	public static void main(String[] args) {
		double a = 40.40;
		System.out.println("Double representation: " + a);
		
		float f = (float)a;
		System.out.println("Float representation: " + f);
		
		long b = (long)a;
		System.out.println("Long representation: " + b);
		
		int c = (int)a;
		System.out.println("Int representation: " + c);
	}
}
