
public class Qº¸³Ê½º4 {

	public static void main(String[] args) {

		System.out.println(jumpCase(7));
	}

	public static int jumpCase(int i) {

		return i < 3 ? i : jumpCase(i - 2) + jumpCase(i - 1);

	}

}
