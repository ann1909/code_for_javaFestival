public class Q11 {
	// ���� )
	// �Ʒ��� ���� �л����� ���������� ���ڿ��� ����Ǿ����� 
	// �� ���� �� �л� ���� ����Ͻÿ�
	// String score = "A,A,B,C,D,A,C,D,D,D,F"
    public static void main(String[] args) {
        String score = "A,A,B,C,D,A,C,D,D,D,F";

        // �� ���� �� �л� ���� ����Ͻÿ�
        // ���� �� �л� ���� �����ִ� ��
        // �������� ���� 0���� �ʱ�ȭ ���ְ� �ش��ϴ� ������ ������ +1�� ī��Ʈ ���ش�.
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        
        // charAt : index�� �־��� ���� �ش��ϴ� ���ڸ� return�� �ش�
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

        System.out.printf("A : %d��\nB : %d��\nC : %d��\nD : %d��\nF : %d��", a, b, c, d, f);
    }
}