import java.util.Random;

public class Q10 {
	// ���� )
	// 1. 8ĭ ũ���� �迭�� �����ϰ� 
	// 2. �������� �ʱ�ȭ �� �� 
	// 3. ���� ū ���� ���� ���� ���� ����Ͻÿ�
   public static void main(String[] args) {
	  // 1. 8ĭ ũ���� �迭�� �����ϰ� 
	  int[] array = new int[8];
      
	  // 2. �������� �ʱ�ȭ �� ��
	  // 2-1. ���� ���̺귯�� ����
	  Random rd = new Random();

	  // 2-2. �迭 ����� ��� ���� �ۼ� 
      System.out.print("�迭�� �ִ� ��� �� : ");
      
      // 2-3. �������� �ʱ�ȭ�� ���� �迭�� �ϳ��� �ֱ�
      for (int i = 0; i < array.length; i++) {
          // 1���� 100����
    	  array[i] = rd.nextInt(100) + 1;
         
    	 // 2-4. �迭�� �ִ� �� ���
         System.out.print(array[i] + " ");
      }

      // 3. ū ���� ���� ���� ���� ����Ͻÿ�.
      // 3-1. �迭 �ȿ��� ū �� ���� ���� ����ϱ� ���� �迭�� ��ҳ��� ���ؾ��Ѵ�
      // �񱳴�� ���ϱ�
      int max = array[0];
      int min = array[0];

      // 3-2. �迭 ��ҳ��� ���ϱ�
      for (int i = 0; i < array.length; i++) {

    	 // 3-3. ���� �����ڸ� �̿��� ���� ���ϱ�
    	 // ���ǿ����� : ���ǽ� ? true�� : false��
    	 // ex) max�� array[i]���� ũ�ų� ���ٸ� ���� max�� max���� �ְ�,
    	 //		max�� array[i]���� �۴ٸ� ���� max�� array[i]���� �ִ´�.
         max = max >= array[i] ? max : array[i];
         min = min <= array[i] ? min : array[i];
  
         // if������ Ǭ�ٸ�!
//         if (max < array[i]) {
//        	 max = array[i];
//         }
//         
//         if (min > array[i]) {
//        	 min = array[i];
//         }
      }

      // 3-4. ���� ū ���� ���� �� ���.
      System.out.println();
      System.out.println("���� ū �� : " + max);
      System.out.println("���� ���� �� : " + min);
   }

}