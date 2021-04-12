
public class Q23 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 1;

		// 입력부
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}

		// 출력부
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[j][array.length - i - 1] + "\t");
			}
			System.out.println();
		}

	}

}
