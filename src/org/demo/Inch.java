package org.demo;

public class Inch extends Length {

	private double value;
	private static final double BASE_CONVERSION_FACTOR = 2540;

	@Override
	public double convertToBaseValue() {
		return this.value * BASE_CONVERSION_FACTOR;
	}

	@Override
	public boolean equals(Object obj) {
		Inch inch = (Inch) obj;
		return (Math.abs(((double)this.convertToBaseValue() - (double)inch.convertToBaseValue())) < 0.0001);
	}

	public Inch(double value) {
		this.value = value;
	}
	
	public static Inch convertLengthToInch(Length length) {
		return new Inch(length.convertToBaseValue() / BASE_CONVERSION_FACTOR);
	}
	
	public Inch add(Length length) {
		Inch result = new Inch((length.convertToBaseValue() / BASE_CONVERSION_FACTOR) + this.value);
		return result;
	}

}
