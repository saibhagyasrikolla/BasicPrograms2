import java.util.Scanner;

//Reverse of a given number
public class ReverseNum {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int rem;
		int reverse = 0;
		System.out.println("The reverse of "+n+" is: ");
		while(n!=0) {
			rem = n%10;
			reverse = reverse*10+rem;
			n = n/10;
		}
		System.out.println(reverse);
	}

}
