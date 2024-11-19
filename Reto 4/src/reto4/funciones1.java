package reto4;

public class funciones1 {
	public static void dimelo(int producto) {// hace una piramide

		for (int i = 0; i < producto; i++) {
			for (int j = i; j <= i; j++) {
				System.out.print(" ");
			}
			for (int p = 1; p <= i; p--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
