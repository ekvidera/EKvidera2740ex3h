package ekvidera2740ex3h;

public class Rainfall {
	private double[] rainfallArray;
	
	public Rainfall(double[] rainfall) {
		rainfallArray = new double[rainfall.length];
		for (int i=0; i<rainfall.length; i++) {
			rainfallArray[i] = rainfall[i];
		}
	}
	
	public Rainfall(String[] rainfall) {
		rainfallArray = new double[rainfall.length];
		for (int i=0; i<rainfall.length; i++) {
			rainfallArray[i] = Double.parseDouble(rainfall[i]);
		}
	}
	
	public double getTotal() {
		double total = 0;
		for (int i=0; i<rainfallArray.length; i++) {
			total = total + rainfallArray[i];
		}
		return total;
	}
	
	public double getAverage() {
		return (this.getTotal() / rainfallArray.length);
	}
	
	public double getHighest() {
		double highest = rainfallArray[0];
		for (int i=1; i<rainfallArray.length; i++) {
			if (rainfallArray[i] > highest) {
				highest = rainfallArray[i];
			}
		}
		return highest;
	}
	
	public double getLowest() {
		double lowest = rainfallArray[0]; 
		for (int i=1; i<rainfallArray.length; i++) {
			if (rainfallArray[i] < lowest) {
				lowest = rainfallArray[i];
			}
		}
		return lowest;
	}
}
