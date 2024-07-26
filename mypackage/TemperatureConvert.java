package mypackage;

import java.util.function.UnaryOperator;

public class TemperatureConvert implements UnaryOperator<Float> {

	@Override
	public Float apply(Float t) {
		return 1.8f * t + 32;
	}

}
