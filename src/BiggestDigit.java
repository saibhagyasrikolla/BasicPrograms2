import java.util.Scanner;

//Sum of Digits of given number
public class BiggestDigit {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int num = n;
		int currentDigit;
		int maxDigit = 0;
		while(n!=0) {
			currentDigit = n%10;
			if(currentDigit>maxDigit) {
				maxDigit = currentDigit;
			}
			n = n/10;
		}
		System.out.println("The biggest digit in "+num+" is "+maxDigit);
	}

}
