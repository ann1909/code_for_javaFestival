import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("2진수를 입력하세요 >> ");
		String str = sc.next();

		int sum = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			
			int y = 2;

			if (str.charAt(i) != '0') {
				for (int j = 1; j < str.length() - 1 - i; j++) {
					y *= 2;
				}
				sum += y;

			}
		}

		if (str.charAt(str.length() - 1) != '0') {
			sum += 1;
		}
		
		System.out.printf("%s(2) = %d(10)", str, sum);

	}

}
