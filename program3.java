import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int val = n % 2 != 0 ? n : n - 1;

		int i = 0;
		do {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i < val * 2);
	}
}

    

