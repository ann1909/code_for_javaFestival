
public class Qº¸³Ê½º2 {

	public static void main(String[] args) {

		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
	}

	public static String getMiddle(String string) {

		String result = "";

		if (string.length() % 2 == 1) {
			result += string.charAt(string.length() / 2);
		} else {
			result += string.charAt(string.length() / 2 - 1);
			result += string.charAt(string.length() / 2);
			
		}

		return result;
	}

}
