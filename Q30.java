
public class Q30 {

	public static void main(String[] args) {

		int[][] array = new int[7][7];

		int cnt = 1;

		for (int i = 0; i < array.length; i++) {

			// 3 : array의 가운데 인덱스 번호
			int start = i - 3;

			int end = (i - 3) * (-1) + 6;

			if (i < 3) {
				start *= (-1);
				end = (i - 3) + 6;
			}

			for (int j = start; j <= end; j++) {
				array[i][j] = cnt++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
