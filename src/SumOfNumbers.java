import java.util.Scanner;

//Sum of  all numbers from 1 to the user's given number 
public class SumOfNumbers {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the value of n:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int sum = 0;
		System.out.println("The sum of first "+n+" numbers is:");
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
