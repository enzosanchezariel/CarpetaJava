package ejercicio5a;

import java.util.Scanner;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		Empleado[] empleados = new Empleado[20];
		String rta = "";
		for(int i = 0; i <= 20 && !rta.equalsIgnoreCase("X"); i++) {
			System.out.println("Es vendedor o administrativo? (V o A) (X terminar)");
			rta = reader.nextLine();
			while(!rta.equalsIgnoreCase("V") && !rta.equalsIgnoreCase("A") && !rta.equalsIgnoreCase("X")){
				 rta = reader.nextLine();
			}
				if(rta.equalsIgnoreCase("V")) {
					empleados[i] = new Vendedor();
					System.out.println("---Vendedor---");
					enterEmpleado(empleados[i]);
					System.out.println("Ingrese Porcentaje de Comisión: ");
					((Vendedor) empleados[i]).setPorcenComision(Integer.parseInt(reader.nextLine()));
					System.out.println("Ingrese Total de Ventas: ");
					((Vendedor) empleados[i]).setTotalVentas(Integer.parseInt(reader.nextLine()));
				}
				else if(rta.equalsIgnoreCase("A")){
					empleados[i] = new Administrativo();
					System.out.println("---Administrativo---");
					enterEmpleado(empleados[i]);
					System.out.println("Ingrese Horas Extras: ");
					((Administrativo) empleados[i]).setHsExtra(Integer.parseInt(reader.nextLine()));
					System.out.println("Ingrese Horas Mensuales: ");
					((Administrativo) empleados[i]).setHsMes(Integer.parseInt(reader.nextLine()));
				}
		}
		reader.close();
		for(int i = 0; i <= 20 && empleados[i] != null; i++) {
			if(empleados[i] instanceof Vendedor) {
				System.out.println("---Vendedor---");
				showEmpleado(empleados[i]);
				System.out.println("Porcentaje de Comisión: ");
				System.out.println(((Vendedor) empleados[i]).getPorcenComision());
				System.out.println("Total de Ventas: ");
				System.out.println(((Vendedor) empleados[i]).getTotalVentas());
			}
			else {
				System.out.println("---Administrativo---");
				showEmpleado(empleados[i]);
				System.out.println("Horas Extras: ");
				System.out.println(((Administrativo) empleados[i]).getHsExtra());
				System.out.println("Horas Mensuales: ");
				System.out.println(((Administrativo) empleados[i]).getHsMes());
			}
			System.out.println("Sueldo: ");
			System.out.println(empleados[i].getSueldo());
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