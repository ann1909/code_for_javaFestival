
public class Q24 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 1;

		// �Էº�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}

		// ��º�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[array.length - i - 1][array[i].length - j - 1] + "\t");
			}
			System.out.println();
		}

	}

}