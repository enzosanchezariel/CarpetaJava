package ejercicio5b5a;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		String rta = "";
		for(int i = 0; i <= 20 && !rta.equalsIgnoreCase("X"); i++) {
			System.out.println("Es vendedor o administrativo? (V o A) (X terminar)");
			rta = reader.nextLine();
			while(!rta.equalsIgnoreCase("V") && !rta.equalsIgnoreCase("A") && !rta.equalsIgnoreCase("X")){
				 rta = reader.nextLine();
			}
				if(rta.equalsIgnoreCase("V")) {
					empleados.add(new Vendedor());
					System.out.println("---Vendedor---");
					enterEmpleado(empleados.get(empleados.size() - 1));
					System.out.println("Ingrese Porcentaje de Comisión: ");
					((Vendedor) empleados.get(empleados.size() - 1)).setPorcenComision(Integer.parseInt(reader.nextLine()));
					System.out.println("Ingrese Total de Ventas: ");
					((Vendedor) empleados.get(empleados.size() - 1)).setTotalVentas(Integer.parseInt(reader.nextLine()));
				}
				else if(rta.equalsIgnoreCase("A")){
					empleados.add(new Administrativo());
					System.out.println("---Administrativo---");
					enterEmpleado(empleados.get(empleados.size() - 1));
					System.out.println("Ingrese Horas Extras: ");
					((Administrativo) empleados.get(empleados.size() - 1)).setHsExtra(Integer.parseInt(reader.nextLine()));
					System.out.println("Ingrese Horas Mensuales: ");
					((Administrativo) empleados.get(empleados.size() - 1)).setHsMes(Integer.parseInt(reader.nextLine()));
				}
		}
		reader.close();
		for (Empleado empleado : empleados) {
			if(empleado instanceof Vendedor) {
				System.out.println("---Vendedor---");
				showEmpleado(empleado);
				System.out.println("Porcentaje de Comisión: ");
				System.out.println(((Vendedor) empleado).getPorcenComision());
				System.out.println("Total de Ventas: ");
				System.out.println(((Vendedor) empleado).getTotalVentas());
			}
			else {
				System.out.println("---Administrativo---");
				showEmpleado(empleado);
				System.out.println("Horas Extras: ");
				System.out.println(((Administrativo) empleado).getHsExtra());
				System.out.println("Horas Mensuales: ");
				System.out.println(((Administrativo) empleado).getHsMes());
			}
			System.out.println("Sueldo: ");
			System.out.println(empleado.getSueldo());
		}
	}
	
	private static void enterEmpleado(Empleado empleado) {
		System.out.println("Ingrese Nombre: ");
		empleado.setNombre(reader.nextLine());
		System.out.println("Ingrese Apellido: ");
		empleado.setApellido(reader.nextLine());
		System.out.println("Ingrese DNI: ");
		empleado.setDni(Integer.parseInt(reader.nextLine()));
		System.out.println("Ingrese Email: ");
		empleado.setEmail(reader.nextLine());
		System.out.println("Ingrese Sueldo Base: ");
		empleado.setSueldoBase(Double.parseDouble(reader.nextLine()));
	}
	private static void showEmpleado(Empleado empleado) {
		System.out.println("Nombre: ");
		System.out.println(empleado.getNombre());
		System.out.println("Apellido: ");
		System.out.println(empleado.getApellido());
		System.out.println("DNI: ");
		System.out.println(empleado.getDni());
		System.out.println("Email: ");
		System.out.println(empleado.getEmail());
		System.out.println("Sueldo Base: ");
		System.out.println(empleado.getSueldoBase());
	}
}