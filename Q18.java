public class Q18 {
	// 문제 )
	// 정수 N을 입력받아 
	// ㅇN*N 배열에 다음과 같이 숫자를 저장하고 
	// 출력하시오 
	public static void main(String[] args) {
		// 5행 5열의 2차원 array 배열
		// 1~25까지 초기화
		int[][] array = new int[5][5];

		// n행 n열에 값을 넣기위해 초기화 한 값
		int cnt = 1;

		// 입력부 : 먼저 배열에 값을 넣어준다
		// array.length = 5
		// i = 0, 1, 2, 3, 4
		for (int i = 0; i < array.length; i++) {
			// array[i].length = 5
			// j = 0, 1, 2, 3, 4
			for (int j = 0; j < array[i].length; j++) {
				// i = 0, j = 0,1,2,3,4,5 
				// array[0][0] = 1
				array[i][j] = cnt++;
				// array[0][1] = 2
				// array[0][2] = 3
			}
		}
		
		// 값을 넣은 후 문제에 나온 배열의 인덱스 번호를 적어서 정리하고
		// 규칙을 찾아 출력부에 적어준다.
		// array[0][0], array[0][1], array[0][2], array[0][3], array[0][4]
		// array[1][4], array[1][3], array[1][2], array[1][1], array[1][0]
		// array[2][0], array[2][1], array[2][2], array[2][3], array[2][4]
		// array[3][4], array[3][3], array[3][2], array[3][1], array[3][0]
		// 첫번째 인덱스가 [0],[2],[4]인 줄은 순서 그대로 → 인덱스 번호가 짝수
		// 첫번째 인덱스가 [1],[3]인 줄은 순서 거꾸로 → 인덱스 번호가 홀수
		
		// 출력부 : 값이 들어간 배열을 출력한다
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// 첫 번째 인덱스 번호가 짝수라면
				if(i % 2 == 0) {
					// 있는 그대로 출력
					System.out.print(array[i][j] + "\t");					
				}
				// 첫 번째 인덱스 번호가 홀수라면
				else {
					// 출력되는 번호가 4,3,2,1,0으로 나와야 함
					// 변치않는값 array[i].length
					// 변하는 값 j을 이용해 4,3,2,1,0을 만들려면
					// array[i].length : 5 - j(0) = 5 → 4를 만들어 주려면 1을 빼야한다
					System.out.print(array[i][array[i].length - 1 - j] + "\t");
				}
			}		
			// 한 줄이 출력된 후 줄바꿈
			System.out.println();
		}
	}// end

}
