package org.demo;

public class Centimeter extends Length {

	private double value;
	private static final double BASE_CONVERSION_FACTOR = 10;

	@Override
	public boolean equals(Object obj) {
		Centimeter centimeter = (Centimeter) obj;
		return (Math.abs(((double)this.convertToBaseValue() - (double)centimeter.convertToBaseValue())) < 0.0001);
	}

	public Centimeter(double value) {
		this.value = value;
	}

	@Override
	public double convertToBaseValue() {
		return ((this.value) * BASE_CONVERSION_FACTOR);
	}
	
	public static Centimeter convertLengthToCentimeter(Length length) {
		return new Centimeter(length.convertToBaseValue() / BASE_CONVERSION_FACTOR);
	}
	
	public Centimeter add(Length length) {
		Centimeter result = new Centimeter((length.convertToBaseValue() / BASE_CONVERSION_FACTOR) + this.value);
		return result;
	}

}
