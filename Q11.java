public class Q11 {
	// 문제 )
	// 아래와 같이 학생들의 성적정보가 문자열로 선언되었을때 
	// 각 성적 별 학생 수를 출력하시오
	// String score = "A,A,B,C,D,A,C,D,D,D,F"
    public static void main(String[] args) {
        String score = "A,A,B,C,D,A,C,D,D,D,F";

        // 각 성적 별 학생 수를 출력하시오
        // 성적 별 학생 수를 세어주는 것
        // 성적마다 값을 0으로 초기화 해주고 해당하는 성적이 있으면 +1로 카운트 해준다.
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        
        // charAt : index로 주어진 값에 해당하는 문자를 return해 준다
        // A , A , B , C , D , A  ,  C  ,  D  ,  D  ,  D  ,  F
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        for(int i = 0; i < score.length(); i++) {
        	// score[0], score[2], score[10]
            if(score.charAt(i) == 'A')
                // i = 0, 2, 10
            	a++;
            
            // score[4]
            else if(score.charAt(i) == 'B')
            	// i = 4
            	b++;
            
            // score[6], score[12]
            else if(score.charAt(i) == 'C')
                // i = 6, 12
            	c++;
            
            // score[8], score[14], score[16], score[18]
            else if(score.charAt(i) == 'D')
            	// i = 8, 14, 16, 18
            	d++;
            
            // score[20]
            else if(score.charAt(i) == 'F')
            	// i = 20
            	f++;
        }

        System.out.printf("A : %d명\nB : %d명\nC : %d명\nD : %d명\nF : %d명", a, b, c, d, f);
    }
}