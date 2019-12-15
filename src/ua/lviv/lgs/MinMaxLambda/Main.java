package ua.lviv.lgs.MinMaxLambda;

public class Main {

	public static void main(String[] args) {

		Wrappers<Float> floatMax = () -> Float.MAX_VALUE;
		Wrappers<Float> floatMin = () -> Float.MIN_VALUE;

		Wrappers<Double> doubleMax = () -> Double.MAX_VALUE;
		Wrappers<Double> doubleMin = () -> Double.MIN_VALUE;

		System.out.println("Float Maximum=" + floatMax.value());
		System.out.println("Float Minimum=" + floatMin.value());
		System.out.println("Double Maximum=" + doubleMax.value());
		System.out.println("Double Minimum=" + doubleMin.value());

	}

}
