package mypackage;

public class Lab {
	public static void main(String args[]) {
		taskOne();
		//taskThree();
	}

	public static void taskOne() {
		TemperatureConvert Tc = new TemperatureConvert();
		System.out.println("Temp in C is " + 15);
		System.out.println("Temp in F is " + Tc.apply(15f));
	}



	public static void taskThree() {
		double[] co = { 1.0, -2.0, 1.0 };
		QuadraticEquation qe = new QuadraticEquation();
		qe.accept(co);
		qe.printResult();
	}

}