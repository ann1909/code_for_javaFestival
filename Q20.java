
import java.util.Scanner;

public class Q20 {
   // 문제 )
   // 1. 10진수 정수를 입력받아 
   // 2. 2진수로 변환해서 출력하시오
   public static void main(String[] args) {
   // 1. 10진수 정수를 입력받아
      // 1-1. 입력 받기 위한 라이브러리 작성
      Scanner sc = new Scanner(System.in);
      
      // 1-2. 정수 입력을 위한 출력문 작성
      System.out.print("숫자입력 >> ");

      // 1-2. 정수 입력
      int num = sc.nextInt();

      
   // 2. 2진수로 변환해서 출력하시오
      // 2-1. 2진수로 반환 할 수를 문자열에 저장
      String piece = " ";

      
      // 2-2. 만약 num이 1보다 클 때 
      if (num > 1) {
         // num이 1보다 크다면 이진수는 무조건 처음에 1로 시작함
         System.out.print("1 ");

         // 2-3. 소인수분해처럼 나눌 수 없을 때까지 나눠야하는데
         // 2진수이기 때문에 2로만 나누기
         
         // num이 1이 아니라면 2로 계속 나누어서 2진수로 표현
         while (num != 1) {
            
            // 2-4. 2진수로 표현될 값을 변수 a에 대입
            // 2로 나눠서 나머지가 0이라면 0, 2로 나눠서 나머지가 1이라면 1 대입  
            int a = num % 2;

            // 2-5. 2진수로 반환 할 수를 저장할 문자열 변수에 a 값과 이 전에 있던 문자열을 뒤로 밀면서 대입해준다
            
            piece = a + " " + piece;

            //나눌 수 없을 때 까지 나누기
            num /= 2;
            
            // ex. num = 20
            // while 실행 전 print('1') 
            // while 첫 번째 실행 : num = 20 → a = 0 → piece = 0 + " " + " "  → num(20)/=2; num = 10
            // while 두 번째 실행 : num = 10 → a = 0 → piece = 0 + " " + "0(이 전 a의 값) "  → num(10)/=2; num = 5
            // while 세 번째 실행 : num = 5 → a = 1 → piece = 1 + " " + "0 0(이 전 a의 값) "  → num(5)/=2; num = 2
            // while 네 번째 실행 : num = 2 → a = 0 → piece = 0 + " " + "1 0 0(이 전 a의 값) "  → num(2)/=2; num = 1
            // num은 1이기 때문에 while문 실행 안 함 
            
            // 결과
            // while 실행 전 print('1') + print(piece = "0 1 0 0") = 1 0 1 0 0
         }
         
         // 2-6. a값을 저장한 문자열 piece 출력
         System.out.println(piece);
         
      } 
      // 2-2. num이 1보다 작거나 같다면 1일 때 1, 0일 때 0이기 때문에 그대로 출력
      else {
         System.out.println(num);
      }

      sc.close();

   }// end

}