import java.util.Scanner;

public class Q02 {
   // 문제 )
   // 일한 시간을 입력받아 총 임금을 계산하는 시급계산기 입니다. 시급은 5000원이며 8시간보다 초과 근무한 시간에 대해 1.5배의 시급이 책정됩니다.
   // 1. 일한 시간을 입력 받아
   // 2. 5000원의 시급과 초과 근무한 시간에 대해 시급 책정 후 (1.5배) 총 임금을 계산한다.
   // 3. 총 임금 출력
   public static void main(String[] args) {
   // 1. 일할 시간을 입력 받아
      
      // 1-1. 입력 받기 위한 라이브러리 작성
      Scanner sc = new Scanner(System.in);
      
      // 1-2. 일한 시간을 입력하기 위한 출력문
      System.out.print("일할 시간을 입력하세요 : ");
      
      // 1-3. 일한 시간 작성
      int time = sc.nextInt();
      
      // 1-4. 시급과 임금 변수 지정
      int money = 5000;
      
      // 임금 = 시급 x 시간
      int salary = money * time;
      
      
   // 2. 5000원의 시급과 (8시간 초과)초과 근무한 시간에 대해 시급 책정 후(1.5배)
      // 2-1. 만약 일한 시간이 8시간이 초과된다면
      if (time > 8) {
         // 2-2. 초과된 시간의 1.5배의 시급 책정을 한다.
         int over = time - 8;
         
         // (int) → 소수를 곱하기 때문에 정수형으로 변환해서 .0 빼주기 
         // 임금 = 시급 x (8시간이 초과했기 때문에 기본 8시간 +  초과하면 1.5배의 시간으로 책정해주기 때문에 초과된 시간 x 1.5)
         salary = (int) (money * (8 + over * 1.5));
      }
      // 2-2. 일한 시간이 8시간이 넘지 않는다면 if문은 실행되지 않기 때문에 
      // int salary = money * time; 이 문장에서 임금 계산이 끝난다.

      
   // 3. 총 임금 출력   
      System.out.printf("총 임금은 %d원 입니다.", salary);
      
      // Scanner 종료
      sc.close();
   }// end

}