import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "��° �� �Է� >> ");
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

		System.out.println("���� ��");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
