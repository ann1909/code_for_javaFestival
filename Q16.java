
public class Q16 {
	// ���� )
	// 1. ���ڿ��� �Է¹޾� 
	// 2. ���ĺ�������� �����Ͽ� 
	// 3. ��ȯ�ϴ� �޼ҵ带 �����Ͻÿ�. 
	// ��, ��ҹ��ڴ� �����Ѵ�.
   public static void main(String[] args) {

	  // 1. ���ڿ��� �Է¹޾�  
      System.out.println(reverseStr("ZAbcdVefEg"));
   }

   //reverseStr("ZAbcdVefEg") string�� �޾ƿ��� ������ (String �Ű�����)
   public static String reverseStr(String input) {
	  // 1. ���ڿ��� �Է¹޾�  
      int[] alpha = new int[input.length()];

      // 2. ���ĺ�������� �����Ͽ� 
      // 2-1. ���ĺ� ������� �����ϱ� ���� ���ĺ��� �ƽ�Ű�ڵ�� �ٲ㼭 �迭�� �ٽ� �����Ѵ�.
      // Z	A   b  c  d	  V  e   f  E  g
      // 90 65 98 99 100 86 101 102 69 103
      for (int i = 0; i < input.length(); i++) {
         alpha[i] = (int) input.charAt(i);
      }

      // 2-1. �ƽ�Ű�ڵ�� �ٲ� �迭�� ������ ���� ũ�Ⱑ ���� �� ���� �����Ѵ�. 
      // ���� ũ�Ⱑ ���� �ŷ� �����ϸ� ���������� �빮�ڷ� ���ĵǴ� ���� �� �� �ִ�.
      // ���� ����!!!!!
      // alpha.length = 10
      for (int j = 1; j < alpha.length; j++) {
    	 // j = 1; i = 0~9 
    	 // alpha.length - j�� ���� ������ �Ʒ�����
         for (int i = 0; i < alpha.length - j; i++) {
        	 // alpha[0]�� alpha[1] �� :  90 > 65
            if (alpha[i] > alpha[i + 1]) {
               // ���� ���� �ε���0������ �����ϰ�, ū ���� �ε��� 1������ ������ ����
               // ���� temp�� alpha[0]�� �����ϰ� 
               int temp = alpha[i];
               
               // alpha[0]�� alpha[1]���� �־ ���� ���� ������ ���� �Ѵ�. 
               alpha[i] = alpha[i + 1];
               
               // alpha[1]�� alpha[0]���� �־�� �ϴµ�
               // alpha[0]���� alpha[1]���� �� �ֱ� ������
               // alpha[0]�� ������ ���� temp�� �־��ش�.
               alpha[i + 1] = temp;
               
               // alpha[0] = 65, alpha[1] = 90 
    
            }
            ////////////////////////////////////////////////////
            // else�� ��� : alpha[i] < alpha[i + 1]
            
            // alpha[1]�� alpha[2] �� :  90 < 98
            // alpha[i] = alpha[i] : alpha[1] = 90
            // alpha[i+1] = alpha[i+1] : alpha[2] = 98
            // alpha[2]�� alpha[3] �� :  98 < 99
            // alpha[3]�� alpha[4] �� :  99 < 100
            
            // alpha[4]�� alpha[5] �� :  100 > 86
            // int temp = alpha[i];
            // int temp = alpha[4] 100;
            
            // alpha[i] = alpha[i + 1];
            // alpha[4] = alpha[5]; alpha[4] = 86
            
            // alpha[i + 1] = temp;
            // alpha[5] = 100;
            
            // 65, 90, 98, 99, 86, 100
            // ���� ū �� �ϳ��� ���� ���������� ���� ���� �� �� �ִ�.
            
            // i = 1 �϶� j = 0~9���� Ȯ���ϸ� alpha[0]���� alpha[9]���� �񱳸� �ϰ� ���� ū ���� ���������� ������
            // ���� alpha[9]�� ���� ū �� �̱⶧���� �� ��󿡼� ���� �Ѵ�
            // i = 2 �϶� j = 0~8 ���� Ȯ�� �ι�°�� ���� ū ���� �ε��� 8�� �ڸ��� �´�
            // i = 3 �϶� j = 0~7 ���� Ȯ�� ����°�� ���� ū ���� �ε��� 7�� �ڸ��� �´�
            // �̷��� ������������ ������ �ȴ�
            // alpha.length - j�� ���� ������ �ȴ�
         }
      }
      
      // 3. ��ȯ�ϴ� �޼ҵ带 �����Ͻÿ�.
      // 3-1. �޼ҵ� �ȿ��� �ƽ�Ű�ڵ� ������ ������ �ٽ� ���ڿ��� �ٲ㼭 ��ȯ�Ѵ�.
      
      // 3-2. ���ڿ��� �ٲ㼭 �ٽ� �� �ٷ� �����ϱ� ���� �� ���ڿ��� ������ش�.
      String result = "";
      
      for (int i = 0; i < input.length(); i++) {
    	 // 3-3. (char) ���ڿ��� ���� ����ȯ ���ش�
    	 // 3-4. �� ���ڿ��� �迭�� ���ʷ� �ִ´�
    	 // result = result + (char) alpha[i]
    	 // i = 0
    	 // result = "" + aplpha[0] A 65
    	 // i = 1
    	 // result = A + aplpha[1] E 69
    	 // i = 3
    	 // result = AE + aplpha[2] V 86  
         result += (char) alpha[i];
      }

      // 3-3. ����� ��ȯ���ش�.
      return result;
   }

}