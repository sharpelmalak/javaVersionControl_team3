package mypackage;

import java.util.function.Function;


public class TemperatureConvert implements Function<Float, Float> {
	@Override
	public Float apply(Float t) {
		return ((9.0f/5)*t + 32); // Haroun changed here 
	}
}
