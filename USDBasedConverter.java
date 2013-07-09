
public class USDBasedConverter implements CurrencyConverter{

	public Currency convert(Currency source, Currency destination, double value){
		double sourceToUSD = (source.getValue()*source.getValueUSD());
                double sUSDtoDest  = sourceToUSD/destination.getValueUSD();
                destination.setValue(sUSDtoDest);
		return destination;
	}
}
