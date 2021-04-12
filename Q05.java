import java.util.Scanner;

public class Q05 {
   // 문제 ) 
   // 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
   // *
   // **
   // ***
   // 1. 행 개수를 입력 받아
   // 2. *로 삼각형을 출력하시오
   public static void main(String[] args) {
   // 1. 행 개수를 입력 받아
      // 1-1. 입력 받기 위한 라이브러리 작성
      Scanner sc = new Scanner(System.in);
      
      // 1-2. 입력 받기 위한 출력문 작성
      System.out.print("행 개수 : ");
      
      // 1-3. 행 개수 입력
      int num = sc.nextInt();
      
      
   // 2. *로 삼각형을 출력하시오.
      // 2-1. 입력 받은 수만큼 행을 출력하기 위해 i는 1부터 num의 수까지 행의 개수를 만든다.
      for(int i = 1; i <= num; i++) {
         
         // 2-2. (2-1)은 행의 수 즉, 가로 줄을 만들어 줬고 행마다 들어갈 *의 개수를 정해준다.
         // 1번 행 → * 1개
         // 2번 행 → * 2개
         // 3번 행 → * 3개
         // i번 행에는 i개 만큼 *이 들어간다.
         for(int j = 1; j <= i; j++) {
            // i가 1일 때는 * 1개 출력 → print("*") → for문이 한번 실행 (int j = 1; j <= 1;) → j = 1
            // i가 2일 때는 * 2개 출력 → print("*") print("*") → for문이 두번 실행 (int j = 1; j <= 2;) → j = 1,2
            // i가 3일 때는 * 3개 출력 → for문이 두번 실행 (int j = 1; j <= 3;) → j = 1,2,3
            System.out.print("*");
         }
         
         // 한 행이 끝나면 줄 바꿈을 해준다
         System.out.println();
      }
      
      sc.close();
   }//end

}