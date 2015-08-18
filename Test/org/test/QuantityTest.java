package org.test;
import static org.junit.Assert.*;


import org.demo.Centimeter;
import org.demo.Feet;
import org.demo.Inch;
import org.demo.Kilometer;
import org.demo.Meter;
import org.demo.Mile;
import org.demo.QuantityEqual;
import org.demo.UnitConversion;
import org.demo.Yard;
import org.junit.Test;


public class QuantityTest {
	
	QuantityEqual test = new QuantityEqual();
	UnitConversion convert = new UnitConversion();
	Meter meter = new Meter(1);
	
	@Test
	public void bothQuantitiesSame() {
		
		assertEquals(true, test.isEqual(new Centimeter(100), new Meter(1)));
	}
	
	@Test
	public void bothQuantitiesUnequal() {
		assertNotEquals(false,  test.isEqual(new Centimeter(100), new Meter(1)));
	}
	
	/*@Test
	public void correctConversionIntoMeters() {
		Meter meter = new Meter(1);
		assertEquals(true, meter.equals(convert.convertToMeter(new Centimeter(100))));
	}
	
	@Test
	public void incorrectConversionIntoCentimeters() {
		Meter meter = new Meter(2);
		assertNotEquals(true, meter.equals(convert.convertToMeter(new Centimeter(100))));
	}
	
	@Test
	public void correctConversionIntoCentimeters() {
		Centimeter centimeter = new Centimeter(100);
		assertEquals(true, centimeter.equals(convert.convertToCentimeter(new Meter(1))));
	}
	
	@Test
	public void incorrectConversionIntoMeters() {
		Centimeter centimeter = new Centimeter(200);
		assertNotEquals(true,  centimeter.equals(convert.convertToCentimeter(new Meter(1))));
	}
	
	@Test
	public void correctConversionToFeet() {
		Feet feet = new Feet((double) (1 / 0.30480));
		assertEquals(true,  feet.equals(convert.convertToFeet(meter)));
	}
	
	@Test
	public void correctConversionToMeter() {
		Meter meter = new Meter(1);
		assertEquals(true, meter.equals(convert.convertToMeter(meter)));
	}
	
	@Test
	public void correctConversionToKilometer() {
		Kilometer kilometer = new Kilometer((double) (1 / 1000));
		assertEquals(true, kilometer.equals(convert.convertToKilometer(meter)));
	}
	
	@Test
	public void correctConversionToMile() {
		Mile mile = new Mile((double) ( 1 / (1000 * 1.6)));
		assertEquals(true, mile.equals(convert.convertToMile(meter)) );
	}
	
	@Test
	public void correctConversionToInch() {
		Inch inch = new Inch((double) (1 / (0.30480 * 12)));
		assertEquals(true,  inch.equals(convert.convertToInch(meter)));
	}*/
	
	/*@Test
	public void shouldCorrectlyConvertFromMetersToKilometers() {
		Kilometer kilometer = new Kilometer(1);
		assertEquals(true, kilometer.equals(convert.convertToKilometer(new Meter(1000))));
	}
	
	@Test
	public void shouldCorrectlyConvertFromYardToRod() {
		
	}*/
	
	@Test
	public void shouldAddMeterYardAndGiveResultInYard() {
		Meter meter = new Meter(16);
		Yard yard = new Yard(1);
		Yard result = new Yard(2.6);
		assertEquals(true,  result.equals(yard.add(meter)));
	}
	
	@Test
	public void shouldAddYardMeterAndGiveResultInYard() {
		/*Feet feet = new Feet(5280);
		Mile mile = new Mile(1);
		Mile result = new Mile(2);
		assertEquals(true, result.equals(mile.add(feet)));*/
		Meter meter = new Meter(10);
		Yard yard = new Yard(1.6);
		Meter result = new Meter(26);
		assertEquals(true,  result.equals(meter.add(yard)));
	}
	
	
	
	

}
