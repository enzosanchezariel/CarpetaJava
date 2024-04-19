package ejercicio5b5a;

public class Vendedor extends Empleado {
	private int porcenComision;
	private int totalVentas;
	
	public int getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(int porcenComision) {
		this.porcenComision = porcenComision;
	}
	public int getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}
	@Override
	public double getSueldo() {
		return getSueldoBase() + (porcenComision*totalVentas/100);
	}
}