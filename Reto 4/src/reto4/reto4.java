package reto4;

import java.util.Scanner;

public class reto4 {
	// este main calcula los multiplos de un n�mero y luego con
	// la funcion hace una piramide con ese numero de estrellas

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		int producto = 0;
		// Aqui pide un n�mero
		funciones.dimeEntero("Introduce un numero", sc);
	
			for (i = 1; i < num; i++)
			{
				if(num % i == 0)
				producto = num * i;
			}
		funciones1.dimelo(producto);
	}

}
