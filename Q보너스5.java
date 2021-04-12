
public class Qº¸³Ê½º5 {

	public static void main(String[] args) {

		int A[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int B[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int Merge[] = mergeArray(A, B);

		System.out.print("Merge : [" + Merge[0]);
		for (int i = 1; i < Merge.length; i++) {
			System.out.print("," + Merge[i]);

		}
		System.out.print("]");
	}

	public static int[] mergeArray(int[] a, int[] b) {

		int[] array = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			array[i] = a[i];
		}

		for (int i = a.length; i < array.length; i++) {
			array[i] = b[i - a.length];
		}

		for (int j = 0; j < array.length - 1; j++) {
			int minIndex = j;

			for (int i = j + 1; i < array.length; i++) {

				if (array[minIndex] > array[i]) {
					minIndex = i;
				}
			}

			int temp = array[minIndex];
			array[minIndex] = array[j];
			array[j] = temp;
		}

		return array;
	}

}
