package mypackage;

import java.util.function.Consumer;

public class QuadraticEquation implements Consumer<double[]> {
	private double root1;
	private double root2;
	private double rootsImg;

	public QuadraticEquation() {
		root1 = 0;
		root2 = 0;
		rootsImg = 0;
	}

	@Override
	public void accept(double[] arr) {
		double d = Math.pow(arr[1], 2) - (4 * arr[0] * arr[2]);
		if (d > 0.0) {
			root1 = clacRoot(arr, d, true);
			root2 = clacRoot(arr, d, false);
		} else if (d == 0) {
			root1 = clacRoot(arr, d, true);
			root2 = root1;
		} else {
			d = 2 * arr[0];
			root1 = -arr[1] / d;
			root2 = root1;
			rootsImg = Math.sqrt(Math.abs(d)) / d;
		}
	}

	private Double clacRoot(double[] arr, Double d, boolean t) {
		if (t)
			return (-arr[1] + Math.sqrt(d)) / (2 * arr[0]);
		return (-arr[1] - Math.sqrt(d)) / (2 * arr[0]);
	}

	public void printResult() {
		if (rootsImg == 0) {
			if (root1 == root2)
				System.out.println("root is " + root1);
			else {
				System.out.println("root 1 is " + root1);
				System.out.println("root 2 is " + root2);
			}

		} else {
			System.out.println("root 1 is Complex : " + root1 + " + i " + rootsImg);
			System.out.println("root 2 is Complex : " + root2 + " - i" + rootsImg);
		}
	}
}