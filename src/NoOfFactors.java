import java.util.Scanner;

//To print the no.of factors of a given number
public class NoOfFactors {

	public static void main(String[] args) {
		int n;
		int count = 0; 
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				count = count+1;
			}
		}
		System.out.println("The no.of Factors of "+n+" are: "+count);
	}

}
