package example;

import java.util.List;

import example.taxes.Tax;

public class TaxCalculator {
	
	private List<Tax> taxes;
	
	public TaxCalculator(List<Tax> taxes) {
		this.taxes = taxes;
	}
	
	public Double calc(Double value) {
		Double taxValue = 0.0;
		for(Tax tax : taxes) {
			taxValue += tax.calc(value);
		}
		return taxValue;
	}
}
