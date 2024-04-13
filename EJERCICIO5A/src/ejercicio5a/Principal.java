package ejercicio5a;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[20];
		Scanner reader = new Scanner(System.in);
		for(int i = 0; i <= 20; i++) {
			System.out.println("Es vendedor o administrativo? (V o A)");
			String rta = reader.nextLine();
			while(!rta.equalsIgnoreCase("V") && !rta.equalsIgnoreCase("A")){
				 rta = reader.nextLine();
			}
				if(rta.equalsIgnoreCase("V")) {
					empleados[i] = new Vendedor();
					System.out.println("---Vendedor---");
					System.out.println("Ingrese Nombre: ");
					empleados[i].setNombre(reader.nextLine());
					System.out.println("Ingrese Apellido: ");
					empleados[i].setApellido(reader.nextLine());
					System.out.println("Ingrese DNI: ");
					empleados[i].setDni(Integer.parseInt(reader.nextLine()));
					System.out.println("Ingrese Email: ");
					empleados[i].setEmail(reader.nextLine());
					System.out.println("Ingrese Sueldo Base: ");
					empleados[i].setSueldoBase(Double.parseDouble(reader.nextLine()));
					System.out.println("Ingrese Porcentaje de Comisión: ");
					((Vendedor) empleados[i]).setPorcenComision(Integer.parseInt(reader.nextLine()));
					System.out.println("Ingrese Total de Ventas: ");
					((Vendedor) empleados[i]).setTotalVentas(Integer.parseInt(reader.nextLine()));
				}
				else{
					empleados[i] = new Administrativo();
					System.out.println("---Administrativo---");
					System.out.println("Ingrese Nombre: ");
					empleados[i].setNombre(reader.nextLine());
					System.out.println("Ingrese Apellido: ");
					empleados[i].setApellido(reader.nextLine());
					System.out.println("Ingrese DNI: ");
					empleados[i].setDni(Integer.parseInt(reader.nextLine()));
					System.out.println("Ingrese Email: ");
					empleados[i].setEmail(reader.nextLine());
					System.out.println("Ingrese Sueldo Base: ");
					empleados[i].setSueldoBase(Double.parseDouble(reader.nextLine()));
					System.out.println("Ingrese Horas Extras: ");
					((Administrativo) empleados[i]).setHsExtra(Integer.parseInt(reader.nextLine()));
					System.out.println("Ingrese Horas Mensuales: ");
					((Administrativo) empleados[i]).setHsMes(Integer.parseInt(reader.nextLine()));
				}
		}
		reader.close();
		//Lo dejé exactamente como en clase, despues lo completo y lo optimizo en los posible
	}

}
