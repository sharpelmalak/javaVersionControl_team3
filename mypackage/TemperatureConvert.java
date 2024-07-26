package mypackage;

import java.util.function.UnaryOperator;

public class TemperatureConvert implements UnaryOperator<Float> {

	@Override
	public Float apply(Float t) {
		return ((9.0f/5)*t + 32); // Haroun changed here 
	}

}
