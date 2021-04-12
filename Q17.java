
public class Q17 {
	// 문제 )
	// 1. 입력된 수가 짝수라면 2로 나누고,
	// 2. 홀수라면 3을 곱하고 1을 더한 다음
	// 3. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복
	//    입력된 수가 6이라면 6-3-10-5-16-8-4-2-1이 되어 총 8번 만에 1이 됩니다.
	// 4. collatzNumber()메소드를 만들어 입력된 수가 몇 번 만에 1이 되는지 반환해 주세요.
	// 5. 단, 500번을 반복해도 1이 되지 않는다면 -1을 반환해 주세요
	public static void main(String[] args) {

		int number = CollatzNumber(6);
		System.out.println(number);
	}

	public static int CollatzNumber(int num) {
		
		// 4-1. while문이 한 번 실행 될 때마다 count를 해주기 위해 초기화 한 값
		int cnt = 0;
	
		// 3. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복
		while (num != 1) {
			// 1. 입력된 수가 짝수라면 2로 나누고,
			if (num % 2 == 0) {
				num /= 2;
			} 
			// 2. 홀수라면 3을 곱하고 1을 더한 다음
			else {
				num = num * 3 + 1;
			}

			// 4. collatzNumber()메소드를 만들어 입력된 수가 몇 번 만에 1이 되는지 반환해 주세요.
			// 4-2. while문이 한 번 실행 될 때마다 count를 해준다
			cnt++;

			// 5. 단, 500번을 반복해도 1이 되지 않는다면 -1을 반환해 주세요
			if (cnt >= 500) {
				cnt = -1;
				break;
			}
		}

		// 반환할 값 = 몇 번 반복되었는지 return할 값
		return cnt;
	}

}