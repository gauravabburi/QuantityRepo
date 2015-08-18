package org.demo;

public class Millimeter extends Length {

	private double value;
	private static final double BASE_CONVERSION_FACTOR = 1;

	@Override
	public double convertToBaseValue() {
		return this.value * BASE_CONVERSION_FACTOR;
	}

	@Override
	public boolean equals(Object obj) {
		Millimeter millimeter = (Millimeter) obj;
		return (Math.abs(((double)this.convertToBaseValue() - (double)millimeter.convertToBaseValue())) < 0.0001);
	}

	public Millimeter(double value) {
		this.value = value;
	}
	
	public static Millimeter convertLengthToMillimeter(Length length) {
		return new Millimeter(length.convertToBaseValue() / BASE_CONVERSION_FACTOR);
	}
	
	public Millimeter add(Length length) {
		Millimeter result = new Millimeter((length.convertToBaseValue() / BASE_CONVERSION_FACTOR) + this.value);
		return result;
	}

}
