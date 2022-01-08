package calculos;

public class Produtividade {
	
	private double km;
	private int dia;
	private double horas;
	private double descarga;
	private double carga;
	
	
	public Produtividade(double km, int dia, double horas, double descarga, double carga) {
		this.km = km;
		this.dia = dia;
		this.horas = horas;
		this.descarga = descarga;
		this.carga = carga;
	}
	
	public double getDescarga() {
		return descarga;
	}

	public void setDescarga(double descarga) {
		this.descarga = descarga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	private double constant() {
		
		return km/55;
	}
	
	private double constant2() {
		
		return (descarga + carga) / 60;
	}
	
	public double produtividade() {
		
		return (dia * horas) / (constant() + constant2());
	}
	
	
	
	

}
