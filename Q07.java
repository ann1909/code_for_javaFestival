import java.util.Scanner;

public class Q07 {
   // 문제 )
   // 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
   // ***
   // **
   // *
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
      for (int i = 1; i <= num; i++) {
         // 2-2. (2-1)은 행의 수 즉, 가로 줄을 만들어 줬고 행마다 들어갈 *의 개수를 정해준다.
         // 1번 행 → * num -0개 → i가 1일 때 1-1 =0 
         // 2번 행 → * num -1개 → i가 2일 때 1-2 =-1
         // 3번 행 → * num -2개 → i가 3일 때 1-3 =-2
         // i번 행에는 (num + 1 -i)개 만큼 *이 들어간다.
         // for문이 돌때마다 j <= 조건이 바껴야 한다. num은 고정값 i는 변하는 값, 충족하지 못한 값은 수를 넣어 충족시켜준다.
         for (int j = 1; j <= num + 1 -i; j++) {
            // 여기는 풀어봐서 이제 알겠쥬?
            System.out.print("*");
         }
         
         // 한 행이 출력된 후 줄바꿈
         System.out.println();
      }

      sc.close();
   }

}