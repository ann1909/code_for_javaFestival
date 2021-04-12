public class Q12 {

	// 문제 )
	// 정수 N을 입력받아 
	// N*N 배열에 다음과 같이 숫자를 저장하고 
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
		// array[0][0], array[1][0], array[2][0], array[3][0], array[4][0]
		// array[0][1], array[1][1], array[2][1], array[3][1], array[4][1]
		// array[0][2], array[1][2], array[2][2], array[3][2], array[4][2]
		// array[0][3], array[1][3], array[2][3], array[3][3], array[4][3]
		
		// 출력부 : 값이 들어간 배열을 출력한다
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// 1번실행
				// j = 0,1,2,3,4  i = 0
				// array[0][0], array[1][0], array[2][0], array[3][0], array[4][0]
				
				// 2번실행
				// j = 0,1,2,3,4  i = 1
				// array[0][1], array[1][1], array[2][1], array[3][1], array[4][1]
				System.out.print(array[j][i] + "\t");
			}
			// 한 줄이 실행되고 엔터 
			System.out.println();
		}

	}// end

}
