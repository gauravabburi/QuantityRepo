package org.demo;

public class Yard extends Length {

	private double value;
	private static final float BASE_CONVERSION_FACTOR = 10000;

	@Override
	public double convertToBaseValue() {
		return this.value * BASE_CONVERSION_FACTOR;
	}

	@Override
	public boolean equals(Object obj) {
		Yard yard = (Yard) obj;
		return (Math.abs(((double)this.convertToBaseValue() - (double)yard.convertToBaseValue())) < 0.0001);
	}

	public Yard(double value) {
		this.value = value;
	}
	
	public static Yard convertLengthToYard(Length length) {
		return new Yard(length.convertToBaseValue() / BASE_CONVERSION_FACTOR);
	}
	
	public Yard add(Length length) {
		Yard result = new Yard((length.convertToBaseValue() / BASE_CONVERSION_FACTOR) + this.value);
		return result;
	}

}
