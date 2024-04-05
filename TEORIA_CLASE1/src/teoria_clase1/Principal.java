package teoria_clase1;

public class Principal {

	public static void main(String[] args) {
		/* El método main es un "Método de Clase" ya que se puede
		 * acceder desde afuera de la clase al mismo. */
		Auto variableAuto;
		variableAuto = new Auto();
		/* Cambia el valor de la variable color sin hacer referencia a
		 * la variable (que marcamos como privada). */
		variableAuto.setColor("Rojo");
		variableAuto.setMarca("Ford");
		variableAuto.setModelo(2024);
		variableAuto.setPatente("LBV 332");
		variableAuto.muestra();
		
		System.out.println(variableAuto);
		// Muestra la dirección de memoria del obj
		
	}

}
