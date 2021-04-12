public class Q13 {

	// 문제 )
	// 1. 정수형 변수 input을 선언하고 
	// 2. 피보나치 수열의 input번째 항까지 출력하시오.
   public static void main(String[] args) {

	  // 1. 정수형 변수 input을 선언하고 
      int input = 8;

      // 2. 피보나치 수열의 input번째 항까지 출력하시오.
      for (int i = 1; i <= input; i++) {
         System.out.print(fibo(i) + " ");
      }
   }

   // 피보나치 수열의 규칙성을 찾아서 메소드에 넣어준다
   // 첫 번째 수 + 두 번쨰 수 = 세 번째 수, 2번 + 3번 = 4번.....
   
   // fibo()의 값에 정수를 반환시켜줘야 한다
   public static int fibo(int i) {
//     if (i <= 2) {
//  	   return 1;
//  	} else {
//  	   	return fibo(i - 2) + fibo(i - 1);
// 		}
	   
	   // 넘어오는 값 i가 1일 때는 무조건 1을 반환하고, 
	   // i가 2일 때 부터 1 + 1 = fibo(0) + fibo(1)
	   // i가 3일 때 		1 + 2 = fibo(1) + fibo(2)
	   
	   // fibo()는 값을 저장하기 때문에 i보다 이전의 값이 저장되어 있어서 불러올 수 있다.
	   
	   // 조건 연산자 사용
	   // i 가 2보다 작거나 같으면? 1갑을 return : 그렇지 않으면 fibo(i - 2) + fibo(i - 1)를 return
      return i <= 2 ? 1 : fibo(i - 2) + fibo(i - 1);
         
   


      
  
   }

}