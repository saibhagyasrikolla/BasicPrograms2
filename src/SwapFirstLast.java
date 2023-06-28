import java.util.Scanner;

//To Swap First and Last digits of the User's given number 
public class SwapFirstLast {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		System.out.println("Before Swapping: "+n);
		int num = n;
		int digits = 0;
		while(num!=0) {
			num = num/10; 
			digits++;
		}
		int firstNum = n/(int) Math.pow(10,digits-1);
		int lastNum = n%10;
		
		int remaining = n%(int) Math.pow(10,digits-1);
		remaining /=10;
		int swap = lastNum*(int) Math.pow(10,digits-1)+remaining*10+firstNum;
		System.out.println("AfterSwapping: "+swap);
	}

}
