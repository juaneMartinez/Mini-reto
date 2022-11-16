package Challenge;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.println("Ingrese: tipoA ó tipoB");
		String aux = read.next();
		System.out.println("Ingrese si desea la lista asc o desc");
		String aux1 = read.next();
		randomChain(aux);

		int[] list = new int[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * ((50 - 0) + 1)) + 0;
		}
		orderArray(list, aux1);

	}

	public static void randomChain(String message) {

		String chain = "";
		for (int i = 0; i < 8; i++) {
			chain = chain + (int) (Math.random() * 10);
		}

		if (message.equalsIgnoreCase("TipoA")) {
			System.out.println("54" + chain);
		}
		if (message.equalsIgnoreCase("TipoB")) {
			System.out.println("08" + chain);
		}

	}

	public static void orderArray(int[] numbers, String order) {

		if (order.equalsIgnoreCase("Asc")) {

			for (int i = 0; i < numbers.length; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					int tmp = 0;
					if (numbers[i] > numbers[j]) {
						tmp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = tmp;
					}
				}
			}

		}
		if (order.equalsIgnoreCase("desc")) {
			for (int i = 0; i < numbers.length; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					int tmp = 0;
					if (numbers[i] < numbers[j]) {
						tmp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = tmp;
					}
				}
			}
		}
		String chain = "";
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				chain = chain + numbers[i];
			}
			chain = chain + "," + numbers[i];
		}
		System.out.println(chain);
	}

}
