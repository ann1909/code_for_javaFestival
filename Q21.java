
public class Q21 {
	// �Ʒ��� ���� 1������ ������ �־����� ��,
	// �� �� ���� �Ÿ��� ª�� ��(index)���� ����Ͻÿ�
	// int[] point = {92,32,52,9,81,2,68};
	public static void main(String[] args) {

		int[] point = { 92, 93, 52, 9, 81, 2, 68 };

		int[] arr = new int[2];

		int temp = point[0] - point[1];

		if (temp < 0) {
			temp *= (-1);
		}

		for (int i = 0; i < point.length; i++) {
			for (int j = i + 1; j < point.length; j++) {

				int result = point[i] - point[j];

				if (result < 0) {
					result *= (-1);
				}

				if (temp >= result) {
					temp = result;
					arr[0] = i;
					arr[1] = j;
				}
			}
		}

		System.out.printf("resul = [ %d, %d ]", arr[0], arr[1]);

	}

}
