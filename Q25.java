import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù �ڸ� 0�� ������ ���ڸ� �Է����ּ���. >> ");
		
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
		
		System.out.print("���('-')�� ���� >> " + sum);
		
		
	}

}
