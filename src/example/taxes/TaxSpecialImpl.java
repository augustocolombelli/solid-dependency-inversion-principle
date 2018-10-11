package example.taxes;

public class TaxSpecialImpl implements Tax {

	public Double calc(Double value) {
		return value * 0.01;
	}
}
