package packag.e;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite la cantidad de numeros que quiere evaluar");
		Scanner scanner = new Scanner(System.in);
		int numbersLength = scanner.nextInt();
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= numbersLength; i++) {
			System.out.println("Digite el numero " + i + " a evaluar");
			int number = scanner.nextInt();
			numbers.add(number);
		}
		int maxNumber = numbers.stream().reduce(Integer::max).get();
		System.out.println("El digito mayor es " + maxNumber);

	}

}
