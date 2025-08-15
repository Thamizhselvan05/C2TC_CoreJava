package Day2;

public class Nested_For_Loop {
	public static void main(String[] args) {

		int start=10;
		int end=20;

		for (int i = start; i <= end; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();
}
	}

}
