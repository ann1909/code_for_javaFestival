
public class Q26 {

	public static void main(String[] args) {

		System.out.println(caesar("a B z", 4));

	}

	public static String caesar(String string, int num) {

		int[] array = new int[string.length()];

		String result = "";

		for (int i = 0; i < string.length(); i += 2) {

			array[i] = string.charAt(i) + num;

			if (array[i] > 122) {
				array[i] = 97 + num - 1;
			}

			if (array[i] > 90 && array[i] < 96) {
				array[i] = 65 + num + 1;
			}

			result += (char) array[i] + " ";
		}

		return result;

	}

}
