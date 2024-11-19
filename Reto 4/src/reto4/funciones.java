package reto4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class funciones {
	public static boolean esInt(String s) {

		try {
			int i = Integer.parseInt(s);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public static boolean esDouble(String s) {

		try {
			Double i = Double.parseDouble(s);
			return true;
		} catch (Exception ex) {
			return false;
		}
			}

	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s1 = sc.nextLine();
				int num = Integer.parseInt(s1);
				return num;
			} catch (Exception ex) {
				System.out.println("Introduce un formato valido");
			}
		} while (true);
	}

	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s1 = sc.nextLine();
				Double num = Double.parseDouble(s1);
				return num;
			} catch (Exception ex) {
				System.out.println("Introduce un formato valido");
			}
		} while (true);
	}
	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do {
			try {
				System.out.println(texto);
				String fecha_s = sc.nextLine();
				LocalDate ld = LocalDate.parse(fecha_s, formato1);
				return ld;
			} catch (Exception ex) {
				System.out.println("Introduce una fecha valida");

			}
		} while (true);

	}
}
