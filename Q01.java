import java.util.Scanner;

public class Q01 {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("��������� : ");
      
      int weight = sc.nextInt();
      
      System.out.print("��ǥ������ : ");
      
      int goal = sc.nextInt();
   
      
      int week = 1;
      
      while (true) {
         
         System.out.print(week++ + "���� ���� ������ : ");
         
         int loss = sc.nextInt();
         
         weight -= loss;
      
         
         if (weight <= goal) {
            
            System.out.println(weight + "kg�޼�!! �����մϴ�!");
            
            break;
         }
      }

      sc.close();
   }//end

}
