import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		int i = 1;
		while (i < n * 2) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

}

