
public class Q���ʽ�6 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 65;

		// �Էº�
		for (int i = 0; i < array.length; i++) {
			int start = i;
			int end = 4 - i;

			if (i > 2) {
				start = 4 - i;
				end = i;
			}

			for (int j = start; j <= end; j++) {
				array[i][j] = num++;
			}

		}

		// ��º�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print((char) array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
