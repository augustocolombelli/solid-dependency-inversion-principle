### SOLID - Dependency Inversion Principle (DIP)
Simple example using Dependency Inversion Principle.

#### How can we use this principle?
We need to find the abstractions and invert the dependencies. Class dependencies must be with abstractions, reducing the level of coupling.

Abstractions are more stable and with less changes. Fewer changes reduce the chances of creating new bugs.

If Class A depends Class B, Class B should be more stable that Class A. If Class B depends Class C, Class C should be more stable that Class B.

In our example, we have TaxCalculator responsible for applying all taxes in value. This Class only depends on a list of Interface.

```
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
```
In real life, it is possible to have a list of taxes for a Product and a different list of taxes for a Service. In our example, we can use TaxCalculator in both, it is only necessary to define which taxes to apply.
```
private static void calcTaxToService() {
  List<Tax> serviceTaxes = new ArrayList<Tax>();
  serviceTaxes.add(new TaxAImpl());
  serviceTaxes.add(new TaxCImpl());
}

private static void calcTaxToProduct() {
  List<Tax> productTaxes = new ArrayList<Tax>();
  productTaxes.add(new TaxAImpl());
  productTaxes.add(new TaxBImpl());
}
```

This dependency only with abstractions, allows to use TaxCalculator in different parts of our system. Imagine if the user wants another feature in our system that calculates the tax for an especial product, for example, a medicine or a weapon. We can create a new concrete class that implements Tax with the new rule, after which we call TaxCalculator using this new Tax.
```
public class TaxSpecialImpl implements Tax {

  public Double calc(Double value) {
    return value * 0.01;
  }
}

```
```
private static void calcTaxToSpecialProduct() {
  List<Tax> productTaxes = new ArrayList<Tax>();
  productTaxes.add(new TaxSpecialImpl());
}
```

#### Class Diagram



