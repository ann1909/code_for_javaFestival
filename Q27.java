
public class Q27 {

	public static void main(String[] args) {

		System.out.println(change124(10));
	}

	public static String change124(int i) {

		String result = "";

		int remain = 0;

		while (i > 0) {
			remain = i % 3;
			i /= 3;

			if (remain == 0) {
				remain = 4;
				i = i - 1;
			}

			result = remain + result;
		}

		return result;
	}

}
