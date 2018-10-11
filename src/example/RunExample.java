package example;

import java.util.ArrayList;
import java.util.List;

import example.taxes.Tax;
import example.taxes.TaxAImpl;
import example.taxes.TaxBImpl;
import example.taxes.TaxCImpl;
import example.taxes.TaxSpecialImpl;

public class RunExample {
	
	public static void main(String[] args) {
		calcTaxToProduct();
		calcTaxToService();
		calcTaxToSpecialProduct();
	}

	private static void calcTaxToService() {
		List<Tax> serviceTaxes = new ArrayList<Tax>();
		serviceTaxes.add(new TaxAImpl());
		serviceTaxes.add(new TaxCImpl());
		System.out.println("Service tax value: " + new TaxCalculator(serviceTaxes).calc(100.0));
	}

	private static void calcTaxToProduct() {
		List<Tax> productTaxes = new ArrayList<Tax>();
		productTaxes.add(new TaxAImpl());
		productTaxes.add(new TaxBImpl());
		System.out.println("Product tax value: " + new TaxCalculator(productTaxes).calc(100.0));
	}
	
	private static void calcTaxToSpecialProduct() {
		List<Tax> productTaxes = new ArrayList<Tax>();
		productTaxes.add(new TaxSpecialImpl());
		System.out.println("Special Product tax value: " + new TaxCalculator(productTaxes).calc(100.0));
	}
}
