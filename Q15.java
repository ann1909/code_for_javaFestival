import java.util.Scanner;

public class Q15 {
	// 문제 )
	// 1. 정수 n을 입력받아 
	// 2. 1,2,4,7,11과 같은 수열의 n번째 항까지 출력하시오
	// 2. 1,2,4,7,11의 규칙성을 찾는다. 
	public static void main(String[] args) {
	  // 1. 정수 n을 입력받아
	  // 1-1. 입력받기 위한 Scanner	
	  Scanner sc = new Scanner(System.in);
	  
	  // 1-2. 정수 n 입력 전 출력문 작성
      System.out.print("n 입력 : ");

      // 1-2. 정수 n 입력받기
      int n = sc.nextInt();

      // 2. 1,2,4,7,11과 같은 수열의 n번째 항까지 출력하기 위해 배열에 저장하고, 배열의 크기를 지정
      int[] array = new int[n];
      
      // 2. 1,2,4,7,11의 규칙성을 찾는다.
      // 1 	2	4	7	11
      //  +1  +2  +3  +4
      // 1번째 숫자 + 1 = 2번째 숫자
      // 2번째 숫자 + 2 = 3번째 숫자
      // 3번째 숫자 + 3 = 4번째 숫자
      
      // 1번째 숫자 : array[0], 1
      array[0] = 1;
      
      // 1번째 숫자를 출력
      System.out.print(array[0] + " ");
      
      // 2-1. 찾은 규칙성을 보면 더하는 값이 1씩 증가하는 것을 볼 수 있고
      // 	  배열의 인덱스 번호도 1도 증가하는 것을 알 수 있다.
      // array[0]번은 있으니 array[1]부터 값을 구하자
      for (int i = 1; i < array.length; i++) {
    	 // 2번째 숫자 = 1번째 숫자 + 1
    	 // array[1] = array[0] + 1
    	  
    	 // 3번째 숫자 = 2번째 숫자 + 1
     	 // array[2] = array[1] + 2
    	  
    	 // 4번째 숫자 = 3번째 숫자 + 1
      	 // array[3] = array[2] + 3
         array[i] = array[i - 1] + i;
         
         // 2-2. 배열의 데이터 출력
         System.out.print(array[i] + " ");
      }
   }

}