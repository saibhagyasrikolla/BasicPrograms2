import java.util.Scanner;

//To Print Individual Digits of a number
public class IndividualDigits {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int rem;
		while(n>0) {
			rem = n%10;
			System.out.println(rem);
			n = n/10;
		}
	}

}
