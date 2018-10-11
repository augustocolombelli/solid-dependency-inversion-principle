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


#### Class Diagram



