import java.util.Scanner;

public class PalindromeOrNot {
//To check whether the given String is palindrome or not
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int rem;
		int palindrome = 0;
		int num = n;
		while(num!=0) {
			rem = num%10;
			palindrome = palindrome*10+rem;
			num = num/10;
		}
		if(n == palindrome) {
			System.out.println(n+" is Palindrome");
		}
		else {
			System.out.println(n+" is not a Palindrome");
		}

	}

}
