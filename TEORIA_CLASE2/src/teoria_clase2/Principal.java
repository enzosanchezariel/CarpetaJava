package teoria_clase2;

import teoria_clase2.Auto;

public class Principal {

	public static void main(String[] args) {
		Auto variableAuto;
		variableAuto = new Auto();
		variableAuto.setColor("Rojo");
		variableAuto.setMarca("Ford");
		variableAuto.setModelo(2024);
		variableAuto.setPatente("LBV 332");
		variableAuto.muestra();
		Auto variableAuto2 = new Auto("ABC 123", "Fiat", 2022, "Negro");
		System.out.println(variableAuto);
		System.out.println(variableAuto2);
	}

}
