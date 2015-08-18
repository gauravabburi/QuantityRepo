package org.demo;

public class Kilometer extends Length {

	private double value;
	private static final double BASE_CONVERSION_FACTOR = 1000000;

	@Override
	public double convertToBaseValue() {

		return this.value * BASE_CONVERSION_FACTOR;
	}

	@Override
	public boolean equals(Object obj) {
		Kilometer kilometer = (Kilometer) obj;
		return (Math.abs(((double)this.convertToBaseValue() - (double)kilometer.convertToBaseValue())) < 0.0001);
	}

	public Kilometer(double value) {
		this.value = value;
	}
	
	public static Kilometer convertLengthToKilometer(Length length) {
		return new Kilometer(length.convertToBaseValue() / BASE_CONVERSION_FACTOR);
	}
	
	public Kilometer add(Length length) {
		Kilometer result = new Kilometer((length.convertToBaseValue() / BASE_CONVERSION_FACTOR) + this.value);
		return result;
	}

}
