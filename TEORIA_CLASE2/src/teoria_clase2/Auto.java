package teoria_clase2;

public class Auto {
	
	private String patente;
	private String marca;
	private int modelo;
	private String color;
	
	public Auto(String patente, String marca, int modelo, String color) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public Auto() {super();}
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void muestra() {
		System.out.println("Patente: " + this.patente);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Color: " + this.color);
	}
	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
}