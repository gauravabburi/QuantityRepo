package org.demo;

public class UnitConversion {
	
	private final double BASE_TO_METERS_CONVERSION = 1000;
	private final double BASE_TO_CENTIMETERS_CONVERSION = 10;
	private final double BASE_TO_KILOMETER_CONVERSION = 1000000;
	private final double BASE_TO_FEET_CONVERSION = 304.80d;
	private final double BASE_TO_INCH_CONVERSION = 2540;
	private final double BASE_TO_MILE_CONVERSION = 1600000;
	private final double BASE_TO_MILLIMETER_CONVERSION = 1;
	private final double BASE_TO_ROD_CONVERSION = 1847.2727d;
	private final double BASE_TO_YARD_CONVERSION = 10000;
	
	
	public Meter convertToMeter(Length length_cm) {
		return new Meter(length_cm.convertToBaseValue() / BASE_TO_METERS_CONVERSION);
	}
	
	public Centimeter convertToCentimeter(Length length_m) {
		return new Centimeter(length_m.convertToBaseValue() / BASE_TO_CENTIMETERS_CONVERSION);
	}
	
	public Kilometer convertToKilometer(Length length_km) {
		return new Kilometer(length_km.convertToBaseValue() / BASE_TO_KILOMETER_CONVERSION);
	}
	
	public Feet convertToFeet(Length length_ft) {
		//System.out.println("feet: " + (length_ft.convertToBaseValue() / BASE_TO_FEET_CONVERSION));
		return new Feet(((length_ft.convertToBaseValue() / BASE_TO_FEET_CONVERSION)));
	}
	
	public Inch convertToInch(Length length_in) {
		System.out.println("inch: " + (length_in.convertToBaseValue() / BASE_TO_INCH_CONVERSION));
		return new Inch(length_in.convertToBaseValue() / BASE_TO_INCH_CONVERSION);
	}
	
	public Mile convertToMile(Length length_mi) {
		return new Mile(length_mi.convertToBaseValue() / BASE_TO_MILE_CONVERSION);
	}
	
	public Millimeter convertToMillimeter(Length length_mm) {
		return new Millimeter(length_mm.convertToBaseValue() / BASE_TO_MILLIMETER_CONVERSION);
	}
	
	public Rod convertToRod(Length length_rod) {
		return new Rod(length_rod.convertToBaseValue() / BASE_TO_ROD_CONVERSION);
	}
	
	public Yard convertToYard(Length length_yd) {
		return new Yard(length_yd.convertToBaseValue() / BASE_TO_YARD_CONVERSION);
	}
}
