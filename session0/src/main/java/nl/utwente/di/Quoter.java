package nl.utwente.di;

import java.util.HashMap;

public class Quoter {
	HashMap<String, Double> prices = new HashMap<String, Double>();
	
	public Quoter() {
		prices.put("1", 10.0);
		prices.put("2", 45.0);
		prices.put("3", 20.0);
		prices.put("4", 35.0);
		prices.put("5", 50.0);
	}
	
	public double getBookPrice(String book){
		return prices.containsKey(book) ? prices.get(book) : 0.0;
	}
}
