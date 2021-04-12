import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 자리 0을 제외한 숫자를 입력해주세요. >> ");
		
		String num = sc.next();
		

		int sum = 0;
		
		for(int i = 0; i < num.length(); i++) {
			switch(num.charAt(i)) {
			case '0' : sum += 6; break;
			case '1' : sum += 2; break;
			case '2' : sum += 5; break;
			case '3' : sum += 5; break;
			case '4' : sum += 4; break;
			case '5' : sum += 5; break;
			case '6' : sum += 6; break;
			case '7' : sum += 3; break;
			case '8' : sum += 7; break;
			case '9' : sum += 6; break;
			
			}
		}
		
		System.out.print("대시('-')의 총합 >> " + sum);
		
		
	}

}
