public class Retangulo{
	private double largura;
	private double altura;
	
	Retangulo(){
		this.largura = 0;
		this.altura = 0;
	} 
	Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}
	
	
	
	
	
	
	public void setLargura(double largura){
		this.largura = largura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public double getLargura(){
		return largura;
	}
	public double getAltura(){
		return altura;
	}
	public double calcularArea(){
		return largura * altura;
	}
	public boolean isQuadrado(){
		if(largura == altura) return true;
		else return false;
	}
	
	
	
}