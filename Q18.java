public class Q18 {
	// ���� )
	// ���� N�� �Է¹޾� 
	// ��N*N �迭�� ������ ���� ���ڸ� �����ϰ� 
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
		// array[0][0], array[0][1], array[0][2], array[0][3], array[0][4]
		// array[1][4], array[1][3], array[1][2], array[1][1], array[1][0]
		// array[2][0], array[2][1], array[2][2], array[2][3], array[2][4]
		// array[3][4], array[3][3], array[3][2], array[3][1], array[3][0]
		// ù��° �ε����� [0],[2],[4]�� ���� ���� �״�� �� �ε��� ��ȣ�� ¦��
		// ù��° �ε����� [1],[3]�� ���� ���� �Ųٷ� �� �ε��� ��ȣ�� Ȧ��
		
		// ��º� : ���� �� �迭�� ����Ѵ�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// ù ��° �ε��� ��ȣ�� ¦�����
				if(i % 2 == 0) {
					// �ִ� �״�� ���
					System.out.print(array[i][j] + "\t");					
				}
				// ù ��° �ε��� ��ȣ�� Ȧ�����
				else {
					// ��µǴ� ��ȣ�� 4,3,2,1,0���� ���;� ��
					// ��ġ�ʴ°� array[i].length
					// ���ϴ� �� j�� �̿��� 4,3,2,1,0�� �������
					// array[i].length : 5 - j(0) = 5 �� 4�� ����� �ַ��� 1�� �����Ѵ�
					System.out.print(array[i][array[i].length - 1 - j] + "\t");
				}
			}		
			// �� ���� ��µ� �� �ٹٲ�
			System.out.println();
		}
	}// end

}
