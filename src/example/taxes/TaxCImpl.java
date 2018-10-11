package example.taxes;

public class TaxCImpl implements Tax {

	public Double calc(Double value) {
		return value * 0.06;
	}

}
