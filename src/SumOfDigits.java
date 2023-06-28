import java.util.Scanner;

//Sum of Digits of given number
public class SumOfDigits {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int num = n;
		int rem;
		int sum = 0;
		while(n!=0) {
			rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		System.out.println("The Sum of Digits of "+num+" is "+sum);
	}

}
