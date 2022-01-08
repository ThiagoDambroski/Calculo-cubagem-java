package calculos;

public class TaxaDeFrete extends CustoTotal {
	
	private double taxa;

	public TaxaDeFrete(double cf, double cv, double km,double taxa) {
		super(cf, cv,km);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double taxaDeFrete() {
		double comTaxa = custoTotal() * (taxa/100);
		return custoTotal() + comTaxa;
	}

}
