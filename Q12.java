public class Q12 {

	// ���� )
	// ���� N�� �Է¹޾� 
	// N*N �迭�� ������ ���� ���ڸ� �����ϰ� 
	// ����Ͻÿ� 
	public static void main(String[] args) {
		// 5�� 5���� 2���� array �迭
		// 1~25���� �ʱ�ȭ
		int[][] array = new int[5][5];

		// n�� n���� ���� �ֱ����� �ʱ�ȭ �� ��
		int cnt = 1;

		// �Էº� : ���� �迭�� ���� �־��ش�
		// array.length = 5
		// i = 0, 1, 2, 3, 4
		for (int i = 0; i < array.length; i++) {
			// array[i].length = 5
			// j = 0, 1, 2, 3, 4
			for (int j = 0; j < array[i].length; j++) {
				// i = 0, j = 0,1,2,3,4,5 
				// array[0][0] = 1
				array[i][j] = cnt++;
				// array[0][1] = 2
				// array[0][2] = 3
			}
		}
		
		// ���� ���� �� ������ ���� �迭�� �ε��� ��ȣ�� ��� �����ϰ�
		// ��Ģ�� ã�� ��ºο� �����ش�.
		// array[0][0], array[1][0], array[2][0], array[3][0], array[4][0]
		// array[0][1], array[1][1], array[2][1], array[3][1], array[4][1]
		// array[0][2], array[1][2], array[2][2], array[3][2], array[4][2]
		// array[0][3], array[1][3], array[2][3], array[3][3], array[4][3]
		
		// ��º� : ���� �� �迭�� ����Ѵ�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// 1������
				// j = 0,1,2,3,4  i = 0
				// array[0][0], array[1][0], array[2][0], array[3][0], array[4][0]
				
				// 2������
				// j = 0,1,2,3,4  i = 1
				// array[0][1], array[1][1], array[2][1], array[3][1], array[4][1]
				System.out.print(array[j][i] + "\t");
			}
			// �� ���� ����ǰ� ���� 
			System.out.println();
		}

	}// end

}
