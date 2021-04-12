public class Q보너스1 {

   public static void main(String[] args) {

      String[] names = { "Queen", "Tod", "Kim" };
      
      System.out.println("김서방은 " + findKim(names) + "에 있다.");
   }

  
   public static int findKim(String[] names) {
	 
	  int location = 0;
      for (int i = 0; i < names.length; i++) {
    	 
         if (names[i] == "Kim")
            location = i + 1;
      }
      return location;

   }

}