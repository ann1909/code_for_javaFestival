import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 >> ");
			array[i] = sc.nextInt();
		}

		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];

					array[j] = array[j + 1];

					array[j + 1] = temp;
				}
			}
		}

		System.out.println("정렬 후");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
