package mypackage;
import java.util.function.*;
import java.lang.Math;

public class QuadraticEquation implements Function<double[], double[]>{

	@Override
	public double[] apply(double[] input){
		double nom1 = (- input[1]) + Math.sqrt(Math.pow(input[1],2) - 4*input[0]*input[2]);
		double nom2 = (- input[1]) - Math.sqrt(Math.pow(input[1],2) - 4*input[0]*input[2]);
		double denom = 2*input[0];

		return new double[]{nom1/denom, nom2/denom};
	}

	public static void main(String[]args){
		QuadraticEquation computer = new QuadraticEquation();
		double[] ans = computer.apply(new double[]{1.0,7.0,10.0});

		System.out.println(ans[0]);
		System.out.println(ans[1]);

	}
}