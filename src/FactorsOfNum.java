import java.util.Scanner;

//To print the factors of a given number
public class FactorsOfNum {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("The Factors of "+n+" are:");
		
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
	}

}
