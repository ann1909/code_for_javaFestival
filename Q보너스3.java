
public class Qº¸³Ê½º3 {

	public static void main(String[] args) {

		System.out.println(isHashad(18));
	}

	private static boolean isHashad(int num) {

		String strNum = "" + num;
		
		int sum = 0;
		
		for(int i = 0; i < strNum.length(); i++) {
			sum+= (int) strNum.charAt(i) - 48;
		}

		return num % sum == 0;
	}

}
