package org.demo;

public class Mile extends Length {

	private double value;
	private static final double BASE_CONVERSION_FACTOR = 1600000;

	@Override
	public double convertToBaseValue() {
		return this.value * BASE_CONVERSION_FACTOR;
	}

	@Override
	public boolean equals(Object obj) {
		Mile mile = (Mile) obj;
		return (Math.abs(((double)this.convertToBaseValue() - (double)mile.convertToBaseValue())) < 0.0001);
	}

	public Mile(double value) {
		this.value = value;
	}
	
	public static Mile convertLengthToMile(Length length) {
		return new Mile(length.convertToBaseValue() / BASE_CONVERSION_FACTOR);
	}

	public Mile add(Length length) {
		Mile result = new Mile((length.convertToBaseValue() / BASE_CONVERSION_FACTOR) + this.value);
		return result;
	}
	
}
