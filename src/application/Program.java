package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Integer> pivores = new ArrayList<>();

		String pivo = sc.nextLine();
		String[] listaPivo = pivo.split(" ");

		int numero;
		for (int i = 0; i < listaPivo.length; i++) {
			numero = Integer.parseInt(listaPivo[i]);
			pivores.add(numero);
		}

		Collections.sort(pivores);

		int tam = pivores.size(); // tamanho da lista
		double x = tam / 2;
		if (tam % 2 == 1) {
			System.out.println("Mediana = "+pivores.get((int) x));

		} else {
			double z = (pivores.get((int) x - 1)) + pivores.get((int) x); // + pivores.get(x);
			z = z / 2;
			System.out.println("Mediana = "+z);
		}
		sc.close();
	}

}
