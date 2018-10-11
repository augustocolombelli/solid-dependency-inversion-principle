package example;

import java.util.ArrayList;
import java.util.List;

import example.taxes.Tax;
import example.taxes.TaxAImpl;
import example.taxes.TaxBImpl;
import example.taxes.TaxCImpl;

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
	
	public static void main(String[] args) {
		
		List<Tax> productTaxes = new ArrayList<Tax>();
		productTaxes.add(new TaxAImpl());
		productTaxes.add(new TaxBImpl());
		
		List<Tax> serviceTaxes = new ArrayList<Tax>();
		serviceTaxes.add(new TaxAImpl());
		serviceTaxes.add(new TaxCImpl());

		System.out.println("Product tax value: " +new TaxCalculator(productTaxes).calc(100.0));
		System.out.println("Service tax value: " +new TaxCalculator(serviceTaxes).calc(100.0));
		
	}
}
