public class Q13 {

	// ���� )
	// 1. ������ ���� input�� �����ϰ� 
	// 2. �Ǻ���ġ ������ input��° �ױ��� ����Ͻÿ�.
   public static void main(String[] args) {

	  // 1. ������ ���� input�� �����ϰ� 
      int input = 8;

      // 2. �Ǻ���ġ ������ input��° �ױ��� ����Ͻÿ�.
      for (int i = 1; i <= input; i++) {
         System.out.print(fibo(i) + " ");
      }
   }

   // �Ǻ���ġ ������ ��Ģ���� ã�Ƽ� �޼ҵ忡 �־��ش�
   // ù ��° �� + �� ���� �� = �� ��° ��, 2�� + 3�� = 4��.....
   
   // fibo()�� ���� ������ ��ȯ������� �Ѵ�
   public static int fibo(int i) {
//     if (i <= 2) {
//  	   return 1;
//  	} else {
//  	   	return fibo(i - 2) + fibo(i - 1);
// 		}
	   
	   // �Ѿ���� �� i�� 1�� ���� ������ 1�� ��ȯ�ϰ�, 
	   // i�� 2�� �� ���� 1 + 1 = fibo(0) + fibo(1)
	   // i�� 3�� �� 		1 + 2 = fibo(1) + fibo(2)
	   
	   // fibo()�� ���� �����ϱ� ������ i���� ������ ���� ����Ǿ� �־ �ҷ��� �� �ִ�.
	   
	   // ���� ������ ���
	   // i �� 2���� �۰ų� ������? 1���� return : �׷��� ������ fibo(i - 2) + fibo(i - 1)�� return
      return i <= 2 ? 1 : fibo(i - 2) + fibo(i - 1);
         
   


      
  
   }

}