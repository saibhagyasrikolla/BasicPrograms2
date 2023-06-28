import java.util.Scanner;

//Prime numbers between the user's given range
public class PrimeNums {

	public static void main(String[] args) {
		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		m = sc.nextInt();
		System.out.println("Enter the last number: ");
		n = sc.nextInt();
		for(int i=m;i<=n;i++) {
			boolean isPrime = true;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}
