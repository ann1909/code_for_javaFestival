import java.util.Scanner;

public class Q09 {
   // 문제 )
   // 1. 두 정수를 입력받아
   // 2. 최대공약수를 출력하시오
   // 3. 최소공배수를 출력하시오
   public static void main(String[] args) {
   // 1. 두 정수를 입력받아
      // 1-1. 입력 받기 위한 라이브러리 작성
      Scanner sc = new Scanner(System.in);
      
      // 1-2. 첫 번째 출력문장
      System.out.println("최대 공약수 & 최소 공배수 구하기");
      
      // 1-3. 첫 번째 정수 입력을 위한 출력문장
      System.out.print("숫자1입력 : ");
      
      // 1-4. 첫 번째 정수 입력
      int num1 = sc.nextInt();
      
      // 1-5. 두 번째 정수 입력을 위한 출력문장
      System.out.print("숫자2입력 : ");
      
      // 1-6. 두 번째 정수 입력
      int num2 = sc.nextInt();
      
   // 두 수의 최대공약수는 두 수 중 작은 수 보다 크지 않기 때문에 
   // 두 수 중 작은 수를 조건연산자(삼항연산자)를 이용해서 구한다
   // 조건연산자
   // → 조건식(true or false) ? true일 때 값 : false일때 값;
   // → 조건식이 참이라면 ':'를 기준으로 앞에 값이 값이 되고 거짓이라면 ':'를 기준으로 뒤에 값이 값이 된다.    
   // 두 수 중 작은 값을 변수에 넣어준다.
      int small = num1 < num2 ? num1 : num2;
      
      // 최대공약수 변수
      int max = 0;
   
   // 2. 최대공약수를 출려하시오
      // 2-1. 1 ~ 작은값까지 for을 이용해 공약수를 구한다
      for(int i = 1; i <= small; i++) {
         
         // 2-2. 만약 i가 두 수 모두 나눠서 나머지가 0이 나온다면(두 수 모두 나눌 수 있다면)
         if(num1 % i == 0 && num2 % i ==0) {
            
            // 2-3. 최대공약수 변수에 공약수를 넣어준다.
            // max에는 마지막 i만 저장이 된다. (마지막 값이 계속 이전 값을 덮어쓰기 때문에)
            // ex. 10과 15의 공약수 = 1, 5, 10
            // max = 1
            // max(1) = 5
            // max(5) = 10
            max = i;
         }
      }
      
      // 2-4. 최대공약수 출력문장
      System.out.println("최대공약수 : " + max);
      
      
   // 3. 최소공배수를 출력하시오
      // 3-1. 공식 : 두 수를 곱한 값에 최대공약수를 나누면 최소공배수가 된다.
      int min = num1*num2/max;
      
      // 3-2. 최소공배수 출력문장
      System.out.println("최소공배수 : " + min);
      
      
      // Scanner 종료
      sc.close();
   }//end
}
