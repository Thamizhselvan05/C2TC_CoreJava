package Day2;

public class Decision_Making_With_Operation {
	public static void main(String[] args) {
		int x = 5, y = 10;
		int a = 12;
		int b = 11;

		if (x >= y) {
			System.out.println("X is greater than Y");
		} else {
			System.out.println("Y is Greater Than X");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}

}
