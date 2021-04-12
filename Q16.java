
public class Q16 {
	// 문제 )
	// 1. 문자열을 입력받아 
	// 2. 알파벳순서대로 정렬하여 
	// 3. 반환하는 메소드를 구현하시오. 
	// 단, 대소문자는 구분한다.
   public static void main(String[] args) {

	  // 1. 문자열을 입력받아  
      System.out.println(reverseStr("ZAbcdVefEg"));
   }

   //reverseStr("ZAbcdVefEg") string을 받아오기 때문에 (String 매개변수)
   public static String reverseStr(String input) {
	  // 1. 문자열을 입력받아  
      int[] alpha = new int[input.length()];

      // 2. 알파벳순서대로 정렬하여 
      // 2-1. 알파벳 순서대로 정렬하기 위해 알파벳을 아스키코드로 바꿔서 배열에 다시 저장한다.
      // Z	A   b  c  d	  V  e   f  E  g
      // 90 65 98 99 100 86 101 102 69 103
      for (int i = 0; i < input.length(); i++) {
         alpha[i] = (int) input.charAt(i);
      }

      // 2-1. 아스키코드로 바꾼 배열의 순서를 값의 크기가 작은 것 부터 정렬한다. 
      // 값의 크기가 작은 거로 정렬하면 오름차순과 대문자로 정렬되는 것을 알 수 있다.
      // 버블 정렬!!!!!
      // alpha.length = 10
      for (int j = 1; j < alpha.length; j++) {
    	 // j = 1; i = 0~9 
    	 // alpha.length - j를 쓰는 이유는 아래에서
         for (int i = 0; i < alpha.length - j; i++) {
        	 // alpha[0]과 alpha[1] 비교 :  90 > 65
            if (alpha[i] > alpha[i + 1]) {
               // 작은 값을 인덱스0번으로 오게하고, 큰 값을 인덱스 1번으로 보내기 위해
               // 변수 temp에 alpha[0]를 저장하고 
               int temp = alpha[i];
               
               // alpha[0]에 alpha[1]값을 넣어서 작은 수가 앞으로 오게 한다. 
               alpha[i] = alpha[i + 1];
               
               // alpha[1]에 alpha[0]값을 넣어야 하는데
               // alpha[0]에는 alpha[1]값이 들어가 있기 때문에
               // alpha[0]을 저장한 변수 temp를 넣어준다.
               alpha[i + 1] = temp;
               
               // alpha[0] = 65, alpha[1] = 90 
    
            }
            ////////////////////////////////////////////////////
            // else의 경우 : alpha[i] < alpha[i + 1]
            
            // alpha[1]과 alpha[2] 비교 :  90 < 98
            // alpha[i] = alpha[i] : alpha[1] = 90
            // alpha[i+1] = alpha[i+1] : alpha[2] = 98
            // alpha[2]과 alpha[3] 비교 :  98 < 99
            // alpha[3]과 alpha[4] 비교 :  99 < 100
            
            // alpha[4]과 alpha[5] 비교 :  100 > 86
            // int temp = alpha[i];
            // int temp = alpha[4] 100;
            
            // alpha[i] = alpha[i + 1];
            // alpha[4] = alpha[5]; alpha[4] = 86
            
            // alpha[i + 1] = temp;
            // alpha[5] = 100;
            
            // 65, 90, 98, 99, 86, 100
            // 제일 큰 수 하나만 제일 마지막으로 가는 것을 알 수 있다.
            
            // i = 1 일때 j = 0~9까지 확인하면 alpha[0]부터 alpha[9]까지 비교를 하고 제일 큰 수를 마지막으로 보낸다
            // 이제 alpha[9]는 제일 큰 수 이기때문에 비교 대상에서 제외 한다
            // i = 2 일때 j = 0~8 까지 확인 두번째로 제일 큰 수가 인덱스 8번 자리에 온다
            // i = 3 일때 j = 0~7 까지 확인 세번째로 제일 큰 수가 인덱스 7번 자리에 온다
            // 이렇게 오름차순으로 정렬이 된다
            // alpha.length - j를 쓰는 이유가 된다
         }
      }
      
      // 3. 반환하는 메소드를 구현하시오.
      // 3-1. 메소드 안에서 아스키코드 정렬을 했으니 다시 문자열로 바꿔서 반환한다.
      
      // 3-2. 문자열로 바꿔서 다시 한 줄로 나열하기 위해 빈 문자열을 만들어준다.
      String result = "";
      
      for (int i = 0; i < input.length(); i++) {
    	 // 3-3. (char) 문자열로 강제 형변환 해준다
    	 // 3-4. 빈 문자열에 배열을 차례로 넣는다
    	 // result = result + (char) alpha[i]
    	 // i = 0
    	 // result = "" + aplpha[0] A 65
    	 // i = 1
    	 // result = A + aplpha[1] E 69
    	 // i = 3
    	 // result = AE + aplpha[2] V 86  
         result += (char) alpha[i];
      }

      // 3-3. 결과만 반환해준다.
      return result;
   }

}