package teoria_clase1;

public class Auto {
	// Variables de instancia
	private String patente; // (Privada por encapsulamiento)
	private String marca;
	private int modelo;
	private String color;
	// Setter y Getter
	public String getPatente() {
		// Publica para acceder a la misma desde fuera
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
		/* Patente de la izquierda se refiere a la variable
		 * que creamos, y Patente de la derecha se refiere
		 * al parametro del método. */
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
		/* @Override le indica que redefina el metodo toString()
		 * que, por convension, es el que es llamado al utilizar 
		 * métodos de los objetos que trae java por defecto y
		 * estan programados para utilizarlo cuando
		 * precisan representar nuestra clase como string. */
		return "Auto [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	
}