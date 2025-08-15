package Day2;

public class Nested_if_Else {
	public static void main(String[] args) {
		int a=35, b=100, c=40;
		System.out.println("The largest number is");
		if (a > b) {
			if (a > c)
				System.out.println(a);
			else
				System.out.println(c);
		} else {
			if (c > b)
				System.out.println(c);
			else
				System.out.println(b);
}
	}

}
