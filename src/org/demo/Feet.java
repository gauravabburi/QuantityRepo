package org.demo;

public class Feet extends Length {

	private double value;
	private static final double BASE_CONVERSION_FACTOR = 304.80d;

	@Override
	public double convertToBaseValue() {
		return this.value * BASE_CONVERSION_FACTOR;
	}

	@Override
	public boolean equals(Object obj) {
		Feet feet = (Feet) obj;
		return (Math.abs(((double)this.convertToBaseValue() - (double)feet.convertToBaseValue())) < 0.0001);
	}

	public Feet(double value) {
		this.value = value;
	}

	public static Feet convertLengthToFeet(Length length) {
		return new Feet(length.convertToBaseValue() / BASE_CONVERSION_FACTOR);
	}
	
	public Feet add(Length length) {
		Feet result = new Feet((length.convertToBaseValue() / BASE_CONVERSION_FACTOR) + this.value);
		return result;
	}
	
}
