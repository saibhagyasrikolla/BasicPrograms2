import java.util.Scanner;

//Multiplication Table
public class MultiplicationTable {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		System.out.println("The multiples of "+n+" are ");
		for(int i=1;i<=12;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}

}

