import java.util.Scanner;

//Difference between sum of even and odd numbers
public class DiffofSumOfEvenOdd {

	public static void main(String[] args) {
		int a,n;
		System.out.println("Enter the First Value: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter the last value: ");
		n = sc.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		for(int i=a;i<=n;i++) {
			if(i%2 == 0) {
				sumEven += i;
			}
			else {
				sumOdd += i;
			}
		}
		System.out.println("The sum of Even numbers is "+sumEven);
		System.out.println("The sum of Odd numbers is "+sumOdd);
		int diff = Math.abs(sumEven-sumOdd);
		System.out.println("The difference between sum of even and odd numbers is: "+diff);
	}

}
