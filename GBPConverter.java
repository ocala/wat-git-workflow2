
public class GBPConverter implements CurrencyConverter{

	public Currency convert(Currency source, Currency destination, double value){
		Currency pound_sterling = new Currency("United Kingdom", source.getValue(), 1,4863);

		retrun pound_sterling;
	}
}