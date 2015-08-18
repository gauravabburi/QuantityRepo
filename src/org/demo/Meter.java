package org.demo;

public class Meter extends Length{

	private double value;
	private static final double BASE_CONVERSION_FACTOR = 1000;
	
	public Meter(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}

	@Override
	public double convertToBaseValue() {
		return ((this.value) * BASE_CONVERSION_FACTOR);
	}
	
	@Override
	public boolean equals(Object obj) {
		Meter meter = (Meter) obj;
		return (Math.abs(((double)this.convertToBaseValue() - (double)meter.convertToBaseValue())) < 0.0001);
	}
	
	public static Meter convertLengthToMeter(Length length) {
		return new Meter(length.convertToBaseValue() / BASE_CONVERSION_FACTOR);
	}
	
	public Meter add(Length length) {
		Meter result = new Meter((length.convertToBaseValue() / BASE_CONVERSION_FACTOR) + this.value);
		return result;
	}
	
}
