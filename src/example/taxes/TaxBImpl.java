package example.taxes;

public class TaxBImpl implements Tax {

	public Double calc(Double value) {
		return value * 0.05;
	}
}
