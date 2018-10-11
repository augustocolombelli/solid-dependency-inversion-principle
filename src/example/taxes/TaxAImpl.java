package example.taxes;

public class TaxAImpl implements Tax {

	public Double calc(Double value) {
		return value * 0.1;
	}

}
