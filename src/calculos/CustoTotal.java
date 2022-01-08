package calculos;

public class CustoTotal {
	
	private double cf;
	private double cv;
	private double km;
	

	public CustoTotal(double cf, double cv, double km) {
		this.cf = cf;
		this.cv = cv;
		this.km = km;
	}


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	public double getCf() {
		return cf;
	}


	public void setCf(double cf) {
		this.cf = cf;
	}


	public double getCv() {
		return cv;
	}


	public void setCv(double cv) {
		this.cv = cv;
	}
	
	public double custoTotal() {
		
		return (cf + cv) / km;
	}
	
	
	
	

}
