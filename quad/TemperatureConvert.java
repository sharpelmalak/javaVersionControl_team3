package mypackage;

import java.util.function.Function;

public class TemperatureConvert implements Function<Float,Float>
{
	@Override
	public Float apply(Float t)
	{
		return 1.8f * t + 32;
	}
}


