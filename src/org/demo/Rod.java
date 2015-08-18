package org.demo;

public class Rod extends Length {

	private double value;
	private static final double BASE_CONVERSION_FACTOR = 1847.2727d;

	@Override
	public double convertToBaseValue() {
		return this.value * BASE_CONVERSION_FACTOR;
	}

	@Override
	public boolean equals(Object obj) {
		Rod rod = (Rod) obj;
		return (Math.abs(((double)this.convertToBaseValue() - (double)rod.convertToBaseValue())) < 0.0001);
	}

	public Rod(double value) {
		this.value = value;
	}
	
	public static Rod convertLengthToRod(Length length) {
		return new Rod(length.convertToBaseValue() / BASE_CONVERSION_FACTOR);
	}
	
	public Rod add(Length length) {
		Rod result = new Rod((length.convertToBaseValue() / BASE_CONVERSION_FACTOR) + this.value);
		return result;
	}

}
