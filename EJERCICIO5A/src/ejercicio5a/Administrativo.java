package ejercicio5a;

public class Administrativo extends Empleado {
	private double hsExtra;
	private double hsMes;
	
	public double getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(double hsExtra) {
		this.hsExtra = hsExtra;
	}
	public double getHsMes() {
		return hsMes;
	}
	public void setHsMes(double hsMes) {
		this.hsMes = hsMes;
	}
	@Override
	public double getSueldo() {
		return getSueldoBase() * ((hsExtra * 1.5)/hsMes) / hsMes;
	}
}