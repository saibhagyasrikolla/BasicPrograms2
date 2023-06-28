import java.util.Scanner;

//To check whether the given number is Armstrong or not

public class ArmstrongOrNot {

	public static void main(String[] args) {
		int n,len = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int num = n;
		while(n>0) {
			n = n/10;
			len++;
		}
		int armstrong = 0;
		int rem;
		n = num;
		while(n>0) {
			rem = n%10;
			armstrong += Math.pow(rem,len);
			n = n/10;
		}
		if(num == armstrong) {
			System.out.println(num+" is an Armstrong Number");
		}
		else {
			System.out.println(num+" is not an Armstrong Number");
		}
	}

}
