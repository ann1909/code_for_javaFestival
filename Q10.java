import java.util.Random;

public class Q10 {
	// 문제 )
	// 1. 8칸 크기의 배열을 선언하고 
	// 2. 랜덤수로 초기화 한 후 
	// 3. 가장 큰 수와 작은 수를 각각 출력하시오
   public static void main(String[] args) {
	  // 1. 8칸 크기의 배열을 선언하고 
	  int[] array = new int[8];
      
	  // 2. 랜덤수로 초기화 한 후
	  // 2-1. 랜덤 라이브러리 생성
	  Random rd = new Random();

	  // 2-2. 배열 출력전 출력 문장 작성 
      System.out.print("배열에 있는 모든 값 : ");
      
      // 2-3. 랜덤수로 초기화한 수를 배열에 하나씩 넣기
      for (int i = 0; i < array.length; i++) {
          // 1부터 100까지
    	  array[i] = rd.nextInt(100) + 1;
         
    	 // 2-4. 배열에 있는 수 출력
         System.out.print(array[i] + " ");
      }

      // 3. 큰 수와 작은 수를 각각 출력하시오.
      // 3-1. 배열 안에서 큰 수 작은 수를 출력하기 위해 배열의 요소끼리 비교해야한다
      // 비교대상 정하기
      int max = array[0];
      int min = array[0];

      // 3-2. 배열 요소끼리 비교하기
      for (int i = 0; i < array.length; i++) {

    	 // 3-3. 조건 연산자를 이용해 쉽게 수하기
    	 // 조건연산자 : 조건식 ? true값 : false값
    	 // ex) max가 array[i]보다 크거나 같다면 변수 max에 max값을 넣고,
    	 //		max가 array[i]보다 작다면 변수 max에 array[i]값을 넣는다.
         max = max >= array[i] ? max : array[i];
         min = min <= array[i] ? min : array[i];
  
         // if문으로 푼다면!
//         if (max < array[i]) {
//        	 max = array[i];
//         }
//         
//         if (min > array[i]) {
//        	 min = array[i];
//         }
      }

      // 3-4. 가장 큰 수와 작은 수 출력.
      System.out.println();
      System.out.println("가장 큰 값 : " + max);
      System.out.println("가장 작은 값 : " + min);
   }

}