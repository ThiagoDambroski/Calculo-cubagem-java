package calculos;

public class PesoCubado {
	
	private double pesoReal;
	private double profundidade;
	private double altura;
	private double largura;
	final double rodovida = 300;
	private int caixa;

	
	public PesoCubado(double pesoReal, double profundidade, double altura, double largura,int caixa) {
		this.pesoReal = pesoReal;
		this.profundidade = profundidade;
		this.altura = altura;
		this.largura = largura;
		this.caixa = caixa;
	}
	
	
	public double getCaixa() {
		return caixa;
	}


	public void setCaixa(int caixa) {
		this.caixa = caixa;
	}


	public double getPesoReal() {
		return pesoReal;
	}
	public void setPesoReal(double pesoReal) {
		this.pesoReal = pesoReal;
	}
	public double getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	private double cubo() {
		return profundidade  * altura * largura;
	}
	
	public double pesoCubadoRodovia() {
		return cubo() * 300 * caixa;
		
	}
	public double peso() {
		return pesoReal * caixa;
	}
	public boolean pesoRodovia() {
		if(peso() < pesoCubadoRodovia()) {
			return true;
			
		}else {
			return false;
			
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		if(pesoRodovia()) {
			result += "O peso cobrado deve ser o cubado";
			
		}else {
			result += "O peso cobrado deve ser o real";
			
		}
		
		return result;
	}
	

}
