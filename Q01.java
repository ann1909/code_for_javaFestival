import java.util.Scanner;

public class Q01 {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("현재몸무게 : ");
      
      int weight = sc.nextInt();
      
      System.out.print("목표몸무게 : ");
      
      int goal = sc.nextInt();
   
      
      int week = 1;
      
      while (true) {
         
         System.out.print(week++ + "주차 감량 몸무게 : ");
         
         int loss = sc.nextInt();
         
         weight -= loss;
      
         
         if (weight <= goal) {
            
            System.out.println(weight + "kg달성!! 축하합니다!");
            
            break;
         }
      }

      sc.close();
   }//end

}
