package org.demo;

public class QuantityEqual {

	/*public Length length_cm;
	public Length length_m;
	
	public QuantityEqual(Length length_cm, Length length_m) {
		this.length_cm = length_cm;
		this.length_m = length_m;
		
	}*/

	

	public boolean isEqual(Length length1, Length length2) {
		if (length1.convertToBaseValue() == length2.convertToBaseValue()) 
			return true;
		else
			return false;
	}
	
}
