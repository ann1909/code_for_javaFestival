import java.util.Random;

public class Q29 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[][] array = new int[8][8];

		System.out.println("배열에 있는 값");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rd.nextInt(99) + 1;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		
		// 최대값 찾기
		int max = array[0][0];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];

				}
			}
		}

		// 행 열 찾기
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max == array[i][j]) {
					row = i + 1;
					col = j + 1;
					break;
				}
			}
		}

		System.out.println();
		System.out.println("최대값 >> " + max);
		System.out.printf("행 >> %d  열 >> %d", row, col);
	}

}
