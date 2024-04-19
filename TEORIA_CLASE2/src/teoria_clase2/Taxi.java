package teoria_clase2;

public class Taxi extends Auto{
	private String chapa;

	public String getChapa() {
		return chapa;
	}

	public void setChapa(String chapa) {
		this.chapa = chapa;
	}

	// El override debe tener el mismo tipo de dato de retorno, mismo nombre y mismos parametros que el padre
	// De otra forma, no seria una redefinición
	
	@Override
	public String toString() {
		return "Taxi [chapa=" + chapa + ", getChapa()=" + getChapa() + ", getPatente()=" + getPatente()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getColor()=" + getColor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}